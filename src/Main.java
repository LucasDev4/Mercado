import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá viajante, você deseja entrar neste restuarante?? (sim/nao)");
        String resposta = scanner.next();


        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Você escolheu entrar: \n");
            System.out.println("Cardapio: ");
            System.out.println("(====================================================================================)");
            System.out.println("(   1 PF. (Arroz, Feijão, Bife de carne bovina e Farofa) 16 R$                       )");
            System.out.println("(                                                                                    )");
            System.out.println("(   2 Macarrão a bolonhesa. 20 R$                                                    )");
            System.out.println("(                                                                                    )");
            System.out.println("(   3 Calabresa. (Arroz, Feijão, Calabresa, salada e tomate) 16 R$                   )");
            System.out.println("(                                                                                    )");
            System.out.println("(   4 Omelete. (Arroz, Feijão, Omelete com presunto e queijo, salada e tomate) 22 R$ )");
            System.out.println("(                                                                                    )");
            System.out.println("(                        [Para ir embora pressione: 5.]                              )");
            System.out.println("(                                                                                    )");
            System.out.println("(====================================================================================)");

            System.out.println("Qual numero você deseja escolher?");
           int a = scanner.nextInt();
           Restaurante restaurante = new Restaurante(a);
           while (a <= 5){
               restaurante.opcaoRestaurante();
           }
        }else if (resposta.equalsIgnoreCase("nao")) {
            System.out.println("Você decidiu não entrar.\n");
            System.out.println("Deseja entrar na proxima loja?");
            resposta = scanner.next();
            if (resposta.equalsIgnoreCase("sim")) {
                System.out.println("Você decidiu entrar na loja\n");
                System.out.println("-----------------------------------Seja bem-vindo ao Wallmarkt.-----------------------------------\n");
                System.out.println("Deseja andar pelas fileiras do supermercado? ");
                resposta = scanner.next();
                if (resposta.equalsIgnoreCase("sim")) {
                    System.out.println("As fileiras são: \n1-Comidas. \n2-Comidas congeladas. \n3-Padaria. \n4-Eletronicos. \n5-Medicamentos. \n6-Caixa.");
                    int a = scanner.nextInt();
                    Supermercado supermercado = new Supermercado(a);
                    while (a <=5){
                        supermercado.fileirasSupermercado();
                    }
                }
                else if (resposta.equalsIgnoreCase("nao")) {
                    System.out.println("Você decidiu so andar pelo mercado.");
                }
                else {
                    System.out.println("Resposta invalida, favor escolha 'sim' ou 'nao' ");
                }
            }
        }
        else{
            System.out.println("Resposta invalida, favor escolha 'sim' ou 'nao' ");
        }
        scanner.close();
    }
}