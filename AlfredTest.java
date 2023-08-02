public class AlfredTest {

    public static void main(String[] args) {
        AlfredQuotes alfredBot = new AlfredQuotes();

        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");
        String testDateAnnouncement = alfredBot.dateAnnouncement();

        String alexisTest = alfredBot.respondBeforeAlexis("Alexis! Play some low-fi beats.");
        String alfredTest = alfredBot.respondBeforeAlexis("I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = alfredBot.respondBeforeAlexis("Maybe that's what Batman is about. Not winning. But failing..");

        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);

        // Ninja Bonus 1 test
        String ninjaGuestGreeting = alfredBot.guestGreeting("Barbara Gordon", "evening");
        System.out.println(ninjaGuestGreeting);

        // // Sensei Bonus test
        // String senseiGuestGreeting = alfredBot.guestGreeting("Bruce Wayne", new Date());
        // System.out.println(senseiGuestGreeting);

        // // Your own AlfredQuote method test
        // String yellingMessage = alfredBot.alfredYelling("Don't touch the Batmobile");
        // System.out.println(yellingMessage);
    }
}
