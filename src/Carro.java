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

    private String cor;
    private String marca;
    private String modelo;
    private boolean ligado;
    private int velocidadeAtual;

    public void acelerar(int velocidadeAMais) {
        if(velocidadeAMais + this.velocidadeAtual > 100) {
            this.velocidadeAtual = 100;
            System.out.printf("Você atingiu a velocidade máxima de %dkm/h", velocidadeAtual);
        } else {
            this.velocidadeAtual += velocidadeAMais;
            System.out.printf("Voce acelerou e a velocidade atual é de %dkm/h", this.velocidadeAtual);
        }
    }

    public void frear(int velocidadeAMenos) {
        if(this.velocidadeAtual == 0) {
            System.out.println("O carro já está parado!");
        } else {
            if(velocidadeAMenos >= velocidadeAtual) {
                this.velocidadeAtual = 0;
            } else {
                this.velocidadeAtual -= velocidadeAMenos;
            }

            System.out.printf("Voce freou e a velocidade atual é de %dkm/h", this.velocidadeAtual);
        }
    }

    public void mostrarEstadoAtual() {
        System.out.println("O estado atual do carro é:");
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidade atual: " + this.velocidadeAtual);
    }

    public void desligar() {
        if(this.velocidadeAtual > 0) {
            System.out.println("ERRO!");
            System.out.println("Não é possível desligar um carro em movimento!");
        } else {
            System.out.println("Voce desligou o carro!");
            this.ligado = false;
        }
    }

    public boolean estaLigado() {
        return ligado;
    }
}
