import java.util.Scanner;

public class Number_Kaprekar_or_not {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number = ");
        long number = sc.nextLong();
        long temp = (long)Math.pow(number,2);
        int digit_pos = 10;

        while(true){
            if(temp/digit_pos + temp%digit_pos == number){
                System.out.println("Number is Kaprekar");
                return;
            }
            digit_pos*=10;

            if(temp/digit_pos == 0){
                System.out.println("Number is Not Kaprekar");
                return;
            }
        }
    }
}
