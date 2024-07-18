/*
 * Dados iniciais do cliente:
 * 
 * Nome:            Jacqueline Oliveira
 * Tipo conta:      Corrente
 * Saldo inicial:   R$ 2500,00
 * 
 * Operações
 * 
 * 1- Consultar saldos
 * 2- Receber valor
 * 3- Transferir valor 
 * 4- Sair
 * 
 * Usuário deve poder escolher o tipo de operação e ela deve ocorrer e mostrar para o usuário.
 * 
 * Possiveis funções / classes:
 * iniciar dados do cliente @
 * verificar dados @
 * menu opções
 * vizualizar saldo
 * enviar valor
 * receber valor
 * 
 * acredito que n sera necessario a criação de classes, mas posso evoluir futuramente para um projeto com classes, deixando-o mais "completo"
 */


import java.util.*;


public class Main {
    public static String listening (String text) {
        @SuppressWarnings("resource")
        Scanner listen = new Scanner(System.in);

        System.out.println(text);
        String answer = listen.nextLine();
        return answer;
    }

    public static void waitInput () {
        @SuppressWarnings("resource")
        Scanner waiting = new Scanner(System.in);
        waiting.nextLine();
    }

    public final static void clearConsole () {
        System.out.print("\033\143");
    }
   
    public static void customerLogin () {
        while (true) {
            clearConsole();
            int password;
            String loginName = "Lucky";
            int pinNumber = 1234;

            System.out.println(loginName);
            password = Integer.parseInt(listening("PIN number: "));

            if (password == pinNumber) {
                System.out.println("");
                System.out.println("Logged in successfully. \nWelcome to your account!");
                return;
            }
            System.out.println("Password is incorrect.");
            waitInput();
        }
        
    }

    public static void balance (double balanceBank) {
        System.out.println("Your current balance is now: $" + balanceBank);
        waitInput();
    }

    public static double depositValue (double balanceBank) {
        double value = Double.parseDouble(listening("What will the pay-in amount be?"));
        balanceBank += value;

        balance(balanceBank);
        return balanceBank;
    }

    public static double transferValue (double balanceBank) {
        double value = Double.parseDouble(listening("How much would you like to transfer? "));

        if (value > balanceBank) {
            System.out.println("NSF (Non-Sufficient Fund).");
            waitInput();

            while (true) {
                clearConsole();
                int choise = Integer.parseInt(listening("Would you like to enter the value again?\n1- Yes.\n2- No.\n"));
                
                if (choise == 1) {
                    return transferValue(balanceBank);
                } 
                if (choise == 2) {
                    return balanceBank;
                }
                System.out.println("Erro. Try again.");
            }
        }

        balanceBank -= value;

        System.out.println("You transfer $" + value);
        balance(balanceBank);

        return balanceBank;
    }

    public static void menu () {
        int choise;
        double balanceBank = 2500.00;

        customerLogin();
        while (true) {
            clearConsole();
            System.out.println("-----------------------------------");
            System.out.println("1- Account Balance");
            System.out.println("2- Deposit Value");
            System.out.println("3- Transfer Value");
            System.out.println("4- Exit");
            System.out.println("-----------------------------------");

            choise = Integer.parseInt(listening(""));
            clearConsole();
            switch (choise) {
                case 1:
                    balance(balanceBank);
                    break; 
                case 2:
                    balanceBank = depositValue(balanceBank);
                    break;
                case 3:
                    balanceBank = transferValue(balanceBank);
                    break;
                case 4:
                    System.out.println("Thanks for your preference.\nHave a good day!");
                    return;
                default:
                    System.out.println("Erro. Please, try again.");
                    waitInput();
                    break;
            }
        }
    }

    public static void main (String[] args) {
        menu();
    }
}