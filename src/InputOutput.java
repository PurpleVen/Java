//3356_10
//Write a java program to demonstrate file input output

package JBLInputOutput;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        File myFile = new File("InputOutput.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (myFile.exists()) {
            System.out.println("\n");
            System.out.println(myFile.getName() + " exists");
            System.out.println("\nThe file is " + myFile.length() + " bytes long");

            if (myFile.canWrite()) {
                System.out.println("\nIn This The File Can Be Written");
                try {
                    FileWriter newfile = new FileWriter("InputOutput.txt");
                    newfile.write("\nThis Is My Input Output file");
                    System.out.println("---Content in the file is written---");
                    newfile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else
                System.out.println("writing is not possible");

            if (myFile.canRead()) {
                System.out.println("Reading is possible");
                try {
                    Scanner sc = new Scanner(myFile);
                    System.out.println("The content in the file is :");
                    while (sc.hasNextLine()){
                        System.out.println(sc.nextLine());
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            else {
                System.out.println("Reading is not possible");
            }

        } else
            System.out.println("File does not exist");
        System.out.println("path: " +myFile.getAbsolutePath());
        System.out.println("File Name: "+ myFile.getName());
        System.out.println("File Size: "+ myFile.length() + " bytes");
    }
}


