package com.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatternMatching {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("Route", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("route");
        boolean matchFound = matcher.find();
        System.out.println(matchFound);
    }
}
