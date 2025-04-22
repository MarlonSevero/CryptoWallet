package br.com.fiap.service;

import java.util.Scanner;

public class MenuHandler {

    private final Scanner scanner = new Scanner(System.in);
    private final UserService userService = new UserService();
    private final CryptoService cryptoService = new CryptoService();

    public void exibirMenuPrincipal() {
        int control;
        System.out.println("Bem-vindo ao sistema My Digital Assets Home");

        do {
            System.out.println("-----------------------------------------------------");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Exibir principais moedas");
            System.out.println("3 - Login");
            System.out.println("4 - Depósito");
            System.out.println("5 - Saque");
            System.out.println("0 - Sair");
            System.out.println("-----------------------------------------------------");

            control = scanner.nextInt();
            scanner.nextLine(); // consumir linha
            switch (control) {
                case 1: userService.registerUser(scanner);
                break;
                case 2: showValues();
                break;
                //case 3 -> userService.login(scanner);
//                case 4 System.out.println("Depósito simulado.");
//                case 5 -> System.out.println("Saque simulado.");
//                case 0 -> System.out.println("Obrigado por usar o My Digital Assets Home!");
                default: System.out.println("Opção inválida.");
                    break;
            }
        } while (control != 0);
    }

    private void showValues(){
        System.out.println("Você quer ver o valor das moedas em:");
        System.out.println("1 - USD");
        System.out.println("2 - BRL");
        int opcaoMoeda = scanner.nextInt();
        scanner.nextLine(); // limpa buffer
        cryptoService.showValues(opcaoMoeda);
    }
}