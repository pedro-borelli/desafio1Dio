package exerciciosDio;

import java.util.Scanner;

public class ParEImpar {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de n�meros: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("N�mero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0 ) quantPares++;
            else quantImpares++;

            count++;
        } while(count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade �mpar: " + quantImpares);

	}

}
