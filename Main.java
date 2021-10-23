package tp2.magicFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    //Now we want to create a program that takes a file name and prints it s content

    public static void main(String[] args) {
        System.out.println("Give me your file name :)");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        printFileContent(fileName);
    }


    private static String getFileContent(String fileName)  {
        File file = new File("src/tp2/magicFile/" + fileName);
        String content = null ;
       try{Scanner reader = new Scanner(file);
        content = reader.nextLine();
       return content;
       }
       catch(FileNotFoundException fileNotFoundException){
           System.out.println("fichier introuvable");

       }
        return content;
    }

    private static void printFileContent(String fileName) {
            String data = getFileContent(fileName);
            System.out.println(data);
    }

}