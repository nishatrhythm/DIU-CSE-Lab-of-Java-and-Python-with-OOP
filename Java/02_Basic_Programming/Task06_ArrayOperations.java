public class Task06_ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 23, 56, 89, 34};

        System.out.println("1D Array Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            sum += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        double average = (double) sum / numbers.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        System.out.println("\n2D Array (Matrix):");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }
}