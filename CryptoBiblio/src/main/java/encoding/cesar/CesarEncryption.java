package encoding.cesar;

/**
 * Created by lePetitBidouilleur on 19/02/15.
 */
public interface CesarEncryption {

    /**
     * This method is for encrypt data with Cesar method.
     * All characters or digit is represented by ascii code.
     * In this method we shit the value of this ascii representation.
     * This method manage all characters or digit where ascii representation
     * is between 33 and 122.
     * @param data
     * @return
     */
    String encryptor (String data, int shifter);

}
