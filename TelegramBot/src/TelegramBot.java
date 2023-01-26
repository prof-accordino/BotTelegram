import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class TelegramBot extends TelegramLongPollingBot 
{

  @Override
  public String getBotUsername() {
      return "INSERIRE NOME BOT";
  }

  @Override
  public String getBotToken() {
      return "INSERIRE TOKEN BOT";
  }

  @Override
  public void onUpdateReceived(Update update) 
  {
	  // Questo bot scrive sulla console quello che si manda dalla chat del bot su telegram
	  var msg = update.getMessage();
	  var user = msg.getFrom();
	  System.out.println(user.getFirstName() + " ha scritto: " + msg.getText());
  }
  
}