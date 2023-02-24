import java.util.Scanner;

public class MatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];

        // Read the matrix elements from the user
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Rotate the matrix
        int[][] rotatedMatrix = rotateMatrix(matrix, size);

        // Print the rotated matrix
        System.out.println("Rotated matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] rotateMatrix(int[][] matrix, int size) {
        int[][] rotatedMatrix = new int[size][size];

        // Traverse the matrix layer by layer
        for (int layer = 0; layer < size / 2; layer++) {
            int first = layer;
            int last = size - 1 - layer;

            // Rotate each element in the current layer
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                rotatedMatrix[first][i] = matrix[i][last];
                rotatedMatrix[i][last] = matrix[last][last - offset];
                rotatedMatrix[last][last - offset] = matrix[last - offset][first];
                rotatedMatrix[last - offset][first] = top;
            }
        }

        // If the size of the matrix is odd, rotate the center element
        if (size % 2 == 1) {
            int mid = size / 2;
            rotatedMatrix[mid][mid] = matrix[mid][mid];
        }

        return rotatedMatrix;
    }
}
