package email;


public class Mailbox { 
	//... 
	
	public Mailbox(Server server, String user) {
		//... 
	} 
	
	public Set<Email> getEmails() { 
		//restituisce le email ricevute da questa mailbox... 
	} 
	
	public Email post(String subject, String body, Mailbox... recipients) { 
		//invia e ritorna un’email da questa mailbox ai recipients indicati, con soggetto e corpo indicati... 
	}
	
	public Email replyToAll(Email email, String body) throws UnknownEmailException { 
		//invia e ritorna una risposta a tutti i destinatari dell’email fornita come parametro, meno questa mailbox ma incluso il mittente. 
		//Il soggetto della risposta sara’ quello dell’email fornita come paramero, preceduto da RE: 
		//Se l’email fornita come parametro non e’ stata ricevuta da questa mailbox, lancia una UnknownEmailException 
	} 
	
	public Email forward(Email email, String body, Mailbox recipient) throws UnknownEmailException { 
		//invia e ritorna un forward dell’email fornita come parametro al recipient indicato. 
		//Il soggetto del forward sara’ quello dell’email fornita come paramero, preceduto da FWD: 
		//Se l’email fornita come parametro non e’ stata ricevuta da questa mailbox, lancia una UnknownEmailException 
		} 
	
	@Override 
	public String toString() { 
		//restituisce una stringa con le email ricevute da questa mailbox, separate da trattini. 
		//Nel mezzo, ciascuna email verra’ stampata chiamando toString() sull’email 
	} 
}
