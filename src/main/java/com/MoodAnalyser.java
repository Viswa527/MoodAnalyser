package com;

public class MoodAnalyser {
    String message = null;
    public MoodAnalyser(String message) {
        this.message=message;
    }

    public MoodAnalyser() {
    }

    public String analyseMood()
    {
        if(message.contains("Happy")) {
            return "Happy";
        }
        return "Sad";
    }
    public String analyseMood(String message)
    {
        this.message=message;
        return analyseMood();
    }
}
