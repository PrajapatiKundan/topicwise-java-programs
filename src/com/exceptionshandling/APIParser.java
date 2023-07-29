package com.exceptionshandling;

public class APIParser {
    public static int parseSendResponseCode(String response) throws APIFormatChangeException {
        int responseCode = -1;

        try {
            String startTag = "<code>";
            String endTag = "</code>";

            if (response.contains(startTag)) {
                int beginIndex = response.indexOf(startTag) + startTag.length();
                int endIndex = response.indexOf(endTag);

                System.out.println("Code: " + response.substring(beginIndex, endIndex));

                responseCode = Integer.parseInt(response.substring(beginIndex, endIndex));
            }
        } catch (NumberFormatException e) {
            throw new APIFormatChangeException("Response: " + response + ", Element: code");
        }
        return responseCode;
    }
}
