package email;

public interface Email {

	Mailbox getSender(); 
	Set<Mailbox> getRecipients(); 
	String getSubject(); 
	String getBody(); 
	String toString();

}
