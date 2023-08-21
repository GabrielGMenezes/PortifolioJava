package Conta_Bancaria;


import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {


        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        String nomeCliente;
        String agencia;
        int conta;
        BigDecimal saldo;


        //TODO: Exibir as mensagens para o nosso usuário:
        System.out.println("Olá, seja Bem-Vindo a nossa central do Banco Digital Terminal!!!");

        System.out.println("Vamos dar Sequencia e abrir sua conta, preciso que me forneça alguns dados...");

        //TODO: Obter pelo scanner os valores digitados no terminal:
        System.out.print("Por favor, digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.print("Digite o número da sua conta (com digito separado por '-') : ");
        agencia = scanner.next();

        System.out.print("Digite o número da sua conta: ");
        conta = scanner.nextInt();

        System.out.print("Digite o valor que você gostaria de depositar na sua conta: ");
        saldo = scanner.nextBigDecimal();

        //TODO: Exibir a mensagem conta criada:

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, número da sua conta %d, e o saldo disponivel é de %.2f",
                nomeCliente, agencia, conta, saldo);

    }

}
