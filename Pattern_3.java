/*
      1 
     212 
    32123 
   4321234 
    32123 
     212 
      1
 */

import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of max number for pattern = ");
        int max_number = sc.nextInt();
        int a=0;

        for(int i = 1;i<=max_number;i++){
            a=i;
            for(int k = 1;k<=max_number-i;k++){
                System.out.print(" ");
            }

            for(int j = 1 ; j<=i*2-1 ;j++){
                if(j>=i){
                    System.out.print(a);
                    a++;
                }
                else{
                    System.out.print(a);
                    a--;
                }
            }
            System.out.println();
        }

        for(int i=a-2 ; i>=1 ; i--){
            a=i;
            for(int k = 1 ; k<=max_number-i;k++){
                System.err.print(" ");
            }

            for(int j = 1 ; j<=i*2-1;j++){
                if(j>=i){
                    System.out.print(a);
                    a++;
                }
                else{
                    System.out.print(a);
                    a--;
                }
            }
            System.out.println();
        }

        

    }
}
