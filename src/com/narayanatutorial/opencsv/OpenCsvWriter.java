/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.narayanatutorial.opencsv;

import au.com.bytecode.opencsv.CSVWriter;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author rbns
 */
public class OpenCsvWriter {

    public static void main(String args[]) {
                String csvFilename = "D:/narayanatutorial/SampleFiles/OpenCSVWrite.csv";
        try {
            
            CSVWriter writer = new CSVWriter(new FileWriter(csvFilename));
            String[] profile = "Narayana,Ragi,'12345678901234569870,''".split(",");
            String[] header="FIRSTNAME,LASTNAME,AGE".split(",");
            writer.writeNext(header);
            writer.writeNext(profile);
            writer.close();
            System.out.println("CSV file created succesfully.");
            DateFormat  dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
            Date date = new Date();
            System.out.println("YBL-BS-"+dateFormat.format(date));
        } catch (Exception e) {
            System.out.println("exception :" + e.getMessage());
        }

    }
}
