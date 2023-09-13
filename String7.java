/*O programa recebe uma string do usuário e exibe uma substring dessa
string, mas invertida. Por exemplo, se o usuário inserir "abcdefg" e
escolher os índices 2 a 5, o programa exibe "edcb".*/

import java.util.Scanner;
public class String7{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma palavra.");
        String word = input.nextLine();
        System.out.println("Digite o índice de início.");
        int firstcut = input.nextInt();
        System.out.println("Digite o índice do final.");
        int lastcut = input.nextInt();

        if(firstcut>=0 && firstcut<word.length() && lastcut>=firstcut && lastcut<word.length()){
            String sub = word.substring(firstcut, lastcut+1);
            String reverse = new StringBuilder(sub).reverse().toString();

            System.out.print("String invertida: "+reverse);
        } else {
            System.out.println("Os índices selecionados são inválidos");
        }

        input.close();

    }
}