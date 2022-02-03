package Domaci2701;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Brojevi {
    public static void main(String[] args) throws IOException {

        File file = new File("/Users/draganamitrovic/Brojevi.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("Brojevi");
        XSSFRow row = sheet.getRow(1);
        XSSFCell cell = row.getCell(0);

        double suma = 0;

        System.out.println("\nSvi brojevi iz kolone su: ");

        for (int i = 1; i <= wb.getSheet("Brojevi").getLastRowNum(); i++) {
            double vrednostBroja = sheet.getRow(i).getCell(0).getNumericCellValue();
            System.out.println(vrednostBroja);
            suma += vrednostBroja;
        }

        System.out.println("\nSuma svih brojeva iz kolone je = " + suma);
        System.out.println("\n*** Kraj programa ***");
    }
}


