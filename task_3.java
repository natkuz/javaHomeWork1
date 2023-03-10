import java.util.Scanner;

// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

public class task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter integer first number: ");
        int num_1 = iScanner.nextInt();
        System.out.print("Enter one of the following arithmetic characters +, -, / or * : ");
        char sign = iScanner.next().charAt(0);
        System.out.print("Enter integer second number: ");
        int num_2 = iScanner.nextInt();
        int result = 0;
        // if (sign == '+') {
        //     result = num_1 + num_2;
        //     }
        // if (sign == '-') {
        //     result = num_1 - num_2;
        //     }
        // if (sign == '*') {
        //     result = num_1 * num_2;
        //     }
        // if (sign == '/') {
        //     result = num_1 / num_2;
        //     }
        switch (sign) {
            case '+':
                result = num_1 + num_2;
                break;
            case '-':
                result = num_1 - num_2;
                break;
            case '*':
                result = num_1 * num_2;
                break;
            case '/':
                result = num_1 / num_2;
                break;
        }
        System.out.printf("%s %s %s = %s", num_1, sign, num_2, result);
        iScanner.close();
    }
    
}