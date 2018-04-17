package com.infotech.client;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ClientTest2 {
    public static void main(String[] args) {
        File propFile = new File("");
        try{
            readFile(propFile);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
    private static void readFile(File fileName) throws FileNotFoundException, 
     EOFException, IllegalArgumentException{
        if(fileName == null || fileName.getPath().equals("")){
            throw new IllegalArgumentException("File Name not given");
        }
        InputStream in = new FileInputStream(fileName);  
        //Rest of the code goes here
    }
}