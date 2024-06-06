package impl;

import java.io.*;

public class FileHandling {

    void writeData(String filename) throws IOException {
        try (
                FileWriter fileWriter = new FileWriter(filename);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            bufferedWriter.write("Godfather \n Inception \n Jawaaniii");
        }
    }

    void readData(String filename) throws IOException {
        try (
                FileReader fileReader = new FileReader(filename);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String currentLine;

            while ((currentLine = bufferedReader.readLine()) != null) {
                System.out.println(currentLine + '\n');
            }
        }
    }

    void copyFileData(String source, String destination) throws IOException {
        try (
                FileWriter fileWriter = new FileWriter(destination);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                FileReader fileReader = new FileReader(source);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                bufferedWriter.write(currentLine + "\n");
            }
        }
    }
}
