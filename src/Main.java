import java.util.Scanner;

/**
 * App class to determine if a series of matrices are identity matrices.
 * An identity matrix has 1s on the main diagonal and 0s elsewhere.
 * The program reads a series of square matrices, checks if each matrix is an
 * identity matrix,
 * and outputs "SI" if it is and "NO" otherwise.
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int bucles = teclado.nextInt(); // Read the size of the first matrix

        while (bucles != 0) {
            int[][] matriz = new int[bucles][bucles];

            // Populate the matrix with user input values
            for (int filas = 0; filas < bucles; filas++) {
                for (int columnas = 0; columnas < bucles; columnas++) {
                    matriz[filas][columnas] = teclado.nextInt();
                }
            }

            int comparacion = 0;

            // Check if the matrix is an identity matrix
            OUTER: for (int filas = 0; filas < bucles; filas++) {
                for (int columnas = 0; columnas < bucles; columnas++) {
                    // Check if the diagonal elements are all 1s
                    if (filas == columnas && matriz[filas][columnas] == 1) {
                        comparacion++;
                    }
                    // If any diagonal element is not 1, it's not an identity matrix
                    else if (filas == columnas && matriz[filas][columnas] != 1) {
                        System.out.println("NO");
                        break OUTER;
                    }
                    // Check if non-diagonal elements are all 0s
                    else if (filas != columnas && matriz[filas][columnas] != 0) {
                        System.out.println("NO");
                        break OUTER;
                    }
                }
            }

            // If the diagonal check passed for all elements, print "SI"
            if (bucles == comparacion) {
                System.out.println("SI");
            }

            bucles = teclado.nextInt(); // Read the size for the next matrix, or 0 to end input
        }
        teclado.close();
    }
}
