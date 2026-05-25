FROM maven:3.9.6-eclipse-temurin-17

WORKDIR /app

# Install required packages
RUN apt-get update && apt-get install -y \
    wget \
    unzip \
    curl \
    gnupg

# Install Chrome
RUN wget -q -O - https://dl.google.com/linux/linux_signing_key.pub | gpg --dearmor -o /usr/share/keyrings/google.gpg

RUN echo "deb [arch=amd64 signed-by=/usr/share/keyrings/google.gpg] http://dl.google.com/linux/chrome/deb/ stable main" > /etc/apt/sources.list.d/google.list

RUN apt-get update && apt-get install -y google-chrome-stable

COPY pom.xml .

RUN mvn dependency:go-offline -B

COPY . .

RUN mvn clean test-compile

CMD ["mvn", "test"]