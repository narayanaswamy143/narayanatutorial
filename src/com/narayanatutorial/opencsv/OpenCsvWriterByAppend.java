/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.narayanatutorial.opencsv;

import au.com.bytecode.opencsv.CSVWriter;
import java.io.FileWriter;

/**
 *
 * @author rbns
 */
public class OpenCsvWriterByAppend {

    public static void main(String args[]) {
                String csvFilename = "D:/narayanatutorial/SampleFiles/OpenCSVWriteByAppend.csv";
        try {

            FileWriter csvwriter = new FileWriter(csvFilename);
            String[] profile = "Narayana,Ragi,'12345678901234569870".split(",");
            csvwriter.append("FIRSTNAME");
            csvwriter.append(",");
            csvwriter.append("LASTNAME");
            csvwriter.append(",");
            csvwriter.append("AGE");
            csvwriter.append(",");
            csvwriter.append("\n");

            csvwriter.append("Narayana");
            csvwriter.append(",");
            csvwriter.append("Ragi");
            csvwriter.append(",");
            csvwriter.append("'300000000000");
            csvwriter.append(",");
            csvwriter.append("\n");
            csvwriter.close();
            System.out.println("CSV file created succesfully.");
        } catch (Exception e) {
            System.out.println("exception :" + e.getMessage());
        }

    }
}
