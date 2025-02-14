import java.util.Scanner;

public class MatrixOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rows and columns for matrices:");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("Enter elements of Matrix 1:");
        readMatrix(scanner, matrix1, rows, cols);

        System.out.println("Enter elements of Matrix 2:");
        readMatrix(scanner, matrix2, rows, cols);

        System.out.println("\nAddition:");
        printMatrix(addMatrices(matrix1, matrix2, rows, cols));

        System.out.println("\nSubtraction:");
        printMatrix(subtractMatrices(matrix1, matrix2, rows, cols));

        System.out.println("\nMultiplication:");
        printMatrix(multiplyMatrices(matrix1, matrix2, rows, cols));

        scanner.close();
    }

    public static void readMatrix(Scanner scanner, int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
