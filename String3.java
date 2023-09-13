/*O programa verifica se uma string é um palíndromo, ou seja, se ela
é a mesma quando lida de trás para frente. Por exemplo, "radar" é um
palíndromo.*/

import java.util.Scanner;
public class String3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String entry;
        String output = "";

        System.out.println("Digite uma palavra.");
        entry = input.nextLine();

        for(int i = entry.length()-1; i>=0; i--){

            output = output+entry.charAt(i);

        }

        if(output.equals(entry)){
            System.out.println("A palavra é um palíndromo");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }

        input.close();

    }
}
