package encoding.cesar;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Loïc on 14/10/2017.
 */
public class CesarCipherTest {


    @Test
    public void oneStringTest(){
        String s = "a";
        CesarCipher cc = new CesarCipherImpl();
        String res =cc.encryptor(s, 3);
        System.out.println("Cesar encryption of \"a\" with shifter of 3 : "+res);
        Assert.assertEquals("d", res);
    }

    @Test
    public void lastCharacterTest(){
        String s = "z";
        CesarCipher cc = new CesarCipherImpl();
        String res =cc.encryptor(s, 3);
        System.out.println("Cesar encryption of \"z\" with shifter of 3 : "+res);
        Assert.assertEquals("#", res);
    }

    @Test
    public void stringTest(){
        String s = "az";
        CesarCipher cc = new CesarCipherImpl();
        String res =cc.encryptor(s, 3);
        System.out.println("Cesar encryption of \"az\" with shifter of 3 : "+res);
        Assert.assertEquals("d#", res);
    }
}
