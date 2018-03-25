
import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class dz {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int a = 2;
        for (int i = 0; i < 10; ) {
            arr1[i] = a;
            a += 2;
            i++;


        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr1[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(arr1[i]);

        }
        int[] arr2 = new int[50];
        int d = 1;
        for (int i = 0; i < 50; ) {
            arr2[i] = d;
            d += 2;
            i++;

        }
        for (int i = 0; i < 50; i++) {
            System.out.print(arr2[i] + " ");


        }
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i] + " ");

        }
        System.out.println();
        int[] arr3 = new int[15];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (int) Math.round((Math.random() * 9));
            System.out.print(arr3[i]);


        }
        System.out.println();
        int var = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 2 == 0 && arr3[i] != 0)
                var++;

        }
        System.out.println(" В массиве arr3 " + var + " чётных элементов");


        int[] arr4 = new int[5];
        int[] arr5 = new int[5];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = (int) Math.round(Math.random() * 5);
            System.out.print(arr4[i]);
        }
        System.out.println();
        for (int j = 0; j < arr5.length; j++) {
            arr5[j] = (int) Math.round(Math.random() * 5);
            System.out.print(arr5[j]);

        }
        System.out.println();
        double top1 = 0;
        double top2 = 0;
        for (int i = 0; i < 5; i++) {
            top1 += arr4[i];
            top2 += arr5[i];

        }
        if (top1 > top2) {
            System.out.println("Среднее арифметическое первого массива (" + top1 + ") больше среднего арифметического " +
                    "второго массива (" + top2 + ")");
        } else if (top1 < top2) {
            System.out.println("Среднее арифметическое первого массива (" + top1 + ") меньше среднего арифметического " +
                    "второго массива (" + top2 + ")");
        } else {
            System.out.println("Средние арифметические массивов равны (" + top1 + ")");


        }
        System.out.println();
        int[] arr6 = new int[4];
        for (int i = 0; i < arr6.length; i++) {
            arr6[i] = (int) Math.round(Math.random() * 90 + 10);
            System.out.print(arr6[i] + " ");


        }
        for (int i = 0; i < arr6.length; i++) {
            if (i > 0) {
                if (arr6[i - 1] >= arr6[i]) {
                    System.out.print("Прогрессия не возрастающая");
                    break;
                }


            }
            if (i == arr6.length - 1)
                System.out.print("Последовательность строго возрастающая");


        }
        System.out.println();
        int abd,lCount=0,rCount=0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите чётное число");
        if (scn.hasNextInt()){
            do{
                a=scn.nextInt();
                if(a%2!=0||a<1)System.out.println("Вы ошиблись, введите повторно четное число!");
            }
            while(a%2!=0||a<1);
            int[] Mas = new int[a];
            for(int i=0;i<Mas.length;i++){
                Mas[i]=(int)(Math.random()*11)-5;
                System.out.print(Mas[i]+" ");
                if(i<=Mas.length/2-1){
                    lCount+=Math.abs(Mas[i]);
                }
                else {
                    rCount+=Math.abs(Mas[i]);
                }
                if(i==Mas.length-1){
                    System.out.println(" ");
                    if(lCount>rCount)
                        System.out.println("Сумма модулей первой половины массива больше и равна "+lCount);
                    if(rCount>lCount)
                        System.out.println("Сумма модулей второй половины массива больше и равна "+rCount);
                    if(rCount==lCount)
                        System.out.println("Суммы модулей первой и второй половины равны");
                }
            }
        }
        else System.out.println("Введено не число");

       Scanner cs = new Scanner(System.in);
        System.out.println("Введите строку");
        String s1 = cs.nextLine();
        System.out.println("Изменяемая подстрока");
        String s2 = cs.nextLine();
        System.out.println("Новая подстрока");
        String s3 = cs.nextLine();
        System.out.println(s1.replaceFirst(s2,s3));




        Scanner aw = new Scanner(System.in);
        System.out.println("Введите строку");
        String str1 = cs.nextLine();
        String lox = "(.)(?=(.*))(?<=(?=\\1.*?\\1\\2$).+)";
        String str = str1.replaceAll(lox, "");
        System.out.println( str.replaceAll("\\s+", ""));


    }
}
