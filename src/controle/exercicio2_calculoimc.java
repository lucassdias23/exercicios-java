package controle;

// Escreva um código onde o usuário informa a sua altura e peso, e depois seja feito o cálculo do seu IMC. (IMC = peso(altura * altura)), e seja exibida a mensagem de acordo com o resultado.

import java.util.Scanner;

public class exercicio2_calculoimc {

    private static final String WELCOME_MESSAGE = "Bem vindo ao sistema de cálculo de IMC";

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);

        System.out.println("Para começarmos, informe o seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Perfeito, agora informe a sua altura (ex: 1,70m): ");
        double altura = scanner.nextDouble();

        var imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.printf("Seu IMC é de %.2f. Você está abaixo do peso.\n", imc);

        } else if (imc > 18.5 && imc < 24.9) {
            System.out.printf("Seu IMC é de %.2f. Você está no peso ideal.\n", imc);

        } else if (imc > 24.9 && imc < 29.9) {
            System.out.printf("Seu IMC é de %.2f. Você está levemente acima do peso. Vale um ponto de atenção. Reeducação alimentar para manter o peso estável, e práticas regulares de exercícios físicos.\n", imc);

        } else if (imc > 29.9 && imc < 34.9) {
            System.out.printf("Seu IMC é de %.2f. Obesidade Grau I: Exige ponto de atenção. Mantenha uma dieta equilibrada com práticas regulares de exercícios.\n", imc);

        } else if (imc > 34.9 && imc < 39.9) {
            System.out.printf("Seu IMC é de %.2f. Obesidade Grau II (Severa): Exige ponto de atenção. Mantenha uma dieta equilibrada, moderada em calorias com práticas regulares de exercícios.\n", imc);

        } else {
            System.out.printf("Seu IMC é de %.2f. Obesidade Grau III (Mórbida) Exige atenção e acompanhamento de especialista para auxiliar na perda de peso.\n", imc);
        }

    }
}
