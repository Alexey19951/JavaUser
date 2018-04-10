package WarAndPeace;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class War {
    public static void main(String[] args) throws IOException {

        File txt = new File("src/WarAndPeace/wr.txt");
        List<String> list = Files.readAllLines(txt.toPath());

        List<String> three = new ArrayList<>();
        List<String> two = new ArrayList<>();
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;





        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String a1 = iterator.next();
            if (a1.contains("War")){
                count++;
            }
            if (a1.contains("peace")){
                count1++;

            }
            String[] s = a1.split("\\s+");
            for (String str : s){
                if (str.length() == 3){
                    three.add(str);
                    count2++;

                }

                if (str.length() == 2){
                    two.add(str);
                    count3++;

                }

            }
        }
        System.out.println("Слово war встречаеться в книге " + count + " раз " + "а слово peace " + count1 + " раз" );
        System.out.println("в файле wr.txt слов содержащих 3 буквы " + count2);
        System.out.println("в файле wr.txt слов содержащих 2 буквы " + count3);










    }


}
