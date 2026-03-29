import java.util.Random;
import java.util.Scanner;

public class Pi {
        public static void main(String[] args) {

            System.out.println("ACTIVIDADES DE ARREGLOS");
            System.out.println("Declaracion & Inicializacion");

            int[] arreglo = new int[10];
            Random random = new Random();

            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = random.nextInt(100);
            }


            System.out.println("Recorrido Con For");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println(arreglo[i]);
            }

            System.out.println("Recorrido con For-Each");
            for (int num : arreglo) {
                System.out.println(num);
            }

            System.out.println("Modificacion");
            System.out.println("Impares");
            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i] % 2 != 0) {
                    arreglo[i] = 0;
                }
            }

            System.out.println("Valores multiplicados por su indice");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println("valor a multplicar: " + arreglo[i] + "x" + i);
                arreglo[i] = arreglo[i] * i;
            }

            System.out.println("Arreglo Actualizado");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println(arreglo[i]);
            }


            System.out.println("Busqueda");

            int valor = 50;
            boolean encontrado = false;

            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i] == valor) {
                    System.out.println("Encontrado en posicion: " + i);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontro el valor");
            }

            System.out.println("ACTIVIDADES DE MATRICES");


            System.out.println("Declaracion e Inicializacion");

            int[][] matriz = new int[3][3];

            int valor_ = 1;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matriz[i][j] = valor_++;
                }
            }


            System.out.println("Matriz en forma de tabla");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Recorrido por columna ---");
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Operaciones");

            int suma = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    suma += matriz[i][j];
                }
            }

            System.out.println("Suma total: " + suma);

            for (int j = 0; j < 3; j++) {
                int temp = matriz[0][j];
                matriz[0][j] = matriz[2][j];
                matriz[2][j] = temp;
            }

            System.out.println("Filas intercambiadas");
            System.out.println("Matriz Actualizada");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

