pipeline {

    agent any

    stages {

        stage('Checkout') {

            steps {

                git 'YOUR_GITHUB_REPOSITORY_URL'
            }
        }

        stage('Build') {

            steps {

                bat 'mvn clean test'
            }
        }

        stage('Generate Reports') {

            steps {

                echo 'Reports Generated'
            }
        }
    }
}