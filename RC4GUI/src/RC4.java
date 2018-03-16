/**
 *
 * @author ishaw
 */

public class RC4 {
    
    String password;
    String plainText;   
    int[] key = {0,0,0,0,0,0,0,0};
    
    public RC4(String password, String plainText){
        this.password = password;
        this.plainText = plainText;
    }
    
    public int[] makeStateArray(String initialisationVector){

        // create a key array
        String passPhrase = this.password + initialisationVector;

        for (Integer i=0; i<8; i++){
            String s = "" + passPhrase.charAt(i);
            key[i] = Integer.parseInt(s);
        }

        // initialise the state array
        int[] stateArray = {0,1,2,3,4,5,6,7};

        // prepare the state array
        Integer j = 0;
        for (Integer i=0; i<8; i++){
            j = (j + stateArray[i] + key[i%key.length]) % key.length;
            int temp = stateArray[i];
            stateArray[i] = stateArray[j];
            stateArray[j] = temp;
        }
        
        return stateArray;
    }
    
    public String makeCipherText(int[] stateArray){
        String cipherText = new String();
        Integer j = 0;
        Integer i = 0;
        for (Integer k=0; k<plainText.length(); k++){
            // recalculate the counters
            i = (i + 1) % key.length;
            j = (j + stateArray[i]) % key.length;
            
            // swap state array values
            int temp = stateArray[i];
            stateArray[i] = stateArray[j];
            stateArray[j] = temp;
            
            // create the ciphertext
            String output = Integer.toBinaryString(stateArray[(stateArray[i] + stateArray[j]) % stateArray.length]);
            String cipherChar = Integer.toBinaryString(plainText.charAt(k));
            
            String outputBinary = String.format("%08d", Integer.parseInt(output));
            String cipherCharBinary = String.format("%08d", Integer.parseInt(cipherChar));
            
            cipherText += Xor(outputBinary, cipherCharBinary);
        }
        return cipherText;
    }

    public String makePlainText(int[] stateArray, String cipherText){
        String decryptText = new String();
        Integer j = 0;
        Integer i = 0;
        for (Integer k=0; k<cipherText.length()/8; k++){
            // recalculate the counters
            i = (i + 1) % key.length;
            j = (j + stateArray[i]) % key.length;
            
            // swap state array values
            int temp = stateArray[i];
            stateArray[i] = stateArray[j];
            stateArray[j] = temp;
            
            // create the ciphertext
            String output = Integer.toBinaryString(stateArray[(stateArray[i] + stateArray[j]) % stateArray.length]);
            String outputBinary = String.format("%08d", Integer.parseInt(output));
            String cipherChar = cipherText.substring(k*8,(k+1)*8);
            
            String decryptChar = Xor(outputBinary, cipherChar);
            
            int a = Integer.parseInt(decryptChar);
            decryptText += (char)Integer.parseInt(decryptChar, 2);
        }
        return decryptText;
    }
    

    public String Xor(String s, String t){
        String xoredString = new String();
        for (Integer i=0; i<8; i++){
            if (s.charAt(i) == t.charAt(i))
                xoredString += "0";
            else
                xoredString += "1";
        }
        return xoredString;
    }
    
}
