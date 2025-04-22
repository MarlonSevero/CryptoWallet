package br.com.fiap.view;

import br.com.fiap.service.MenuHandler;

public class Main {
    public static void main(String[] args) {
        MenuHandler menuHandler = new MenuHandler();
        menuHandler.exibirMenuPrincipal();

//        try {
//        Scanner scanner = new Scanner(System.in);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        int control;
//        LocalDate dt_birth = null;
//        CoinBitcoin coinBitcoin = new CoinBitcoin();
//        CoinSolana coinSolana = new CoinSolana();
//        CoinUsdt coinUsdt = new CoinUsdt();
//        CoinDog coinDog = new CoinDog();


//        System.out.println("Bem-Vindo ao sistema My Digital Assents Home");
//        System.out.println("Aqui voce tem tudo sobre o mundo CRYPTO na palma da sua mao!");
//            do {
//                System.out.println("-----------------------------------------------------");
//                System.out.println("Escolha uma opcao:");
//                System.out.println("1-Cadastrar\n2-Exibir principais moedas\n3-Login\n4-Deposito\n5-Saque \n0-Sair\n");
//                System.out.println("-----------------------------------------------------");
//                    control = scanner.nextInt();
//                    switch (control) {
//                        case 1:
//                            System.out.println("Infome seu nome completo:");
//                            String temp_name = scanner.next() + scanner.nextLine();
//
//                            while (dt_birth == null) {
//                                System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
//                                String dt_birthString = scanner.nextLine();
//                                dt_birth = LocalDate.parse(dt_birthString, formatter);
//                            }
//                            System.out.println("Informe sua renda mensal:");
//                            double temp_renda = scanner.nextDouble();
//                            scanner.nextLine(); //consome o /n
//                            System.out.println("Informe seu CPF:");
//                            String temp_cpf = scanner.nextLine();
//                            System.out.println("Informe seu email:");
//                            String temp_email = scanner.nextLine();
//                            System.out.println("Informe sua senha:");
//                            String temp_password = scanner.nextLine();
//
//                            Account account = new Account(temp_name, dt_birth, temp_renda, temp_cpf, temp_email, temp_password);
//                            accountDao.create(account);
//
//                            System.out.print("Informe o nome da sua Cidade,o rua, o bairro, o numero e o complemento...\n" +
//                                    "Teclando enter ao final de cada um:\n");
//                            Address temp_address = new Address(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.next() + scanner.nextLine());
//                            addressdao.create(temp_address);
//                            System.out.println("Conta Criado com sucesso!");
//                            Thread.sleep(1000);
//                            break;

                            /*case 2:
                            if (coinBitcoin.getCoinPriceBitcoinUsd() != -1) {
                                System.out.println("Voce quer ver o valor em 1 - USD ou 2 - BRL?");
                                int i = scanner.nextInt();
                                if (i == 1) {
                                    System.out.println(coinBitcoin.bitcoinDataUsd());
                                    System.out.println(coinSolana.solanaDataUsd());
                                    System.out.println(coinUsdt.usdtDataUsd());
                                    System.out.println(coinDog.dogDataUsd());
                                    break;
                                } else if (i == 2) {
                                    System.out.println(coinBitcoin.bitcoinDataBrl());
                                    System.out.println(coinSolana.solanaDataBrl());
                                    System.out.println(coinUsdt.usdtDataBrl());
                                    System.out.println(coinDog.dogDataBrl());
                                    break;
                                } else {
                                    System.out.println("Opcao Invalida!");
                                    break;
                                }
                            } else {
                                System.out.println("Erro ao obter valor!");
                                break;
                            }
                        case 3:
                            if (new_user.getName() != null) {
                                System.out.println("Infome o seu email:");
                                String emai_login = scanner.next() + scanner.nextLine();
                                System.out.println("Informe a sua senha:");
                                String emai_pass = scanner.next() + scanner.nextLine();
                                if (emai_login.equals(login.getEmail()) && emai_pass.equals(login.getPassword())) {
                                    System.out.println("Usuario logado!");
                                } else {
                                    System.out.println("Dados Invalidos!");
                                }
                                break;
                            } else {
                                System.out.println("Sem registro no sistema!");
                                break;
                            }
                        case 4:
                            System.out.println("//Simula deposito");
                            break;
                        case 5:
                            System.out.println("//Simula saque");
                            break;*/
//                        case 0:
//                            System.out.println("Obrigado por usar a `My Digital Assents Home`");
//                            break;
//                        default:
//                            System.out.println("Opcao Invalida!");
//                    }
//                } while (control != 0) ;
//            } catch(Exception e){
//                throw new RuntimeException(e);
//            }
        }
    }
//REFATORACAO DEIXANDO O CODIGO MAIS MODULAR (SUGESTAO DO CHATGPT)
//✅ Main → Apenas inicialização e chamada de menus
//✅ MenuHandler → Lida com a interação do usuário
//✅ UserService → Gerencia usuários (cadastro e login)
//✅ CryptoService → Obtém preços de criptomoedas