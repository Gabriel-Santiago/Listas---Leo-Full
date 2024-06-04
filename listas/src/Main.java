import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(new Pessoa("Gabriel", 24, 1.73, 70.2));
        listaDePessoas.add(new Pessoa("Emily", 11, 1.55, 50.4));
        listaDePessoas.add(new Pessoa("Maria", 76, 1.53, 46.8));

        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));

        System.out.println("Lista completa de pessoas:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}