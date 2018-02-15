import Classes.Encrypt;
//import Classes.ReadFile;

// Main class
public class Main {

    public static void main(String[] args) {
        //String file = ReadFile.readFile();
        //System.out.println("The file is:");
        //System.out.println("");
        //System.out.print(file);
        Encrypt encrypt = new Encrypt();
        int key = encrypt.generateKey();
        System.out.print(key);
    }
}
