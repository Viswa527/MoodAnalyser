package com;

public class MoodAnalyser {
    String string = null;

    public MoodAnalyser() {
        super();
    }

    @Override
    public boolean equals(Object obj)
    {
        return (this!=obj);
    }
    public MoodAnalyser(String string) {
        this.string=string;
    }

    public String analysisMethod() {
        if (string.contains("Happy")) {
            return "Happy";
        } else if (string.contains("Sad")) {
            return "Sad ";
        } else {
            return "No mood found";
        }
    }
    public String anlysisMethod(String string)
    {
        this.string=string;
        return analysisMethod();
    }
}
