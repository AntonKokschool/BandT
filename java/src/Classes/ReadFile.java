package Classes;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
    public static String readFile()
    {
        String bestandsnaam = "D:\\OneDrive - Hanzehogeschool Groningen\\Thema 2.3\\B&T\\Week 1\\nederlandsetekst.txt";
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
