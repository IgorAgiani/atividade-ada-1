package notificacoes;

public class Email implements Notificacao {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando Email: " + mensagem);
    }
}
