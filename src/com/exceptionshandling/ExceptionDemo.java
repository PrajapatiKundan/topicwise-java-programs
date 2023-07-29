package com.exceptionshandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {
    public static void share() {
        System.out.println("Inside share...");
        try {
            String response = CustomHttpConnect.send(1);
            APIParser.parseSendResponseCode(response);
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception generated");
        } catch (IOException e) {
            System.out.println("IOException generated");
        } catch (APIFormatChangeException e) {
            //System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        System.out.println("End of share...");
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Inside main...");
        share();
        System.out.println("End of main...");
    }
}
