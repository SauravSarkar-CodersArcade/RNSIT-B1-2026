package com.files;
import java.io.File;
import java.io.IOException;
public class CreateNewFile {
    public static void main(String[] args) throws IOException {
        File file = new
                File("./RNS/CSE/Sem-VI/First-Floor/rns.txt");
        if(file.createNewFile()){
            System.out.println("File " + file.getName() + " created");
        }else {
            System.out.println("File already exists.");
        }
    }
}
