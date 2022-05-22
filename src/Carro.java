public class Carro {
    public Carro() {
    }

    public Carro(String cor, String marca, String modelo, boolean ligado, int velocidadeAtual) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = ligado;
        this.velocidadeAtual = velocidadeAtual;
    }

    String cor;
    String marca;
    String modelo;
    boolean ligado;
    int velocidadeAtual;

    public void acelerar() {
        this.velocidadeAtual += 10;
        System.out.println("Voce acelerou e a velocidade atual é: " + this.velocidadeAtual);
    }

    public void frear() {
        this.velocidadeAtual -= 10;
        System.out.println("Voce freou e a velocidade atual é: " + this.velocidadeAtual);
    }

    public void mostrarEstadoAtual() {
        System.out.println("O estado atual do carro é:");
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidade atual: " + this.velocidadeAtual);
    }

    public void desligar() {
        System.out.println("Voce desligou o carro!");
        this.ligado = false;
    }

    public boolean estaLigado() {
        return ligado;
    }
}
