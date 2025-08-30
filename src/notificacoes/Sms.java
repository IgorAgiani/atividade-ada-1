package notificacoes;

public class Sms implements Notificacao{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
