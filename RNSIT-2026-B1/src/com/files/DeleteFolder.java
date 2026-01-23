package com.files;
import java.io.File;
public class DeleteFolder {
    public static void main(String[] args) {
        // . means current dir
        // ./ means we entered it
        File folder = new
                File("./RNS/CSE/Sem-VI/First-Floor/R-101");
        if (folder.delete()){
            System.out.println("Folder " + folder.getName() + " deleted");
        }else {
            System.out.println("Folder doesn't exists");
        }
    }
}
