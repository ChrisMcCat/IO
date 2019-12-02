package com.infoshare.jjdd8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilosc lini:");
        int value = scanner.nextInt();
        System.out.println("Podales: " + value);

        System.out.println("Podaj nazwe pliku: ");
        String line = scanner.next();

        File file = new File(line);

        PrintStream out = getFilePrintStream(file);


        out.println(value);
        out.close();


        scanner.close();

    }


    private static PrintStream getFilePrintStream(File file) throws FileNotFoundException {
        FileOutputStream outputStream =
                file.exists() && file.isFile() ? new FileOutputStream(file, true) : new FileOutputStream(file, false);

        return new PrintStream(outputStream);
    }
}
