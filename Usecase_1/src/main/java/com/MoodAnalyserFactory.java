package com;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.lang.reflect.Constructor;

public class MoodAnalyserFactory
{
    public static MoodAnalyser createMoodAnalyesrClass(String string)
    {
        try
        {
            Class<?>moodAnalyserClass = Class.forName("com.MoodAnalyser");
            Constructor<?>moodConstructor = moodAnalyserClass.getConstructor(String.class);
            Object moodObject = moodConstructor.newInstance(string);
            return (MoodAnalyser)moodObject;
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (NoSuchMethodException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
