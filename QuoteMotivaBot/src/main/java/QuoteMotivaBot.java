import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class QuoteMotivaBot extends TelegramLongPollingBot {
    @Override
    /*nesse método que vamos incluir os comandos do bot*/
    public void onUpdateReceived(Update update) {
       String command = update.getMessage().getText();
       if (command.equals("/frase")) {
           /* e aqui dentro vai o loop */
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
