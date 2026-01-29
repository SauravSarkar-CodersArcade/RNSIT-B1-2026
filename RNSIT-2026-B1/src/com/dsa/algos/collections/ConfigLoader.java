package com.dsa.algos.collections;
import java.io.FileReader;
import java.util.Properties;
// SDE SDT
public class ConfigLoader {
    public static void main(String[] args) throws Exception{
        Properties props = new Properties();
        props.load(new FileReader("./application.properties"));
        String dbUrl = props.getProperty("db.url");
        System.out.println(dbUrl);
        String userName = props.getProperty("db.username");
        System.out.println(userName);
    }
}
