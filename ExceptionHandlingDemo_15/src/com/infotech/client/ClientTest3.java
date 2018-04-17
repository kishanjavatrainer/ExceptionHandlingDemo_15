package com.infotech.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ClientTest3 {
    public static void main(String[] args) {
        File propFile = new File("");
        readFile(propFile);        
    }
    
    private static void readFile(File fileName) {
        InputStream in = null;
        try {
            in = new FileInputStream(fileName);
            //Rest of the code goes here
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
    }
}
