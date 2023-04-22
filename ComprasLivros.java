import java.util.Scanner;
import java.text.DecimalFormat;

public class ComprasLivros {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        String nome;
        double preco;
        int quantidade;

        String nome2;
        double preco2;
        int quantidade2;

        nome = scanner.nextLine();
        preco = scanner.nextDouble();
        quantidade = scanner.nextInt();
        scanner.nextLine();

        nome2 = scanner.nextLine();
        preco2 = scanner.nextDouble();
        quantidade2 = scanner.nextInt();

        // Instancia 2 objetos do tipo "Livro" com os dados de entrada.
        Livro livro1 = new Livro(nome, preco, quantidade);
        // Limpa o buffer do teclado
        Livro livro2 = new Livro(nome2, preco2, quantidade2);

        //TODOConsiderando os objetos "livro1" e "livro2", calcule o valor total da compra.
        double total = (livro1.getPreco() * livro1.getQuantidade() + livro2.getPreco() * livro2.getQuantidade());

        //TODOConsiderando os objetos "livro1" e "livro2", calcule o número de livros comprados.
        int qtdLivros;
        qtdLivros = livro1.getQuantidade() + livro2.getQuantidade();

        //TODOImprima as linhas necessárias conforme a saída deste desafio.
        System.out.println("Valor total da compra: " + deci.format(total));
        System.out.println("Numero de livros comprados: "+qtdLivros);
        
        System.out.println("Obrigado por comprar na nossa livraria!");
        scanner.close();

    }

    static class Livro {

        private String nome;
        private double preco;
        private int quantidade;

        Livro(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        public Livro() {

        }

        public String getNome() {

            return nome;

        }

        public void setNome(String nome) {

            this.nome = nome;
        }

        public double getPreco() {

            return preco;

        }

        public void setPreco(double preco) {

            this.preco = preco;
        }

        public int getQuantidade() {

            return quantidade;

        }

        public void setQuantidade(int quantidade) {

            this.quantidade = quantidade;
        }

    }

}
/*
meu calculo
double calc1, calc2, calc3;
int qtdLivros;
calc1 = livro1.preco * livro1.quantidade;
calc2 = livro2.preco * livro2.quantidade;
calc3 = calc1 + calc2;

qtdLivros = livro1.quantidade + livro2.quantidade;

System.out.println("Valor total da compra:" + deci.format(calc3));
System.out.println("Numero de livros comprados:" + qtdLivros);
System.out.println("Obrigado por comprar na nossa livraria!");

*/