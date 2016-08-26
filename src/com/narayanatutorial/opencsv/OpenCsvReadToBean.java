/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.narayanatutorial.opencsv;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;
import java.io.FileReader;
import java.util.List;

/**
 *
 * @author rbns
 */
public class OpenCsvReadToBean {

    public static void main(String args[]) {
        String csvFilename = "D:/narayanatutorial/SampleFiles/OpenCSVRead.csv";
        try {

            ColumnPositionMappingStrategy cpm = new ColumnPositionMappingStrategy();
            cpm.setType(Profile.class);
            String[] csvcolumns = new String[]{"firstName", "lastName", "age"};
            cpm.setColumnMapping(csvcolumns);

            CsvToBean csvtobean = new CsvToBean();

            CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
            
            List csvDataList = csvtobean.parse(cpm, csvReader);
            for (Object dataobject : csvDataList) {
                Profile profile = (Profile) dataobject;
                System.out.println("Firstname:"+profile.getFirstName()+" LastName:"+profile.getLastName()+" Age:"+profile.getAge());
            }
        } catch (Exception e) {
            System.out.println("exception :" + e.getMessage());
        }

    }
}
