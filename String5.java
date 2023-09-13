/*O programa recebe uma string com espaços em excesso e retorna uma
nova string com apenas um espaço entre as palavras.*/

import java.util.Scanner;
public class String5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma frase.");
        String text = input.nextLine();

        System.out.println(text.replaceAll("\\s+", " "));

        input.close();

    }
}
