import java.util.Arrays;
import java.util.Scanner;

public class Q1175{


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] arr= new int[26];
        int[] arr1;

        String str = scan.nextLine();
        for(int i =0; i<str.length(); i++){

            int n = str.charAt(i);
            if(n<97){
                arr[n-65]++;
            }
            else{
                arr[n-97]++;
            }
        }
        arr1 = Arrays.copyOf(arr,26);
        Arrays.sort(arr);

        if(arr[24]==arr[25]){
            System.out.println("?");
        }
        else{
            for(int i =0; i<arr1.length; i++){
                if(arr[25]==arr1[i]){
                    System.out.printf("%c",i+65);
                }
            }
        }

    }
}
