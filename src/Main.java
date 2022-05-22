import java.util.Scanner;

/**
 *
 * Criar um carro com os atributos:
 *  - cor
 *  - marca
 *  - modelo
 *  - ligado
 *  - velocidadeAtual
 *
 * Enquanto o carro estiver ligado deve ser capaz de:
 * - Ligar/Desligar
 * - Acelerar
 * - Frear
 * - Motrar estado atual
 *
 * Regras:
 * - Só podemos realizar as ações com o carro ligado
 * - Só podemos desligar o carro quando ele parar (velocidadeAtual = 0)
 * - A velocidade máxima do nosso carro é de 100km/h
 * - Não existe velocidade negativa
 *
 */

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Carro carro = new Carro("Vermelho", "Fiat", "Uno", true, 0);

        int escolha;

        while(carro.estaLigado()) { // Enquanto meu carro estiver ligado ->
            System.out.println();
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - Estado atual");
            System.out.println("0 - Desligar");
            System.out.printf("Operacao: ");
            System.out.println();
            escolha = entrada.nextInt(); // Entrada do usuario

            if(escolha == 1) {
                carro.acelerar(10);
            } else if(escolha == 2) {
                carro.frear(10);
            } else if(escolha == 3) {
                carro.mostrarEstadoAtual();
            } else if(escolha == 0) {
                carro.desligar();
            } else {
                System.out.println("Escolha invalida, tente novamente");
            }
        }

        entrada.close();
    }
}
