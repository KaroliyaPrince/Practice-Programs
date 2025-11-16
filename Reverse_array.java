import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size = ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        
        for(int i=0;i<size;i++){
            System.out.print("enter element = ");
            arr[i] = sc.nextInt();
        }

        int temp = 0;

        for(int i=0 ; i<size/2 ; i++){
            temp = arr[i];
            arr[i] = arr[size-i-1];
            arr[size-i-1] = temp;
        }

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
