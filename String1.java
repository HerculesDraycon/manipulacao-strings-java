/*O programa recebe uma string do usuário e conta quantos caracteres ela
possui (incluindo espaços em branco).*/

import java.util.Scanner;
public class String1{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String frase;

        System.out.println("Digite uma frase.");
        frase = input.nextLine();

        int lenght = frase.length();

        System.out.println("A frase possui "+lenght+" caracteres.");

        input.close();

    }
}