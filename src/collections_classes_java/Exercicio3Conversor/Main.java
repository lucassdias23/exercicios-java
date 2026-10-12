package collections_classes_java.Exercicio3Conversor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static String WELCOME_MESSAGE = "=== CONVERSOR MULTIFORMATO (JSON / XML / YAML) ===";

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        List<Field> fields = new ArrayList<>();

        System.out.println(WELCOME_MESSAGE);
        System.out.println("\nDigite o nome nos formatos: NOME_CAMPO;VALOR;TIPO");
        System.out.println("Digite 'sair' para finalizar e gerar os arquivos.\n");

        while (true) {
            System.out.println("Informe a entrada: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("sair") || input.isEmpty()) {
                break;
            }

            String[] parts = input.split(";");

            if (parts.length >= 3) {
                String name = parts[0].trim();
                String value = parts[1].trim();
                String typeStr = parts[2].trim();

                DataType type = DataType.fromString(typeStr);
                fields.add(new Field(name, value, type));
                System.out.println("-> Campo adicionado com sucesso!");
            } else {
                System.out.println("Formato inválido! Tente novamente usando: NOME;VALOR;TIPO");
            }

        }

        if (fields.isEmpty()) {
            System.out.println("Nenhum campo foi digitado. Encerrando o programa...");
        }
        else  {
            System.out.println("\n=== RESULTADOS GERADOS ===");

            System.out.println("\n--- JSON ---");
            System.out.println(DataConverter.toJson(fields));

            System.out.println("\n--- XML ---");
            System.out.println(DataConverter.toXml(fields));

            System.out.println("\n--- YAML ---");
            System.out.println(DataConverter.toYaml(fields));
        }

    }

}
