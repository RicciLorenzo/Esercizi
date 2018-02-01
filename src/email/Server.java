package email;

import java.util.Set;
import java.util.TreeSet;

public class Server { 
	
	TreeSet<Email> sent = new TreeSet<>();
	
	public void post(Email email) { 
		//aggiunge l’email a quelle spedite con questo server...
		
		sent.add(email);
		
	} 
	
	public Set<Email> getEmailsTo(Mailbox recipient) {
		//restituisce le email ricevute da recipient... 
		
		TreeSet<Email> sentTo = new TreeSet<>();
		
		for(Email mail : sent) {
			if(mail.getRecipients().contains(recipient)) {
				sentTo.add(mail);
			}
		}
		
		return sentTo;
		
	} 
}
