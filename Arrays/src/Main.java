import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[][] arr1 = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for(int row=0;row< arr1.length;row++)
        {
            for(int col = 0; col < arr1[row].length; col++)
            {
                arr1[row][col] = sc.nextInt();
            }
            System.out.println();
        }

        for (int[] ints : arr1) {
            System.out.println(Arrays.toString(ints));
        }
    }
}