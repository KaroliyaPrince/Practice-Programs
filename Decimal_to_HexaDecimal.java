import java.util.Scanner;

class D_to_HD {

    public void decimalToHexaDecimal(double number) {

        long I_number = (long) number;
        double F_number = number % 1;

        String ans = "";
        int digit;

        while (I_number != 0) {
            digit = (int) (I_number % 16);

            if (digit > 9) {
                digit += 55;
                char c = (char) digit;
                ans = ans + c;
            } else
                ans = ans.concat(String.valueOf(digit));

            I_number /= 16;
        }

        StringBuffer revers_ans = new StringBuffer(ans);
        revers_ans.reverse().toString();
        ans = new String(revers_ans);
        ans = ans.concat(".");

        for (int i = 0; i < 4; i++) {
            F_number *= 16;
            digit = (int) F_number;

            if (digit > 9) {
                digit += 55;
                char c = (char) digit;
                ans = ans + c;
            } else
                ans = ans.concat(String.valueOf(digit));

            F_number %= 1;
        }

        System.out.println(ans);

    }

    public void hexaDecimalToDecimal(String number) {

        int dote_idx = number.indexOf(".");
        int pow = 0;
        double ans = 0;

        if (dote_idx != -1) {
            String F_number = number.substring(dote_idx + 1);
            pow = -1;
            for (int i = 0; i < F_number.length(); i++) {
                char c = F_number.charAt(i);
                int digit = (int) c;

                if (digit >= 48 && digit <= 57) {
                    digit = digit - 48;
                } else
                    digit = digit - 55;

                ans += Math.pow(16, pow) * digit;
                System.out.println(ans);
                pow--;
            }
        }

        pow = 0;
        String I_number = number.substring(0, dote_idx);

        for (int i = I_number.length() - 1; i >= 0; i--) {
            char c = I_number.charAt(i);
            int digit = (int) c;

            if (digit >= 48 && digit <= 57) {
                digit = digit - 48;
            } 
            else digit = digit - 55;

            ans += Math.pow(16,pow) * digit;
            pow++;
        }

        System.out.println(ans);

    }
}

public class Decimal_to_HexaDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Choice");
        System.out.println("1 for Decimal to Hexa-Decimal");
        System.out.println("2 for Hexa-Decimal to Decimal");

        int choice = sc.nextInt();

        D_to_HD d_to_dh = new D_to_HD();

        if (choice == 1) {
            System.out.print("enter decimal number = ");
            double number = sc.nextDouble();
            d_to_dh.decimalToHexaDecimal(number);

        } else {
            System.out.print("Enter Hexa-Decimal number = ");
            String Number = sc.next();
            d_to_dh.hexaDecimalToDecimal(Number);
        }

        sc.close();
    }
}
