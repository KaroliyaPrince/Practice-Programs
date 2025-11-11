import java.util.Scanner;

public class Number_Ugly_or_Not {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number = ");
        int number = sc.nextInt();

        if(number<=0){
            System.out.println("Not Ugly number");
            return;
        }

        while(number%2 == 0){
            number/=2;
        }
        while(number%3==0){
            number/=3;
        }

        while (number%5 == 0) {
            number/=5;
        }

        if(number == 1){
            System.out.println("Ugly number");
        }
        else System.out.println("Not Ugly number");
    }
}