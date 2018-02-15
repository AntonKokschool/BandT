package Classes;
import java.util.Random;

// @author:     Ricardo van der Vlag
// @version:    2018-2-15
public class Encrypt {
    // Generate a key for encryption
    public int generateKey(){
        Random rand = new Random();
        int key = rand.nextInt(26) + 1;

        return key;
    }
}
