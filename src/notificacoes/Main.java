package notificacoes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Notificacao> notificacoes = new ArrayList<>();

        Email email = new Email();
        Sms sms = new Sms();

        notificacoes.add(new Sms());
        notificacoes.add(new Email());

        for (Notificacao notificacao : notificacoes) {
            notificacao.enviarMensagem("Olá! Esta é uma mensagem de notificação.");
        }
    }
}

// Qual vantagem de usar interface se no futuro você quiser adicionar WhatsApp ou Push Notification?
// R: A vantagem de usar interfaces é que elas permitem a adição de novas classes que a implementem.
// Isso facilita a integração de novos tipos de notificações, como WhatsApp ou Push Notification,
// simplesmente criando novas classes que implementem a interface Notificacao.
