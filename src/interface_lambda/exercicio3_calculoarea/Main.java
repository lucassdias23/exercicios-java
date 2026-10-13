package interface_lambda.exercicio3_calculoarea;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Supplier;

public class Main {

    private final static String WELCOME_MESSAGE = "=== CALCULADOR DE ÁREA GEOMÉTRICA ===\n";

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(WELCOME_MESSAGE);

        Map<Integer, Supplier<GeometricForm>> formasMap = Map.of(
                1, Main::createSquare,
                2, Main::createRectangle,
                3, Main::createCircle
        );

        while (true) {
            System.out.println("Escolha a forma geométrica para calcular a área\n");
            System.out.println("1. Quadrado");
            System.out.println("2. Retângulo");
            System.out.println("3. Ciruclo");
            System.out.println("4. Sair\n");

            int option = scanner.nextInt();

            if (option == 4) {
                System.out.println("Saindo do sistema... Até logo!");
                break;
            }

            Supplier<GeometricForm> forma = formasMap.get(option);

            if (forma != null) {
                GeometricForm geometricForm = forma.get();
                System.out.println("O resultado do cálculo da área foi de: " + geometricForm.getArea());
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }

    private static GeometricForm createSquare() {
        System.out.println("Informe os tamanhos dos lados:");
        var side = scanner.nextDouble();
        return new Square(side);
    }

    private static GeometricForm createRectangle() {
        System.out.println("Informe a base: ");
        var base = scanner.nextDouble();
        System.out.println("Informe a altura: ");
        var height = scanner.nextDouble();
        return new Rectangle(height, base);
    }

    private static GeometricForm createCircle() {
        System.out.println("Informe o raio: ");
        var radius = scanner.nextDouble();
        return new Circle(radius);
    }


}