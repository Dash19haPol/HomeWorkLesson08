package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkLesson08 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner console = new Scanner(System.in);
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 100);

        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.print("Введіть число для пошуку: ");
        int number = console.nextInt();

        boolean numberInArray = true;

        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == number) {
                System.out.println("Індекс числа " + number + " у відсортованому масиві: " + mid);
                numberInArray = false;
            }
            if (array[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if(numberInArray){
            System.out.println("Такого числа в масиві немає");
        }

    }
}
