package com.syntax;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo3 {
    public static void main(String[] args) throws IOException {
        String path= "/Users/chrisva/Batch12/Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xlsx=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xlsx.getSheet("Sheet1");
        //System.out.println(xlsx.getSheet("Sheet1"));

        for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
            Row row = sheet.getRow(i);
            for(int j=0; j<row.getPhysicalNumberOfCells();j++){
                Cell cell=row.getCell(j);
                System.out.println(cell+" ");
            }


            System.out.println();
        }
    }
}


