import com.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTesting {
    @Test
    public void givenMessage_ContainsHappyMood_ReturnsTrue()
    {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Sad Mood");
        Assert.assertEquals("Sad",mood);
    }

}
