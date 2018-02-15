package Classes;
import java.util.Random;

// @author:     Ricardo van der Vlag
// @version:    2018-2-15
public class Encrypt {
    // Max value for key is max number of extended ascii
    private int max = 255;
    // Generate a random key for encryption
    private int generateKey(){
        Random rand = new Random();
        // Max value = 254 min value = 1
        int key = rand.nextInt(max - 2) + 1;
        return key;
    }

    // Encrypt file using key
    public String encryptFile(String file){
        // Generate a key
        int key = generateKey();
        // Show private key
        System.out.println("The private key is: " + key);
        // Prepare String for returning
        String ret = "";
        // Read every character
        for (int i = 0; i < file.length(); i++){
            // Define ascii number of current character
            int ascii = (int) file.charAt(i);
            // Raise current ascii number with private key
            ascii = ascii + key;
            // If the new ascii number is higher than the max number of ascii,
            if (ascii > max){
                ascii = ascii - (max + 1);
            }
            ret = ret + Character.toString((char)ascii);
        }
        return ret;
    }
}
