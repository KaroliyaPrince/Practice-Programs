import java.util.Scanner;

public class Number_Happy_or_not {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number = ");
        long number = sc.nextLong();

        long[] array = new long[100];
        int array_idx = 0;


        while(true){
            
            long sum = 0;

            while(number!=0){
                sum+=Math.pow(number%10,2);
                number/=10;
            }

            if(sum==1){
                System.out.println("Number is Happy");
                return;
            }

            for(int i=0 ; i<array_idx ;i++){
                if(array[i]==sum){
                    System.out.println("Number is not Happy");
                    return;
                }
            }
            number = sum;
            array[array_idx++] = number;

        }
    }
}
