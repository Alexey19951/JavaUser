package Collection;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDZ {
    public static void main(String[] args) throws IOException{


        File txt = new File("src/Collection/collection.txt");
        List<String> lines = Files.readAllLines(txt.toPath());
        System.out.println(lines);
        List<String> list = new ArrayList<>();

        Iterator<String> iterator = lines.iterator();
        while (iterator.hasNext()) {
            String d1 = iterator.next().toLowerCase().trim();
            String[] d2 = d1.split(" ");
            for (String s : d2){
                list.add(s);


            }


        }
        for (String str1 : list) {
            System.out.println(str1);
        }

    }

}

