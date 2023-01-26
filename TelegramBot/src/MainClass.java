import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class MainClass 
{
	public static void main(String[] args) throws TelegramApiException 
	{
		// Istanziamo la classe TelegramBotApi
		TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
		// Il metodo registerBot permette di utilizzare il bot in rete se si è collegati a internet
		botsApi.registerBot(new TelegramBot());
	}
}
