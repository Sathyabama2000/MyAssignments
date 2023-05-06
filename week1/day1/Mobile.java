package week1.day1;

public class Mobile {
        public void sendMessage() {
        	System.out.println("we can send messages");
        }
        public void shareDocument() {
        	System.out.println("we can share the document");
        }
        public void call() {
        	System.out.println("we can make the audio and video call");
        }
        
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Mobile mobile = new Mobile();
     mobile.sendMessage();
     mobile.shareDocument();
     mobile.call();
	}
}
