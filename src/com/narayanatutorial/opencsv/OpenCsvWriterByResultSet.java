/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.narayanatutorial.opencsv;

import au.com.bytecode.opencsv.CSVWriter;
import java.io.FileWriter;
import java.sql.ResultSet;

/**
 *
 * @author rbns
 */
public class OpenCsvWriterByResultSet {

    public static void main(String args[]) {
                String csvFilename = "D:/narayanatutorial/SampleFiles/OpenCSVWriteByResultSet.csv";
        try {
            DatabaseConnection dbcon=new DatabaseConnection();
            CSVWriter writer = new CSVWriter(new FileWriter(csvFilename));
            String[] header="FIRSTNAME,LASTNAME,AGE".split(",");
            writer.writeNext(header);
            dbcon.CreateConnection();
            ResultSet rs=dbcon.getData();
            writer.writeAll(rs, true); //And the second argument is boolean which represents whether you want to write header columns (table column names) to file or not.
            writer.close();
            dbcon.closeConnections();
            System.out.println("CSV file created succesfully.");
        } catch (Exception e) {
            System.out.println("exception :" + e.getMessage());
        }

    }
}
