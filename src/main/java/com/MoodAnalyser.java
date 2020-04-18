package com;
public class MoodAnalyser
{
    public  String analysingMood(String message)throws MoodAnalyserException {
        try {
            if (message.contains("Sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        }
        catch (NullPointerException e)
        {
            throw new MoodAnalyserException("Invalid");
        }

    }
}
