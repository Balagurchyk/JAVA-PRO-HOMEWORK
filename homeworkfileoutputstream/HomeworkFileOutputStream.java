package com.proftelran.org.homeworkfileoutputstream;

//        Создайте файл, используя FileOutputStream, с текстом:
//        "This is my first experience when I myself work with IO API. I can do everything!"
//        Создайте файл используя new File() в каталоге Desktop, убедитесь, что файл существует, удалите файл.
//        Создайте метод для удаления директории и суб-директорий

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class HomeworkFileOutputStream {

    public static void main(String[] args) {
        String pathToFile = "C:\\Users\\Admin\\Desktop";
        String s = "This is my first experience when I myself work with IO API. I can do everything!";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(pathToFile + "\\london.txt");
            byte[] bytes = s.getBytes();
            fileOutputStream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File(pathToFile + "\\berlin.txt");
        try {
            file.createNewFile();
            boolean exists = file.exists();
            System.out.println("File exists: " + exists);
            boolean delete = file.delete();
            System.out.println("File deleted: " + delete);
        } catch (IOException e) {
            e.printStackTrace();
        }
        deleteDirectory();
    }
    private static void deleteDirectory() {
        String pathToFile = "C:\\Users\\Admin\\Desktop";
        File directory = new File(pathToFile + "\\abc");
        if (directory.exists()) {
            directory.delete();
            System.out.println("Директория удалена!");
        } else {
            System.out.println("Директории не существует!");
        }
    }
}
