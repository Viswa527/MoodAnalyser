package com;

import sun.awt.HKSCS;

public class MoodAnalyser
{

    public MoodAnalyser(Object o) {
    }
    public static String analysingMood(String message) throws MoodAnalyserException {
        if(message.contains("Sad"))
        {
            return "Sad";
        }
        else if (message.length()==0)
            {
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.entered_EmptyMood,"entered_EmptyMood");
            }
            else
        {
            return "Happy";
        }
    }
}