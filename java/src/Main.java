

import Classes.ReadFile;
import com.sun.xml.internal.bind.v2.model.core.NonElement;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// Main class
public class Main {

    public static void main(String[] args) {
        System.out.print(ReadFile.readFile());

    }
}
