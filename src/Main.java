import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Написати програму, яка перевіряє чи є рядок паліндромом (використовувати масив символів - char string[].
        // Для конвертації рядка, використовувати метод toCharArray())
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string as an input to check whether it is palindrome or not");
        String inputString = scanner.nextLine();

        char[] charArray = inputString.toCharArray();

        boolean isPalindrome = true;

        for (int left = 0, right = charArray.length - 1; left < right; left++, right--) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }

//2. Написати програму, яка знаходить мінімальне і максимальне число в масиві.
        System.out.println("Task 2: ");
        int[] arr = new int[]{15, 11, 7, 77, 56};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("This is the smallest element in array: " + min);

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("This is the biggest element in array: " + max);


        //3. Написати програму, яка в масиві з випадкових цілих чисел замінює всі
        // парні числа на 0 і виводить отриманий масив на екран.
        System.out.println("Task 3: ");

        Random rd = new Random();
        int[] rand_array = new int[7];
        for (int i = 0; i < rand_array.length - 1; i++) {
            rand_array[i] = rd.nextInt();
        }
        for (int i = 0; i < rand_array.length - 1; i++) {
            if (rand_array[i] % 2 == 0) {
                rand_array[i] = 0;
            }
        }
        System.out.println("This is the updated array: ");
        int sum1 = 0;
        int negativeCount = 0;
        for (int i = 0; i < rand_array.length - 1; i++) {
            System.out.println(rand_array[i]);
        }

//   4. Написати програму, яка друкує таблицю значень sin(x), де х - кожні 10 градусів від 0 до 360.
//   (значення мають бути записані в масив за допомогою циклу)
        System.out.println("Task 4: ");

            for (int n = 0; n < 360; n += 10) {
                double x = n;
                double sinX = Math.sin(Math.toRadians(x));
                System.out.printf("%.1f\t\t%.4f\n", x, sinX);
            }

//5. Написати програму яка виводить кількість відємних елементів нище головної діагоналі
// та суму не парних елементів вище головної діагоналі двомірного масиву.
        System.out.println("Task 5: ");
            int[][] matrix = {
                    {1, 2, 3, 4},
                    {-1, 5, 6, 7},
                    {-2, -3, 8, 9},
                    {-4, -5, -6, 10}
            };

                        int rows = matrix.length;
            int cols = matrix[0].length;

            negativeCount = 0;
            sum1 = 0;
            // Iterate through the matrix to count negative elements below the main diagonal
            for (int k = 0; k < rows; k++) {
                for (int j = 0; j < cols; j++) {
                    if (k > j) { // Below the main diagonal
                        if (matrix[k][j] < 0) {
                            negativeCount++;
                        }
                    } else if (k < j) { // Above the main diagonal
                        if (matrix[k][j] % 2 != 0) {
                            sum1 += matrix[k][j];
                        }
                    }
                }
            }

        System.out.println("Number of negative elements below the main diagonal: " + negativeCount);
        System.out.println("Sum of odd elements above the main diagonal: " + sum1);
    }
}

















