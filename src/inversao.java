import java.util.Scanner;

public class inversao
{
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            double numero1, numero2, conserva;
            String nome;

            System.out.print("Olá, qual seu nome? ");
            nome = entrada.nextLine();

            System.out.print("Qual o primeiro numero que deve ser invertido, e passara ocupar a segunda local? ");
            numero1 = entrada.nextDouble();

            System.out.print("Qual o segundo numero que deve ser invertido, e passara ocupar on primeiro local? ");
            numero2 = entrada.nextDouble();

            conserva = numero1;
            numero1 = numero2;
            numero2 = conserva;

            System.out.print(nome + " Agora, o primeiro numero se tornou a ser: " + numero1);
            System.out.print(" E o segundo se tornou a ser: " + numero2);

            entrada.close();
        }
    }

