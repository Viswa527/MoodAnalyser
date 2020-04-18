import com.MoodAnalyser;
import com.MoodAnalyserException;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTesting {
    @Test
    public void givenMessage_IsNull_ReturnsHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser =new MoodAnalyser();
        String mood = moodAnalyser.analysingMood("Happy");
        Assert.assertEquals("Happy",mood);
    }
}
