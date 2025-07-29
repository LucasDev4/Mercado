import java.util.Scanner;
public class Supermercado {

    int a   , saldo = 150, quantidade;
    String escolha, comida;
    Scanner scanner = new Scanner(System.in);

    public Supermercado(int a){
        this.a = a;
    }
    public void fileirasSupermercado() {

        switch (a) {
            case 1:
                System.out.println("Você foi na fileira de comida\n");
                System.out.println("Deseja pegar algum item? (Sim/Não)");
                escolha = scanner.next();
                if (escolha.equalsIgnoreCase("sim")) {
                    System.out.println("Qual item seria?");
                    comida = scanner.next();
                    System.out.println("Qual a quantidade desse item você deseja levar?: ");
                    quantidade = scanner.nextInt();
                } else if (escolha.equalsIgnoreCase("nao")) {
                    System.out.println("Você não pegou nada.");
                } else {
                    System.out.println("Resposta invalida, favor escolha 'sim' ou 'nao' ");
                }
                break;
            case 2:
                System.out.println("Você foi na fileira de comida congeladas\n");
                System.out.println("Deseja pegar algum item? (Sim/Não)");
                escolha = scanner.next();
                if (escolha.equalsIgnoreCase("sim")) {
                    System.out.println("Qual item seria? ");
                    comida = scanner.next();
                    System.out.println("Qual a quantidade desse item você deseja levar?: ");
                    quantidade = scanner.nextInt();
                } else if (escolha.equalsIgnoreCase("nao")) {
                    System.out.println("Você não pegou nada.");
                } else {
                    System.out.println("Resposta invalida, favor escolha 'sim' ou 'nao' ");
                }
                break;
            case 3:
                System.out.println("Você foi na padaria\n");
                System.out.println("Deseja pegar algum item? (Sim/Não)");
                escolha = scanner.next();
                if (escolha.equalsIgnoreCase("sim")) {
                    System.out.println("Qual item seria? ");
                    comida = scanner.next();
                    System.out.println("Qual a quantidade desse item você deseja levar?: ");
                    quantidade = scanner.nextInt();
                } else if (escolha.equalsIgnoreCase("nao")) {
                    System.out.println("Você não pegou nada.");
                } else {
                    System.out.println("Resposta invalida, favor escolha 'sim' ou 'nao' ");
                }
                break;
            case 4:
                System.out.println("Você foi na fileira de eletronicos\n");
                System.out.println("Deseja pegar algum item? (Sim/Não)");
                escolha = scanner.next();
                if (escolha.equalsIgnoreCase("sim")) {
                    System.out.println("Qual item seria? ");
                    comida = scanner.next();
                    System.out.println("Qual a quantidade desse item você deseja levar?: ");
                    quantidade = scanner.nextInt();
                } else if (escolha.equalsIgnoreCase("nao")) {
                    System.out.println("Você não pegou nada.");
                } else {
                    System.out.println("Resposta invalida, favor escolha 'sim' ou 'nao' ");
                }
                break;
            case 5:
                System.out.println("Você foi na fileira de medicamentos\n");
                System.out.println("Deseja pegar algum item? (Sim/Não)");
                escolha = scanner.next();
                if (escolha.equalsIgnoreCase("sim")) {
                    System.out.println("Qual item seria? ");
                    comida = scanner.next();
                    System.out.println("Qual a quantidade desse item você deseja levar?: ");
                    quantidade = scanner.nextInt();
                } else if (escolha.equalsIgnoreCase("nao")) {
                    System.out.println("Você não pegou nada.");
                } else {
                    System.out.println("Resposta invalida, favor escolha 'sim' ou 'nao' ");
                }

                break;

            case 6:
                System.out.println("Você foi para o caixa.\n");
                System.out.println("Qual o preço do produto que o cliente escolheu?");
                double preco = scanner.nextDouble();
                double valorfinal = quantidade * preco;
                System.out.println("Total a pagar: " + valorfinal);
                double R = saldo - valorfinal;
                System.out.println("Seu saldo depois da compra: " + R);
                break;
            default:
                System.out.println("Numero invalido, favor escolher um dos numeros a cima");
                break;
        }
    }
}
