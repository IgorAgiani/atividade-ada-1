package pagamentos;

public class Pix implements Pagamento {

    private double taxaDeJuros = 0.02;

    @Override
    public void pagar(double valor) {
        valor = valor * taxaDeJuros + valor;
        System.out.println("Taxa Pix: " + taxaDeJuros +"%" +
                "\nTotal no Pagamento com Pix: R$" + valor);
    }
}
