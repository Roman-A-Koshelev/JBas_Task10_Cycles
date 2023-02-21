import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество строк матрицы:    ");
        int rows = in.nextInt();

        System.out.print("Введите количество столбцов матрицы:  ");
        int cols = in.nextInt();

        System.out.println("Введите вещественные данные матрицы:");
        double[][] mx = new double[rows][cols];
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                System.out.print("mx[" + i + "][" + j + "] = ");
                mx[i][j] = in.nextDouble();
            }
        }
        for (int j = 0; j < cols; ++j) {
            System.out.println("mx[0][" + j + "] * 3 = " + mx[0][j] * 3);
        }
    }
}