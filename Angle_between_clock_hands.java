import java.util.Scanner;

public class Angle_between_clock_hands {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Hour = ");
        int hour = sc.nextInt();

        
        System.out.println("Enter Minute = ");
        int min = sc.nextInt();

       double Angle = Math.abs((6*min) - (30*hour + 0.5*min));

       System.out.println("Angle = "+Angle);
    }
}