import com.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTesting {
    @Test
    public void givenMessage_ContainsHappyMood_ReturnsHappy()
    {
        MoodAnalyser moodAnalyser=new MoodAnalyser("I am in Happy Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("Happy",mood);
    }

}
