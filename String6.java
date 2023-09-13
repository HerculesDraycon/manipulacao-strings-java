/*O programa conta quantas vezes uma determinada letra aparece em uma
string dada pelo usuário.*/

import java.util.Scanner;
public class String6 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String text;
        int contador = 0;

        System.out.println("Digite uma frase.");
        text = input.nextLine();
        System.out.println("Digite a letra que deve ser contada.");
        char letter = input.next().charAt(0);

        for(int i=0; i<text.length(); i++){

            if(text.charAt(i)==letter){
                contador++;
            }

        }

        System.out.println("O número de vezes que a letra aparece é: "+contador);

        input.close();

    }

}
