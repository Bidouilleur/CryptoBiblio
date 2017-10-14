package encryption.cesar;

import decryption.cesar.CesarDecryption;
import decryption.cesar.CesarDecryptionImpl;
import org.junit.Test;

/**
 * Created by Loïc on 14/10/2017.
 */
public class CesarDecryptionTest {

    @Test
    public void oneCharTest(){
        String data = "defgh";
        CesarDecryption cd = new CesarDecryptionImpl();
        String res = cd.decryptor(data, 3);
        System.out.println("Decoder for data : "+data+ " : "+res);
    }
}
