import java.util.Scanner;

class ArrayProperty{

    public int insertElement(int element, int position ,int numberOfElement, int[] arr){

        if(numberOfElement == 100){
            System.out.println("<-----Array is full----->");
            return numberOfElement;
        }
        else if(position > numberOfElement-1){
            arr[position] = element;
            System.out.println("<-----Element insert successful----->");
            return numberOfElement+1;
        }
        else{

            for(int i = numberOfElement-1 ; i>=position ;i--){
                arr[i+1] = arr[i];
            }
            arr[position] = element;
            System.out.println("<------Element insert successful----->");
            return numberOfElement+1;
        }

    }

    public void printArray(int[] arr,int numberOfElement){
        System.out.print("<------Array Element is [");
        for(int i=0 ; i < numberOfElement ;i++){
            System.err.print(arr[i] + " , ");
        }
        System.err.println("]");
    }
}

public class Insert_element_at_position_in_array {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int numberOfElement = 0;
        
        while(true){
            System.out.println("Enter Choice");
            System.out.println("1 for insert");
            System.out.println("2 for print element");
            System.out.println("3 for exit");
            int choice = sc.nextInt();
            ArrayProperty AP = new ArrayProperty();


            switch(choice){
                case 1 : {
                    System.out.print("Enter element = ");
                    int element = sc.nextInt();
                    System.out.print("Enter position = ");
                    int position = sc.nextInt();
                    numberOfElement = AP.insertElement(element, position,numberOfElement, arr);
                    break;
                }
                case 2:{
                    AP.printArray(arr,numberOfElement);
                    break;
                }
                case 3:{
                    return;
                }
            }
        }
    }
}
