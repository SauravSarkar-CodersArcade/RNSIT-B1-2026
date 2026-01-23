package com.files;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class ReadTextFile {
    public static void main(String[] args) throws IOException {
        File file = new File("./RNS/CSE/Sem-VI/First-Floor/rns.txt");
        Scanner reader = new Scanner(file);
        while (reader.hasNext()){
            String data = reader.nextLine();
            System.out.println(data);
        }
        reader.close();
    }
}
