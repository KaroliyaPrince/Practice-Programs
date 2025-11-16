import java.util.Scanner;

public class Difference_between_second_max_and_min_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size = ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element = ");
            arr[i] = sc.nextInt();
        }

        int temp = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int min = -1, max = -1;
        int i = 0;

        while (true) {
            if (arr[i] != arr[i + 1]) {
                min = arr[i + 1];
                break;
            }
            i++;
        }

        i = size-1;
        while (true) {
            if (arr[i] != arr[i - 1]) {
                max = arr[i - 1];
                break;
            }
            i--;
        }

        System.out.print("Ans = " + (max-min));
    }
}
