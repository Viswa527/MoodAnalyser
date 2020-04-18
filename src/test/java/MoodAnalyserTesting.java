import com.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTesting {
    @Test
    public void givenMessage_ContainsSadMood_ReturnsTrue()
    {
        MoodAnalyser moodAnalyser=new MoodAnalyser("I am in Sad Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("Sad",mood);
    }
    
}
