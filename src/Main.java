import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int n = 23;
        gravarEmMemoria();
        System.out.println("O fatorial recursivo " + n + " é: " + fatorial(n));
        System.out.println("O fatorial dinâmico " + n + " é: " + fatorialDinamico(n));

    }

    // Usando função recursiva
    public static long fatorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * fatorial(n - 1);
    }

    // Usando programação dinâmica

    private static final int TAMANHO = 100;
    public static long[] memoria = new long[TAMANHO];

    public static void gravarEmMemoria() {
        Arrays.fill(memoria, -1);
    }

    public static long fatorialDinamico(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número deve ser não-negativo.");
        }

        if (n == 1 || n == 0) {
            return 1;
        }

        if(memoria[n] != -1) {
            memoria[n] = n;
        } else {
            memoria[n] = n * fatorialDinamico(n - 1);
        }
        return memoria[n];
    }

}