package encoding.cesar;

import utils.Convertor;

/**
 * Created by loic on 19/02/15.
 */
public class CesarEncryptionImpl implements CesarEncryption {


    /**
     * For this encryption we use the all 90 characters
     * the first character is "!" with ascii code : 33
     * the last  character is "z" with ascii code : 122
     * So for use Cesar encryption we use modulo mathematical function
     * @param datas
     * @param shifter
     * @return
     */
    public String encryptor(String datas, int shifter) {

        char[] charArrayIn = datas.toCharArray();
        char[] charArrayOut = new char[charArrayIn.length];
        int i;
        String res = "";

        for(int j=0; j<charArrayIn.length; j++){

            i = Convertor.charToAsciiCode(charArrayIn[j]);
            if (i>= 120){
                i = i-90;
            }
            i = i + shifter;
            charArrayOut[j] = Convertor.asciiCodeToChar(i);
        }
        res = String.copyValueOf(charArrayOut);
        return res ;
    }
}
