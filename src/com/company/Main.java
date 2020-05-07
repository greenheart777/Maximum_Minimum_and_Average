package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;

        try {
            Scanner myVar = new Scanner(System.in);
            Scanner myVar2 = new Scanner(System.in);
            System.out.println("Введите размер массива:");
            n = myVar.nextInt();

            double[] array = new double[n];
            for (int i = 0; i < array.length; i++) array[i] = Math.random();
            double max = array[0], min = array[0], avg = array[0];

            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
                if (min > array[i]) {
                    min = array[i];
                }
                avg = (avg + array[i]) / n;
            }
            System.out.println("Максимальное значение равно: "+max);
            System.out.println("Минимальное значение равно: "+min);
            System.out.println("Среднее значение равно: "+avg);

            System.out.println("\nПосмотреть массив? (Y/N)");
            String str1 = myVar2.nextLine();

            if(str1.equals("y") | str1.equals("Y")){
                for (int i = 0; i < array.length; i++) System.out.println("Arra["+ i +"] равно -> " + array[i]+" ");
            } else System.out.println("Пока! Вернись ещё!");
        } catch (Exception ex){
            System.out.println("Вводим число!");
        }
    }
}
