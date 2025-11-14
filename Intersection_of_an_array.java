import java.util.Scanner;

public class Intersection_of_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("<-----Details of First Array------>");
        System.out.print("Enter size = ");
        int size1 = sc.nextInt();

        int[] nums1 = new int[size1];

        for (int i = 0; i < size1; i++) {
            System.out.print("Enter element = ");
            nums1[i] = sc.nextInt();
        }

        System.out.println("<-----Details of Second Array------>");
        System.out.print("Enter size = ");
        int size2 = sc.nextInt();

        int[] nums2 = new int[size2];

        for (int i = 0; i < size2; i++) {
            System.out.print("Enter element = ");
            nums2[i] = sc.nextInt();
        }

        int[] final_arr = new int[Math.min(size1, size2)];
        int k = 0,l=0;
        boolean isStore = false;
        for(int i=0 ; i <final_arr.length;i++){
            final_arr[i] = -1;
        }

        for(int i = 0 ; i < Math.min(size1, size2) ; i++){
            isStore = false;
            for(int j=0 ; j<Math.max(size1, size2);j++){
                if(j==size2){
                    break;
                }
                else{
                    if(nums1[i] == nums2[j]){
                        
                        k=0;

                        for(l=0 ;l<final_arr.length;l++){
                            if(final_arr[l] == nums1[i]){
                                isStore = true;
                                break;
                            }
                        }

                        if(isStore){
                            break;
                        }

                        while(nums1[i] >= final_arr[k] && final_arr[k] != -1){
                            k++;
                        }

                        if(final_arr[k] == -1){
                            final_arr[k] = nums1[i];
                        }
                        else{
                            l = k;
                            while(final_arr[l] != -1){
                                l++;
                            }

                            while(l!=k){
                                final_arr[l] = final_arr[l-1];
                                l--;
                            }

                            final_arr[l] = nums1[i];
                        }
                        break;
                    }
                }
            }
        }

        for(int i=0 ; i<final_arr.length;i++){
            if(final_arr[i] == -1) break;

            System.out.print(final_arr[i]+",");
        }

    }
}
