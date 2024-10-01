import java.util.Scanner;

public class CalculadoraEstadisticas {
    public static void main(String[] args) {
        int[] numeros = new int[1000];
        int cantidadNumeros = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un número (o -1 para terminar): ");
            int n = scanner.nextInt();
            if (n == -1) break;
            if (cantidadNumeros < 1000) {
                numeros[cantidadNumeros] = numero;
                cantidadNumeros++;
            } else {
                System.out.println("Se ha alcanzado el límite de números");
                break;
            }
        }

        int sum = 0;
        int max = numeros[0];
        int min = numeros[0];

        for (int i = 0; i < cantidadNumeros; i++) {
            sum += numeros[i];
            if (numeros[i] > max) max = numeros[i];
            if (numeros[i] < min) min = numeros[i];
        }

        double promedio = sum / cantidadNumeros;

        System.out.println("Suma: " + sum);
        System.out.println("Promedio: " + promedio);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);

        scanner.close();
    }
}
