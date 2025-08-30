package pagamentos;

public class CartaoDeCredito implements Pagamento {
    private double taxaDeJuros = 0.05;
    @Override
    public void pagar(double valor) {
        valor = valor * taxaDeJuros + valor;
        System.out.println("Taxa Cartão de Credito: " + taxaDeJuros +"%" +
                "\nTotal no Pagamento com Cartão de Crédito: R$" + valor);
    }
}
