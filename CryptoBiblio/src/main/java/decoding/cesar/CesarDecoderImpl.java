package decoding.cesar;

import utils.Convertor;

/**
 * Created by Loïc on 14/10/2017.
 */
public class CesarDecoderImpl implements CesarDecoder {


    public String decryptor(String data, int shifter) {

        char[] charArrayIn = data.toCharArray();
        char[] charArrayOut = new char[charArrayIn.length];
        int i;
        String res = "";

        for(int j=0; j<charArrayIn.length; j++){

            i = Convertor.charToAsciiCode(charArrayIn[j]);
            if (i<= 35){
                i = i + 90;
            }
            i = i - shifter;
            charArrayOut[j] = Convertor.asciiCodeToChar(i);
        }
        res = String.copyValueOf(charArrayOut);
        return res ;
    }
}
