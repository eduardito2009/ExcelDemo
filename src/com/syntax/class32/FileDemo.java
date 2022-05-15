package com.syntax.class32;

import sun.applet.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) throws FileNotFoundException {
        String path="src/com/syntax/class32/FileDemo";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }

    }
}
