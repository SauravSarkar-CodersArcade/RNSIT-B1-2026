package com.files;
import java.io.FileWriter;
import java.io.IOException;
public class WriteDataIntoFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("./RNS/CSE/Sem-VI/First-Floor/rns.txt", true);
        writer.append("\nWe are in sixth sem CSE");
        writer.close();
        System.out.println("Wrote data successfully to the file.");
    }
}
