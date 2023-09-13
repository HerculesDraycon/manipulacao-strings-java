/*O programa conta quantas vogais (a, e, i, o, u) existem em uma
string dada pelo usuário.*/

import java.util.Scanner;
public class String4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String text;
        int vogal = 0;

        System.out.println("Digite uma frase.");
        text = input.nextLine();

        for(int i=0; i<text.length(); i++){

            char caractere = text.charAt(i);

            switch(caractere){

                case 'a':
                    vogal++;
                    break;
                case 'e':
                    vogal++;
                    break;
                case 'i':
                    vogal++;
                    break;
                case 'o':
                    vogal++;
                    break;
                case 'u':
                    vogal++;
                    break;

            }

        }

        System.out.println("O número de vogais encontradas é: "+vogal);

        input.close();

    }
}