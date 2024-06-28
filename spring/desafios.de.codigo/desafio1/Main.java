package desafio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = UserManager.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos usuários você deseja cadastrar? ");
        int numUsers = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numUsers; i++) {
            System.out.print("Informe o nome do usuário: ");
            String name = scanner.nextLine();
            userManager.addUser(name);
        }

        System.out.println("Usuários cadastrados:");
        userManager.listUsers();

        scanner.close();
    }
}
