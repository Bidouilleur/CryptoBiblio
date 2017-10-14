package encoding.cesar;

import decoding.cesar.CesarDecoder;
import decoding.cesar.CesarDecoderImpl;
import org.junit.Test;

/**
 * Created by Loïc on 14/10/2017.
 */
public class CesarDecoderTest {

    @Test
    public void oneCharTest(){
        String data = "defgh";
        CesarDecoder cd = new CesarDecoderImpl();
        String res = cd.decryptor(data, 3);
        System.out.println("Decoder for data : "+data+ " : "+res);
    }
}
