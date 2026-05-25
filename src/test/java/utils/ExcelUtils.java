package utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    public static String getCellData(String path,
                                     String sheetName,
                                     int rowNum,
                                     int cellNum) {

        String data = "";

        try {

            FileInputStream fis = new FileInputStream(path);

            XSSFWorkbook workbook = new XSSFWorkbook(fis);

            XSSFSheet sheet = workbook.getSheet(sheetName);

            data = sheet.getRow(rowNum)
                        .getCell(cellNum)
                        .getStringCellValue();

            workbook.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return data;
    }
}