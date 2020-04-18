import com.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTesting {
    @Test
    public void givenMessage_ContainsHappyMood_ReturnsTrue()
    {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        boolean mood = moodAnalyser.analyseMood("I am in Happy Mood");
        Assert.assertEquals(true,true);
    }
    @Test
    public void givenMessage_ContainsHappyMood_ReturnTrue()
    {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        boolean mood = moodAnalyser.analyseMood("I am in Sad Mood");
        Assert.assertEquals(false,false);
    }
}
