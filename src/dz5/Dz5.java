package dz5;

import java.io.*;
import java.nio.charset.Charset;

public class Dz5 {

    private void writeFile(String str, File file, boolean append) throws IOException {

        try (OutputStream out = new FileOutputStream(file, append)) {
            byte[] danya = str.getBytes(Charset.forName("UTF-8"));
            out.write(danya);


        }
    }

    private String readFile (File file) throws IOException {
        try (InputStream in = new FileInputStream(file);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] danya = new byte[800];
            int len;
            while ((len = in.read(danya)) > 0){
                baos.write(danya, 0, len);
            }
            return new String(baos.toByteArray(), Charset.forName("UTF-8"));
        }


    }

    public static void main(String[] args) throws IOException {
        Dz5 fr = new Dz5();
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        fr.writeFile("Тестовая запись", file1, true);

        String sd = new String(fr.readFile(file1).replaceAll(" ", ""));
        fr.writeFile(sd, file2,true);






    }
}
























//1) Скопировать файл
//2) Разбить/склеить файл. Размер куска задается
//3) Посмотрите самостоятельно и попробуйте реализовать:
//   a) Зашифровать/ дешифровать файл паролем (XOR)
//   b) Зашифровать/ дешифровать файл другим файлом