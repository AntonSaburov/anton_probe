package edu.javacourse.reflection;

public class MultiArray
{
    public static void main(String[] args) {
        // Объявим константу для размера массива
        int SIZE = 8;
        // Создаем двумерный массив 
        int[][] graph = new int[SIZE][SIZE];
        // Объявляем начальное значение элемента в массиве
        int n = 1;
        // Объявляем шаг уменьшения квадрата
        int k = 1;
        for (int i = 0; i < SIZE / 2; i++) {
            for (int j = i; j <= SIZE - k; j++) {
                graph[i][j] = n;
                n++;
                if (j == SIZE - k) {
                    for (int m = k; m <= k; j--) {
                        graph[SIZE - k][j] = n;
                        n++;
                        if (j == k) {
                            for (int l = SIZE - k; l <= k; l--) {
                                graph[l][j - 1] = n;
                                n++;
                            }
                        }

                        k++;
                    }
                }
            }
        }
        // Теперь выводим массив на экран
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%3d", graph[i][j]);
            }
            System.out.println();
        }

    }

}
