

import java.text.SimpleDateFormat;
import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
    String greeting = "Hello, " + name + "! How are you?";

        return greeting;
    }
    public String guestGreeting(String name, String dayPeriod) {
        
        String greeting = "Hello, " + name + "! How are you this " + dayPeriod + "?";

        return greeting;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        return "It is currently " + dateFormat.format(date) + ".";
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.contains("Alexis")) {
            return  "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.contains("Alfred")){
            return "At your service, As you wish naturally.";
        } else {
        return "Right. And with that I shall retire.";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
}
