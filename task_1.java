import java.util.Scanner;

// Вычислить n-ое треугольного число
// (сумма чисел от 1 до n), 
// а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

public class task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter integer number greater than 0: ");
        int num = iScanner.nextInt();
        int triangular_num = 0;
        int factorial_num = 1;
        for (int i = 1; i <= num; i++) {
            triangular_num += i;
            factorial_num *= i;
        }
        System.out.printf("Triangular number = %s", triangular_num);
        System.out.println("");
        System.out.printf("Factorial number = %s", factorial_num);
        iScanner.close();
    }
    
}