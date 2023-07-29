package com.exceptionshandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CustomHttpConnect {
    /*
    * Throws IllegalArgumentException if trigger has value < 0 or > 1
    *
    * */

    public static String send(int trigger) throws IOException {
        System.out.println("Inside send");
        String response = "success";

        if(trigger < 0 || trigger >1) {
            throw new IllegalArgumentException(); // Unchecked exception
        }

        if (trigger == 0) {
            throw new FileNotFoundException();
        } else if (trigger == 1) {
            response = "<result><code>Success</code></result>";
        }

        return response;
    }
}
