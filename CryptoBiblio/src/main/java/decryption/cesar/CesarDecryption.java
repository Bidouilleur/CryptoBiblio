package decryption.cesar;

/**
 * Created by Loïc on 14/10/2017.
 */
public interface CesarDecryption {

    /**
     * This method is for decrypt data with Cesar method.
     * All characters or digit is represented by ascii code.
     * In this method we shit the value of this ascii representation.
     * This method manage all characters or digit where ascii representation
     * is between 33 and 122.
     * @param data
     * @return
     */
    String decryptor (String data, int shifter);
}
