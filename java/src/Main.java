import Classes.Encrypt;
import Classes.ReadFile;

// Main class
public class Main {

    public static void main(String[] args) {
        String file = ReadFile.readFile();
        Encrypt encrypt = new Encrypt();
        String encryptedFile = encrypt.encryptFile(file);
        System.out.println("Encrypted file:");
        System.out.print(encryptedFile);
    }
}
