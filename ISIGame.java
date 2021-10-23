import java.util.Scanner;

public class ISIGame {



    static class ISIException extends RuntimeException{
        public ISIException(String s) {
            super(s);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a word");

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
       try {
           line=line.toLowerCase();
           if (!line.contains("isi")) {
               System.out.println("ok");}
               else {throw new ISIException("");}
           }catch(Exception ISIException){ System.out.println("life is not isi");}
       }

        }