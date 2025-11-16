import java.util.Scanner;

public class Chocolate_puzzle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter given rupees = ");
        int n = sc.nextInt();

        System.out.print("Enter ruppes per chocolate = ");
        int m = sc.nextInt();

        System.out.print("Enter number of wrappers for exchange offer = ");
        int k = sc.nextInt();

        int total_chocolate = n/m;
        int available_wrappers = total_chocolate;

        while(available_wrappers!=0){
            available_wrappers = available_wrappers/k;
            total_chocolate+=available_wrappers;
        }

        System.out.println(total_chocolate);
    }
}
