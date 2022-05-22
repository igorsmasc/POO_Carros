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
 * - Só podemos desligar o carro quando ele parar (velocidadeAtual = 0)
 * - Só podemos realizar as ações com o carro ligado
 * - A velocidade máxima do nosso carro é de 100km/h
 * - Não existe velocidade negativa
 * - Acelerar + 10km/h (Aumenta 10)
 * - Frear - 10km/h (Diminui 10)
 *
 */

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Atributos
        String cor = "Vermelho";
        String marca = "Fiat";
        String modelo = "Uno";
        boolean ligado = true;
        int velocidadeAtual = 0;

        int escolha;

        while(ligado) { // Enquanto meu carro estiver ligado ->
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
                velocidadeAtual += 10;
                System.out.println("Voce acelerou e a velocidade atual é: " + velocidadeAtual);
            } else if(escolha == 2) {
                velocidadeAtual -= 10;
                System.out.println("Voce freou e a velocidade atual é: " + velocidadeAtual);
            } else if(escolha == 3) {
                System.out.println("O estado atual do carro é:");
                System.out.println("Cor: " + cor);
                System.out.println("Marca: " + marca);
                System.out.println("Modelo: " + modelo);
                System.out.println("Velocidade atual: " + velocidadeAtual);
            } else if(escolha == 0) {
                System.out.println("Voce desligou o carro!");
                ligado = false;
            } else {
                System.out.println("Escolha invalida, tente novamente");
            }
        }

        entrada.close();
    }
}
