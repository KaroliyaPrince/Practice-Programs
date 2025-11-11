import java.util.Scanner;

class D_to_O {
    public void decimalToOctal(double number) {

        String ans = new String();

        int temp = (int) number;

        while (temp != 0) {
            int digit = (int) temp % 8;
            ans = ans.concat(String.valueOf(digit));
            temp /= 8;
        }

        StringBuilder Final_ans = new StringBuilder(ans);
        Final_ans.reverse().toString();

        ans = new String(Final_ans);
        ans = ans.concat(".");
        double temp2 = number % 1;

        for (int i = 0; i < 4; i++) {
            double n = temp2 * 8;
            ans = ans.concat(String.valueOf((int) n));
            temp2 = n % 1;

            if (temp2 == 0)
                break;
        }

        System.out.println(ans);
    }

    public void octalToDecimal(String number) {

        double double_number = Double.parseDouble(number);
        int I_number = (int) double_number;
        int D_number = 0;
        int idx = number.indexOf(".");
        if (idx != -1) {
            System.out.println(idx);
            String sub_str = number.substring(idx + 1);
            StringBuffer reverse_str = new StringBuffer(sub_str);
            reverse_str.reverse().toString();
            sub_str = new String(reverse_str);
            D_number = Integer.parseInt(sub_str);
        }

        double sum = 0;
        int pow = 0;

        while (I_number != 0) {
            sum += Math.pow(8, pow) * (I_number % 10);
            I_number /= 10;
            pow++;
        }

        pow = -1;
        while (D_number != 0) {
            sum += Math.pow(8, pow) * (D_number % 10);
            D_number /= 10;
            pow--;
        }

        System.out.println(sum);
    }
}

public class Decimal_to_Octal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter choice");
        System.out.println("1 for Decimal to octal");
        System.out.println("2 for Octal to decimal");
        int choice = sc.nextInt();
        D_to_O d_to_o = new D_to_O();

        double number;

        if (choice == 1) {
            System.out.print("Enter decimal number = ");
            number = sc.nextDouble();
            d_to_o.decimalToOctal(number);
        } else {
            System.out.print("Enter octal number = ");
            String n = sc.next();
            d_to_o.octalToDecimal(n);
        }

    }
}
