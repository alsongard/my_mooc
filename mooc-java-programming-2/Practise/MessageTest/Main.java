import java.util.ArrayList;

class Main {
	public static void main() {

		Message sms = new Message("SMS");
		Message mms = new Message("MMS");

		System.out.println(sms.equals(sms));
		System.out.println(sms.equals(mms));

		ArrayList<Message> messages = new ArrayList<>();

		if (!messages.contains(sms)) {
		    	System.out.println("checking messages array does not contain object sms, result is false");
		    messages.add(sms);
		}

		if (!messages.contains(sms)) {
			System.out.println("checking if messages array does not contain object sms, result is false");
		    messages.add(sms);
		}

		if (!messages.contains(new Message("SMS"))) {
			System.out.println("checking if messages array does not contain object sms, result is false");
		    messages.add(sms);
		}

		System.out.println(messages.size());
	
	
	} 

}
