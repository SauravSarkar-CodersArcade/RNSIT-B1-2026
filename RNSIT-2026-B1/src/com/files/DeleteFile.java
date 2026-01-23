package com.files;
import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new
                File("./RNS/CSE/Sem-VI/First-Floor/rns.txt");
        if(file.delete()){
            System.out.println("File " + file.getName() + " deleted");
        }else {
            System.out.println("File doesn't exists.");
        }
    }
}
