package com;

//import com.sun.xml.internal.ws.api.model.ExceptionType;

public class MoodAnalyserException extends Exception{
    public String message;
    public ExceptionType type;
    public MoodAnalyserException(ExceptionType type,String message)
    {
        super(message);
        this.message=message;
        this.type=type;
    }
    public enum ExceptionType
    {
        entered_EmptyMood,
        entered_NullMood,
        method_NotFound;
    }

}
