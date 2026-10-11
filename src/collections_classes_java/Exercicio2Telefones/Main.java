package collections_classes_java.Exercicio2Telefones;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

       Telephone tipoTelefone = null;

       while (tipoTelefone == null) {
           System.out.println("Informe o número de telefone: ");
           String input = scanner.nextLine();

           String cleanedInput = input.replaceAll("[^0-9]", "");
           int length = cleanedInput.length();

           tipoTelefone = Telephone.getTelephone(length);

           if (tipoTelefone != null) {
              String numberFormated = tipoTelefone.format(cleanedInput);

               System.out.println("Tipo identificado: " + tipoTelefone.getDescription());

               System.out.println("Número formatado: " +  numberFormated);


           } else {
               System.out.println("Número de telefone inválido! Tente novamente.\n");
           }
       }


    }

}