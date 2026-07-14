public class TextMessage implements Readable {
	public String sender;
	public String content;


	// constructor
	public TextMessage(String senderName, String content) {
		this.sender = senderName;
		this.content = content;
	}

	public String getSender() {
		return this.sender;
	}

	public String read() {
		return this.content;
	}
}
