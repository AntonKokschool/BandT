package Classes;
import java.util.ArrayList;
import java.util.Collections;

// @author:     Ricardo van der Vlag
// @version:    2018-2-15
public class Encrypt {
    // Generate a key for encryption
    public ArrayList generateKey(){
        // Create ArrayList which will hold the key information
        ArrayList key = new ArrayList();
        // Fill key with 26 entries represending the number of the alphabet e.g. a = 0, b = 1 etc.
        for (int i = 0; i < 26; i++){
            key.add(i);
        }
        // Shuffle key randomly
        Collections.shuffle(key);
        return key;
    }
}
