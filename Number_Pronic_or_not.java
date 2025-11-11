import java.util.Scanner;

public class Number_Pronic_or_not {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number = ");
        long number = sc.nextLong();

        for(int i=1 ; i<number ; i++){
            if(i*(i+1) == number){
                System.out.println("Number is Pronic");
                return;
            }
        }

        System.out.println("Number is not Pronic");
    }
}
