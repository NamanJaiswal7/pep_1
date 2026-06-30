package functions_arrays;

import java.util.regex.*;

public class RegexSuite {
    public static void main(String[] args) {
        
        // 1. IPv4 Address: Matches 4 sets of 1-3 digits separated by dots
        String ipRegex = "^(\\d{1,3}\\.){3}\\d{1,3}$";
        
        // 2. Social Media Handle: Matches '@' followed by alphanumeric/underscores
        String handleRegex = "@(\\w+)";
        
        // 3. Visa Card: Starts with 4, followed by 12 or 15 digits
        String visaRegex = "^4[0-9]{12}(?:[0-9]{3})?$";

        // --- TESTING IP ADDRESSES ---
        System.out.println("--- IPv4 Validation ---");
        String[] ips = {"192.168.1.1", "10.0.0.254", "999.999.9.9"}; // Note: 999 is format-valid but logically invalid
        checkMatches(ipRegex, ips);

        // --- TESTING HANDLES (Extraction) ---
        System.out.println("\n--- Handle Extraction ---");
        String tweet = "Follow @java_dev and @OpenAI for updates!";
        extractMatches(handleRegex, tweet);

        // --- TESTING VISA CARDS ---
        System.out.println("\n--- Visa Card Validation ---");
        String[] cards = {"4123456789012345", "5123456789012345", "4123-4567"};
        checkMatches(visaRegex, cards);
    }

    // Helper method for full string validation
    private static void checkMatches(String regex, String[] inputs) {
        Pattern p = Pattern.compile(regex);
        for (String input : inputs) {
            System.out.println("'" + input + "' matches? " + p.matcher(input).matches());
        }
    }

    // Helper method for finding patterns within text
    private static void extractMatches(String regex, String text) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println("Found: " + m.group());
        }
    }
}