package Lap2.common;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vothi
 */
public class Library {
     public int getInt(String p, int n, int m) {
        int result = -1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(p + ": ");
            try {
                String s = sc.nextLine();
                result = Integer.parseInt(s);
                if (result >= n && result <= m) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter result number between " + n + " and " + m);
            }
        }
        return result;
    }

    public int[] createArray(int size_arr) {
        int[] array = new int[size_arr];
        Random rd = new Random();
        // random de tao ra cac so ngau nhien
        for (int i = 0; i < size_arr; i++) {
            array[i] = rd.nextInt(100);
        }
        return array;
    }

   public void display(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(i + 1 + ": " + arr[i]);
        }
    }
   

}

