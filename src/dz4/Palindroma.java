package dz4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class Palindrome {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> strings = new HashSet<>();
        System.out.println("Введите слова: ");
        String s1;
        while (true){
            s1 = reader.readLine();
            if (s1.isEmpty()){ break;}
            if (s1.replaceAll("\\w", "").equalsIgnoreCase
                    (new StringBuilder(s1.replaceAll("\\w", "")).reverse().toString())) {
                strings.add(s1);
            }
        }

        for (String str : strings){
            System.out.println("Слова полиндромы: " + str);
        }
    }

}