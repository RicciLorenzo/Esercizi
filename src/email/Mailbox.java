package email;


import java.util.Set;
import java.util.TreeSet;

public class Mailbox { 

	private Server server;
	private String user;
	private Set<Email> received = new TreeSet<>();
	
	public Mailbox(Server server, String user) {
		this.server=server;
		this.user=user;
	} 
	
	private class SimpleEmail implements Email {

		private Mailbox sender;
		private Set<Mailbox> recipients;
		private String subject;
		private String body;
		
		private SimpleEmail(Mailbox sender, Set<Mailbox> recipients, String subject, String body){
			this.sender=sender;
			this.subject=subject;
			this.body=body;
			
			for(Mailbox recipienti : recipients) {
				this.recipients.add(recipienti);
			}
		}
		
		@Override
		public Mailbox getSender() {
			
			return this.sender;
		}

		@Override
		public Set<Mailbox> getRecipients() {
			
			return this.recipients;
		}

		@Override
		public String getSubject() {
			
			return this.subject;
		}

		@Override
		public String getBody() {
			
			return this.body;
		}
		
		@Override
		public String toString() {
			String result="Mail from: "+this.sender.user;
			result+="\nto: ";
			for(Mailbox recipiente : recipients) {
				if(recipients.iterator().hasNext())
					result+=recipiente.user+",";
				else
					result+=recipiente.user;

			}
			result+="\nSubject: "+this.getSubject()+"\n";
			result+="\nBODY:\n\n";
			
			for(String row : body.split("\n")) {
			
				result+=row+"\n";
				
			}
			
			return result;
			
		}
		
	}
	
	public Set<Email> getEmails() { 
		//restituisce le email ricevute da questa mailbox... 
		return server.getEmailsTo(this);
	}
	
	public Email post(String subject, String body, Mailbox... recipients) { 
		//invia e ritorna un�email da questa mailbox ai recipients indicati, con soggetto e corpo indicati...
		TreeSet<Mailbox> temp = new TreeSet<>();
		for(Mailbox recipiente : recipients) {
			temp.add(recipiente);
		}

		server.post(new SimpleEmail(this,temp,subject,body));
		
		return new SimpleEmail(this,temp,subject,body);
		
	}
	
	
	public Email replyToAll(Email email, String body) throws UnknownEmailException { 
		//invia e ritorna una risposta a tutti i destinatari dell�email fornita come parametro, meno questa mailbox ma incluso il mittente. 
		//Il soggetto della risposta sara� quello dell�email fornita come paramero, preceduto da RE: 
		//Se l�email fornita come parametro non e� stata ricevuta da questa mailbox, lancia una UnknownEmailException 
		
		
		if(!email.getRecipients().contains(this)) {
			throw new UnknownEmailException();
		}
		
		Set<Mailbox> utenti = new TreeSet<>();
		String result="RE: "+email.getSubject();
		
		for(Mailbox user : email.getRecipients()) {
			if(user==this) {}
			else {
				utenti.add(user);
			}
				
		}
		
		utenti.add(email.getSender());
		
		String newBody=body+"\n\n"+email.getBody();
		
		server.post(new SimpleEmail(this,utenti,result,newBody));
		
		return new SimpleEmail(this,utenti,result,body);
		
	} 
	
	public Email forward(Email email, String body, Mailbox recipient) throws UnknownEmailException { 
		//invia e ritorna un forward dell�email fornita come parametro al recipient indicato. 
		//Il soggetto del forward sara� quello dell�email fornita come paramero, preceduto da FWD: 
		//Se l�email fornita come parametro non e� stata ricevuta da questa mailbox, lancia una UnknownEmailException 
			
			Set<Mailbox> utenti = new TreeSet<>();
		
			if(!received.contains(email)) {
				throw new UnknownEmailException();
			}
			
			for(Mailbox removeUser : email.getRecipients()) {
				email.getRecipients().remove(removeUser);
			}
			
			utenti.add(recipient);
			
			String newSubject="FWD: "+email.getSubject();
			String newBody=body+"\n"+email.getBody();
			
			server.post(new SimpleEmail(this,utenti,newSubject,newBody));
			
			return null;
		
		} 
	
	@Override 
	public String toString() { 
		//restituisce una stringa con le email ricevute da questa mailbox, separate da trattini. 
		//Nel mezzo, ciascuna email verra� stampata chiamando toString() sull�email 
		StringBuilder sb = new StringBuilder();
		sb.append("Mailbox of ").append(user).append(":\n");
		for (Email email: getEmails())
			sb.append("---------------------------------------\n").append(email.toString());

		return sb.toString();

	} 
}
