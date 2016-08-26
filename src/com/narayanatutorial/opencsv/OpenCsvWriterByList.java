/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.narayanatutorial.opencsv;

import au.com.bytecode.opencsv.CSVWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rbns
 */
public class OpenCsvWriterByList {

    public static void main(String args[]) {
                String csvFilename = "D:/narayanatutorial/SampleFiles/OpenCSVWriteByList.csv";
        try {
            CSVWriter writer = new CSVWriter(new FileWriter(csvFilename));
            List<String[]> csvData = new ArrayList<String[]>();
            String[] profile = "Narayana,Ragi,'12345678901234569870".split(",");
            String[] header="FIRSTNAME,LASTNAME,AGE".split(",");
            csvData.add(header);
            csvData.add(profile);
            
            writer.writeAll(csvData);
            writer.close();
            System.out.println("CSV file created succesfully.");
        } catch (Exception e) {
            System.out.println("exception :" + e.getMessage());
        }

    }
}
