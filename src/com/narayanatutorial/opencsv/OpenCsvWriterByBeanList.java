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
public class OpenCsvWriterByBeanList {

    public static void main(String args[]) {
                String csvFilename = "D:/narayanatutorial/SampleFiles/OpenCSVWriteByBeanList.csv";
                String Comma=",";
                String newLine="\n";
        try {
            FileWriter writer = new FileWriter(csvFilename);
            Profile profile0=new Profile();
            profile0.setFirstName("FIRSTNAME");
            profile0.setLastName("LASTNAME");
            profile0.setAge("AGE");

            Profile profile1=new Profile();
            profile1.setFirstName("Narayana");
            profile1.setLastName("Ragi");
            profile1.setAge("30");

            Profile profile2=new Profile();
            profile2.setFirstName("Kumar");
            profile2.setLastName("Chitra");
            profile2.setAge("40");

            Profile profile3=new Profile();
            profile3.setFirstName("Swamy");
            profile3.setLastName("Bathala");
            profile3.setAge("30");

            List<Profile> csvData = new ArrayList<Profile>();
            csvData.add(profile0);
            csvData.add(profile1);
            csvData.add(profile2);
            csvData.add(profile3);

            for(Profile profile:csvData){
                writer.append(profile.getFirstName());
                writer.append(Comma);
                writer.append(profile.getLastName());
                writer.append(Comma);
                writer.append(profile.getAge());
                writer.append(newLine);
            }
            writer.close();
            System.out.println("CSV file created succesfully.");
        } catch (Exception e) {
            System.out.println("exception :" + e.getMessage());
        }

    }
}
