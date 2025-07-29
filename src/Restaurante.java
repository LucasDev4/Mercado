import java.util.Scanner;

public class Restaurante {
    int a, saldo = 150;
    String caixa;
    Scanner scanner = new Scanner(System.in);

    public Restaurante(int a){
        this.a = a;
    }
    public void opcaoRestaurante(){
     switch (a) {
        case (1):
            System.out.println("Você escolheu PF,aqui esta sua comida, bom apetiti  :)\n");
            System.out.println("Preço a pagar: 16 R$\n");
            System.out.println("Algo mais ou deseja ir ao caixa? (sim/nao)\n");
            caixa = scanner.next();
            if (caixa.equalsIgnoreCase("sim")){
                System.out.println("Você foi para o caixa\n");
                System.out.println("Qual valor do seu prato? ");
                int pratopreco = scanner.nextInt();
                System.out.println("Total a pagar: " + pratopreco);
                int R = saldo - pratopreco;
                System.out.println("Seu saldo depois da compra é: " + R);
                break;
            } else if (caixa.equalsIgnoreCase("nao")) {
                System.out.println("Você decidiu ficar na mesa.");
            }
            else {
                System.out.println("Opcão invalida");
            }
            break;
        case (2):
            System.out.println("Você escolheu macarrão a bolonhesa, aqui esta sua comida, bom apetiti  :)\n");
            System.out.println("Preço a pagar: 20 R$\n");
            System.out.println("Algo mais ou deseja ir ao caixa? (sim/nao)\n");
            caixa = scanner.next();
            if (caixa.equalsIgnoreCase("sim")){
                System.out.println("Você foi para o caixa\n");
                System.out.println("Qual valor do seu prato? ");
                int pratopreco = scanner.nextInt();
                System.out.println("Total a pagar: " + pratopreco);
                int R = saldo - pratopreco;
                System.out.println("Seu saldo depois da compra é: " + R);
                break;
            } else if (caixa.equalsIgnoreCase("nao")) {
                System.out.println("Você decidiu ficar na mesa.");
            }
            else {
                System.out.println("Opcão invalida");
            }
            break;
        case (3):
            System.out.println("Você escolheu calabresa, aqui esta sua comida, bom apetiti :)\n");
            System.out.println("Preço a pagar: 16 R$\n");
            System.out.println("Algo mais ou deseja ir ao caixa? (sim/nao)\n");
            caixa = scanner.next();
            if (caixa.equalsIgnoreCase("sim")){
                System.out.println("Você foi para o caixa\n");
                System.out.println("Qual valor do seu prato? ");
                int pratopreco = scanner.nextInt();
                System.out.println("Total a pagar: " + pratopreco);
                int R = saldo - pratopreco;
                System.out.println("Seu saldo depois da compra é: " + R);
                break;
            } else if (caixa.equalsIgnoreCase("nao")) {
                System.out.println("Você decidiu ficar na mesa.");
            }
            else {
                System.out.println("Opcão invalida");
            }
            break;
        case (4):
            System.out.println("Você escolheu omelete, aqui esta sua comida, bom apetiti  :)\n");
            System.out.println("Preço a pagar: 22 R$\n");
            System.out.println("Algo mais ou deseja ir ao caixa? (sim/nao)\n");
            caixa = scanner.next();
            if (caixa.equalsIgnoreCase("sim")){
                System.out.println("Você foi para o caixa\n");
                System.out.println("Qual valor do seu prato? ");
                int pratopreco = scanner.nextInt();
                System.out.println("Total a pagar: " + pratopreco);
                int R = saldo - pratopreco;
                System.out.println("Seu saldo depois da compra é: " + R);
                break;
            } else if (caixa.equalsIgnoreCase("nao")) {
                System.out.println("Você decidiu ficar na mesa.");
            }
            else {
                System.out.println("Opcão invalida");
            }
            break;
        case (5):
            System.out.println("Você escolheu sair do restaurante.");
            break;
        default:
            System.out.println("Numero invalido, favor escolher um dos pratos a cima");
            break;

        }
    }
}
