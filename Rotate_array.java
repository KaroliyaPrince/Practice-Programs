import java.util.Scanner;

public class Rotate_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array = ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter element = ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter rotate index = ");
        int k = sc.nextInt();
        int temp=0;

        for(int i=0;i<=k;i++){
            for(int j=k+1-i;j<size-i;j++){
                temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }

        for(int i=0;i<size;i++){
            System.err.print(arr[i]+",");
        }


    }
}
