package problems.Amazon;

import java.util.Scanner;



public class FlipBits{


    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < size; ++i){
            arr[i] = sc.nextInt();
        }
        System.out.println(flipBit(arr,size));
    }

    private static int flipBit(int arr[], int size){
        int mx = 0;
        int one = 0, zero = 0;
        for(int i =0; i < size; ++i){
            if(arr[i] == 1){
                one++;
                zero--;
                if(zero < 0) zero = 0;
            }else if(arr[i] == 0){
                zero++;
                mx = Math.max(mx,zero);
            }
        }
        return one + mx;
    }
}