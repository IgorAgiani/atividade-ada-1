package pagamentos;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento1 = new CartaoDeCredito();
        pagamento1.pagar(100.0);

        Pagamento pagamento2 = new Pix();
        pagamento2.pagar(50.0);

        Pagamento pagamento3 = new Dinheiro();
        pagamento3.pagar(20.0);
    }
}
// Por que é mais flexível usar uma interface nesse caso do que criar apenas
// uma classe Pagamento com vários if/else?
// R: Usar uma interface permite que diferentes métodos de pagamento sejam
// implementados de forma independente.