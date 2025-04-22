package br.com.fiap.service;
import br.com.fiap.dao.AccountDao;
import br.com.fiap.dao.Addressdao;
import br.com.fiap.model.user.Account;
import br.com.fiap.model.user.Address;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserService {

    public void registerUser(Scanner scanner) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            AccountDao accountDao = new AccountDao();
            Addressdao addressdao = new Addressdao();
            Account contaCadastrada = new Account();
            Address address = new Address();

            System.out.println("Informe seu nome completo:");
            String nome = scanner.nextLine();

            System.out.println("Digite sua data de nascimento (dd/MM/yyyy): ");
            LocalDate dtNascimento = LocalDate.parse(scanner.nextLine(), formatter);

            contaCadastrada.setDt_birth(dtNascimento);
            contaCadastrada.setName(nome);

            System.out.println("Informe sua renda mensal:");
            double renda = scanner.nextDouble();
            scanner.nextLine(); // consumir linha

            System.out.println("Informe os dados do endereço:");
            System.out.print("Rua: ");
            address.setRua(scanner.nextLine());
            System.out.print("Bairro: ");
            address.setBairro( scanner.nextLine());
            System.out.print("Número: ");
            address.setNumero(scanner.nextLine());
            System.out.print("Complemento: ");
            address.setComplemento(scanner.nextLine());
            System.out.print("Cidade: ");
           address.setCidade(scanner.nextLine());
            int idAddress = addressdao.save(address);
            System.out.println("ID Address:" + idAddress);

            System.out.println("Informe seu CPF:");
            contaCadastrada.setCpf(scanner.nextLine());
            System.out.println("Informe seu email:");
            contaCadastrada.setEmail(scanner.nextLine());
            System.out.println("Informe sua senha:");
            contaCadastrada.setPassword(scanner.nextLine());

            contaCadastrada.setId_address(idAddress);
            accountDao.create(contaCadastrada);

            System.out.println("Conta criada com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar usuário: " + e.getMessage());
        }
    }
}
