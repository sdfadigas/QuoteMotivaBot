import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class QuoteMotivaBot extends TelegramLongPollingBot {
    //nesse método que vamos incluir os comandos do bot
    @Override
    public void onUpdateReceived(Update update) {

        //System.out.println(update.getMessage().getText()); esse método é pra mostrar no IDE o que o usuário escreveu
        //System.out.println(update.getMessage().getFrom().getFirstName()); esse método é pra mostrar no IDE o nome do usuário q escreveu

        String command = update.getMessage().getText();
        if (command.equals("/boasvindas")) {
            String message = "Seja bem vindo(a) ao nosso bot de mensagens motivacionais! Digite o comando /frase para receber uma mensagem aleatória";
            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);

            try {
                execute(response);
            } catch(TelegramApiException BV) {
                BV.printStackTrace();
            }

        }
        else if (command.equals("/frase")) {
            String message = "pqp finalmente funcionou";
            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString()); //esses métodos foram herdados da classe TelegramLongPollinBot
            response.setText(message);

            // https://www.devmedia.com.br/blocos-try-catch/7339 explicação to try/catch
            // https://acervolima.com/metodo-printstacktrace-lancavel-em-java-com-exemplos/ explicação do método printStackTrace
            try {
                execute(response);
            } catch(TelegramApiException msg) {
                msg.printStackTrace();
            }
        }

        }




    @Override
    public String getBotUsername() {
        // TODO
        return "QuoteMotivaBot";
    }

    @Override
    public String getBotToken() {
        // TODO
        return "5786160892:AAF67HqeRGTJzkSUuEuuGpFuJCmvNu7e_tc";
    }
}
