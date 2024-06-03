package FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

    public static void main(String[] args) {

        String file = "LegionFile.txt";
        String file1 = "MaxGladkov.txt";

        FileManager fileManager = new FileManager();
        fileManager.createFile(file);
        fileManager.createFile(file1);
        fileManager.writeToFile(file, "Проверка работоспособности фильтров страницы «Инженеры СТП»: " +
                "В дальнейшем потребуется замена селекторов опций в дроплистах!!!");
        fileManager.writeToFile(file1, "Yessss, I did it!!!");
        fileManager.readFromFile(file);
        fileManager.readFromFile(file1);
        fileManager.deleteFile(file1);

    }

    public void createFile(String fileName) {

        File file = new File(fileName);
        File file1 = new File(fileName);

        try {
            file.createNewFile();
            file1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeToFile(String fileName, String text) {

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readFromFile(String fileName) {

        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteFile(String fileName) {

        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }

    }

}
