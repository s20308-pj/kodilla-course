package exception.main;

import exception.io.FileReader;
import exception.io.FileReaderException;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        String filName = "names.txt";
        try {
            fileReader.readFile(filName);
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }
    }
}
