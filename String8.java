/*O programa recebe uma frase e a divide em palavras individuais.
Em seguida, imprime cada palavra em uma linha separada.*/

import java.util.Scanner;
public class String8 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma frase.");
        String frase = input.nextLine();

        String[] palavras = frase.split(" ");

        for(String palavra : palavras){
            System.out.println(palavra);
        }

        input.close();

    }
}
