package kodlama.ioWebHomePage.core.logging;

public class MailLogger implements Logger{

	@Override
	public void Log(String data) {
		// TODO Auto-generated method stub
		System.out.println("Mail loglandı : " + data);
	}
}
