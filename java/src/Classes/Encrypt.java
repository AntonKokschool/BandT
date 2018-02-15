package Classes;
import java.util.ArrayList;
import java.util.Collections;

public class Encrypt {
    public ArrayList generateKey(){
        ArrayList key = new ArrayList();
        for (int i = 0; i < 26; i++){
            key.add(i);
        }
        Collections.shuffle(key);
        return key;
    }
}
