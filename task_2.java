// Вывести все простые числа от 1 до 1000

public class task_2 {
    public static void main(String[] args) {
        int number = 1000;
        System.out.println(2);
        for (int i = 3; i <= number; i++) {
            for (int k = i - 1; k >= 2; k--) {
                int j = k;
                if (i % k == 0) {
                    break;
                } 
                if (i % k != 0 && j >= 2) {
                    if (i % k != 0 && j == 2) {                       
                        System.out.println(i);
                    }
                j--;
                }
            }
        }
    }
}
