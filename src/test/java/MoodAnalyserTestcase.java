import com.MoodAnalyser;
import com.MoodAnalyserFactory;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class MoodAnalyserTestcase {
    @Test
    public void givenMood_IsHappy_ReturnsHAppy() {
        Constructor<?> constructor = null;
        try {
            constructor = Class.forName("com.MoodAnalyser").getConstructor();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Object myobj = constructor.newInstance("I am in HAPPY Mood");
            MoodAnalyser moodAnalyser = (MoodAnalyser) myobj;
            String mood = moodAnalyser.analysisMethod();
            Assert.assertEquals("Happy", mood);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMoodAnalyser_WhenProper_ReturnsObject() {
        MoodAnalyser moodAnalyser = MoodAnalyserFactory.createMoodAnalyesrClass("I am in Happy Mood");
        try {
            String mood = moodAnalyser.analysisMethod();
            Assert.assertEquals("Happy", mood);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMoodAnalyser_WhenProper_ReturnObject() {
        MoodAnalyser moodAnalyser = MoodAnalyserFactory.createMoodAnalyesrClass("I am in Happy mood");
        Assert.assertEquals(new MoodAnalyser("I am in Happy mood"), moodAnalyser);
    }

    @Test
    public void givenMoodAnalyser_WhenItIsProper_ReturnsObject() {
        Constructor<?> constructor = null;
        try {
            constructor = Class.forName("com.MoodAnalyser").getConstructor();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Object myobj = constructor.newInstance("I am in HappyMood");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

