package multiplicacao;

public class TabuadaMultiplicacao implements Tabuada{

    public void mostratTabuada(int numero) {
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%.2f x %d = %.2f%n", numero, i, numero * i);
        }
    }
}
