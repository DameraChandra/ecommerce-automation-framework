package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelUtils {

    public static String getCellData(int row, int col) {

        String path =
                "src/test/resources/testdata/LoginData.xlsx";

        try {

            FileInputStream fis =
                    new FileInputStream(path);

            XSSFWorkbook workbook =
                    new XSSFWorkbook(fis);

            XSSFSheet sheet =
                    workbook.getSheet("Sheet1");

            String data =
                    sheet.getRow(row)
                            .getCell(col)
                            .toString();

            workbook.close();

            return data;

        } catch (Exception e) {

            e.printStackTrace();
        }

        return "";
    }
}