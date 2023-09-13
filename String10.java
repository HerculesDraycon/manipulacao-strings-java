/*O programa recebe um nome completo e o formata para que as iniciais
gerem um e-mail. Por exemplo, "Carlos Silva Almeida" é formatado
como "csa@empresa.com.br".*/

import java.util.Scanner;
public class String10 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome completo do usuário.");
        String name = input.nextLine();
        System.out.println("Digite a rede do e-mail.");
        String netadrs = input.nextLine();

        String[] apart = name.split(" ");

        String part1 = apart[apart.length-3];
        String init1 = part1.substring(0, 1).toLowerCase();
        String part2 = apart[apart.length-2];
        String init2 = part2.substring(0,1).toLowerCase();
        String part3 = apart[apart.length-1];
        String init3 = part3.substring(0,1).toLowerCase();

        System.out.println(init1+init2+init3+"@"+netadrs+".com.br");

        input.close();

    }
}
