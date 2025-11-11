import java.util.Scanner;

public class Prime_or_not{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number = ");
        int number = sc.nextInt();
        int flage = 0;

        for(int i = 2 ; i<number ; i++){
            if(number%i==0){
                flage = 1;
                break;
            }
        }


        if(flage == 0){
            System.out.println("Prime number");
        }
        else System.out.println("Not Prime Number");   
     }
} 