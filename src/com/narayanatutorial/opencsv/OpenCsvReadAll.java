/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.narayanatutorial.opencsv;

import au.com.bytecode.opencsv.CSVReader;
import java.io.FileReader;
import java.util.List;

/**
 *
 * @author rbns
 */
public class OpenCsvReadAll {

    public static void main(String args[]) {
        String csvFilename = "D:/narayanatutorial/SampleFiles/OpenCSVRead.csv";
        String[] csvRow = null;
        try {
            CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
            //If you want to parse a file with other delimiter like semicolon (;) or hash (#), you can do so by calling a different constructor of CSVReader class:
            //CSVReader csvReader = new CSVReader(new FileReader(csvFilename), ';');
            //CSVReader csvReader = new CSVReader(new FileReader(csvFilename), ',');
            //CSVReader csvReader = new CSVReader(new FileReader(csvFilename), '#');
            //CSV file’s value is quoted with single quote (‘) instead of default double quote (“)
           // CSVReader csvReader = new CSVReader(new FileReader(csvFilename), ',', '\'');
            //reader will skip 5 lines from top of CSV and starts processing at line 6
            //CSVReader csvReader = new CSVReader(new FileReader(csvFilename), ',', '\'', 1);
            List<String[]> csvAllRows = csvReader.readAll();
            for (Object object : csvAllRows) {
                csvRow = (String[]) object;

                System.out.println(csvRow[0] + " # " + csvRow[1] + " #  " + csvRow[2]);
            }
        } catch (Exception e) {
            System.out.println("exception :" + e.getMessage());
        }

    }
}
