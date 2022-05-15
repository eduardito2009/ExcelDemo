package com.syntax;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.w3c.dom.stylesheets.LinkStyle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;

public class ExcelDemo2 {
    public static void main(String[] args) throws IOException {
        String path= "/Users/chrisva/Batch12/Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xlsx=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xlsx.getSheet("Sheet1");
        //System.out.println(xlsx.getSheet("Sheet1"));

        System.out.println(sheet.getRow(0).getCell(0)+" ");
        System.out.println(sheet.getRow(0).getCell(1));


        System.out.println(sheet.getRow(1).getCell(0)+" ");
        System.out.println(sheet.getRow(1).getCell(1));

        System.out.println(sheet.getRow(2).getCell(0)+" ");
        System.out.println(sheet.getRow(2).getCell(2));



    }
}
