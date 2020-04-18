import com.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTesting {
    @Test
    public void givenMessage_ContainsSadMood_ReturnsTrue()
    {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Sad Mood");
        Assert.assertEquals("Sad",mood);
    }
    @Test
    public void givenMessage_ContainsHappyMood_ReturnTrue()
    {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Happy Mood");
        Assert.assertEquals("Happy",mood);
    }
    @Test
    public void givenMessage_ContainsAnyMood_ReturnsTrue()
    {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Any Mood");
        Assert.assertEquals("Happy",mood);
    }

}
