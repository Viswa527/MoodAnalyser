package com;

public class MoodAnalyser {
    public boolean analyseMood(String message)
    {
        if(message.contains("Happy"))
        {
            return true;
        }
        else if(message.contains("Sad"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
