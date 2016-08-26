/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.narayanatutorial.opencsv;

import au.com.bytecode.opencsv.CSVReader;
import java.io.FileReader;

/**
 *
 * @author rbns
 */
public class OpenCsvReadLineByLine {

    public static void main(String args[]) {
       String csvFilename = "D:/narayanatutorial/SampleFiles/OpenCSVRead.csv";
        try {
            CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
            String[] csvrow = null;
            while ((csvrow = csvReader.readNext()) != null) {
                System.out.println(csvrow[0]
                        + " # " + csvrow[1]
                        + " #  " + csvrow[2]);
            }
        } catch (Exception e) {
            System.out.println("exception :" + e.getMessage());
        }

    }
}
