package utils;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by lePetitBidouilleur on 19/02/15.
 */
public class ConvertorTest {


    @Test
    public void asciiCodeToCharTest(){
        int i = 33;
        char c = Convertor.asciiCodeToChar(i);
        Assert.assertEquals('!', c);
    }

    @Test
    public void charToAsciiCodeTest(){
        char c = '!';
        int i = Convertor.charToAsciiCode(c);
        Assert.assertEquals(33, i);
    }
}
