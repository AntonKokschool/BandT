package Classes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
    public static String readFile()
    {
        String bestandsnaam = "C:/Users/AntonKok/Hanzehogeschool Groningen/Vlag R van der, Ricardo - B&T/Week 1/nederlandsetekst.txt";
        //System.out.printf("Hello World!");
        try {
            String string = new String(Files.readAllBytes(Paths.get(bestandsnaam)));
            // do something with everything string
            //System.out.printf(e);
            return string;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
