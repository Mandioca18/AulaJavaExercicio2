import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int soma;

        System.out.println("Vamos somar Números!! \n Digite o primeiro número");
        int Numero1 = scan.nextInt();

        System.out.println("Digite o segundo número");
        int Numero2 = scan.nextInt();

        soma = Numero1 + Numero2;

        System.out.println("A Soma dos números é igual a " + soma);

        }
    }
// Nas Primeiras vezes que tentem fazer isso, fui muito idiota e desatento, esqueci que precisava declarar a variável
// apenas uma vez