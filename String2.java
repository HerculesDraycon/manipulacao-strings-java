/*O Programa inverte uma string dada pelo usuário. Por exemplo, se
o usuário inserir "Hello", o programa exibe "olleH".*/

import java.util.Scanner;
public class String2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String entry;
        String output = "";

        System.out.println("Digite uma frase.");
        entry = input.nextLine();

        for(int i = entry.length()-1; i>=0; i--){

            output = output+entry.charAt(i);

        }

        System.out.println(output);

        input.close();
    }
}
