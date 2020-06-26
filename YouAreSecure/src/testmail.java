import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class testmail
{
	public static void main(String[] args) throws MessagingException {
		
		System.out.println("Sending...");
		
		Properties props = new Properties();
		props.put("mail.smtp.auth","true");
		props.put("mail.smtp.starttls.enable","true");
		props.put("mail.smtp.host","smtp.gmail.com");
		props.put("mail.smtp.port","587");
	
		String myemail = "theconscienceofficial@gmail.com";
		String pwd = "conscience@google";
		
		Session session = Session.getInstance(props, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(myemail,pwd);
			}
		});
		
		Message message = prepareMessage(session,myemail);
	
		Transport.send(message);

		System.out.println("Message sent successfully");
	
	}

	private static Message prepareMessage(Session session,String myemail) {
		Message message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(myemail));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress("taranggarlapally@gmail.com"));
			message.setSubject("Test email");
			message.setText("Hey There\nThis is a test message");
			return message;
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}