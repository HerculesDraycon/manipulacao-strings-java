/*O programa recebe um nome completo (primeiro e último nome) e o
formata para que as iniciais sejam maiúsculas e o sobrenome esteja
completamente em maiúsculas. Por exemplo, "joão silva" é formatado
para "João SILVA".*/

import java.util.Scanner;
public class String9 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome completo do usuário.");
        String name = input.nextLine();
        String[] apart = name.split(" ");
        String cutfirstname = apart[apart.length-2];
        String cutlastname = apart[apart.length-1].toUpperCase();

        System.out.println(cutfirstname+" "+cutlastname);

        input.close();

    }
}