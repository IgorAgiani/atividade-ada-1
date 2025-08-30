package veiculos;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        carro.ligarMotor();
        carro.acelerar();
        carro.frear();

        Veiculo moto = new Moto();
        moto.ligarMotor();
        moto.acelerar();
        moto.frear();

        Veiculo bicicleta = new Bicicleta();
        bicicleta.ligarMotor();
        bicicleta.acelerar();
        bicicleta.frear();
    }
}
// Como o uso de default ajuda a evitar duplicação de código nas classes?
// R: O uso de métodos default na interface Veiculo permite que as classes que implementam essa
// interface herdem uma implementação padrão do método ligarMotor().
// Isso evita a necessidade de duplicar o código de ligarMotor() em cada classe, promovendo a reutilização
// de código e facilitando a manutenção.
