package com.files;
import java.io.File;
// mkdir - only the last folder
// mkdirs - the full path if not available
public class CreateFolder {
    public static void main(String[] args) {
        File folder = new
                File("D:\\RNSIT\\B1-2026\\RNSIT-2026-B1\\RNS\\CSE\\Sem-VI\\First-Floor\\R-101");
        if (folder.mkdir()){
            System.out.println("Folder " + folder.getName() + " created");
        }else {
            System.out.println("Folder already exists");
        }
    }
}
