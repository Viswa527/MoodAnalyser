import com.MoodAnalyser;
import com.MoodAnalyserException;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTesting {


    @Test
    public void givenMessage_ContainsEmpty_ThrowsEmptyMood() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser =new MoodAnalyser("");
        MoodAnalyserException exception = null;
        try {
            MoodAnalyser.analysingMood("");
        }
        catch (MoodAnalyserException moodAnalyserException)
        {
            exception = moodAnalyserException;
        }
        Assert.assertEquals(com.MoodAnalyserException.ExceptionType.entered_EmptyMood,exception.type);
    }

}
