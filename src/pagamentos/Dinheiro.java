package pagamentos;

public class Dinheiro implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento no Dinheiro nâo tem cobrança de taxa." +
                "\nPagamento em dinheiro no valor de: R$ " + valor);
    }
}
