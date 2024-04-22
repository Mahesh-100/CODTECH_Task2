import java.util.Scanner;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chatbot: Hi! How can I assist you today?");
        String userInput;

        do {
            System.out.print("User: ");
            userInput = scanner.nextLine();

            String botResponse = generateResponse(userInput);

            System.out.println("Chatbot: " + botResponse);
        } while (!userInput.equalsIgnoreCase("exit"));

        System.out.println("Chatbot: Goodbye! Have a great day!");
        scanner.close();
    }

    public static String generateResponse(String userInput) {
        String response;

        switch (userInput.toLowerCase()) {
            case "hi":
            case "hello":
                response = "Hello there!";
                break;
            case "how are you":
                response = "I'm just a chatbot, but thanks for asking!";
                break;
            case "what is your name":
                response = "I'm just a simple chatbot. You can call me Chatbot.";
                break;
            case "tell me a joke":
                response = "Why did the math book look sad? Because it had too many problems! 😄";
                break;
            case "wanna be friends":
                response = "We are already friends.";
                break;
            case "open notepad":
                try {
                    Runtime rs = Runtime.getRuntime();
                    rs.exec("notepad");
                } catch (IOException e) {
                    response = "Error: " + e.getMessage();
                }
                response = "Notepad opened.";
                break;
            case "time":
                response = getCurrentTime();
                break;
            case "date":
                response = getCurrentDate();
                break;
            case "fact":
                response = getRandomFact();
                break;
            case "recommend":
                response = "I recommend you try out the new restaurant downtown!";
                break;
            
            case "exit":
                response = "Sure, exiting now.";
                break;
            default:
                response = "I'm not sure how to respond to that.";
                break;
        }

        return response;
    }

    public static String getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return "Current Time: " + now.format(formatter);
    }

    public static String getCurrentDate() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Current Date: " + now.format(formatter);
    }

    public static String getRandomFact() {
        String[] facts = {
            "The average human body carries ten times more bacterial cells than human cells.",
            "Honey never spoils. Archaeologists have found pots of honey in ancient Egyptian tombs that are over 3,000 years old and still perfectly edible.",
            "The shortest war in history was between Britain and Zanzibar on August 27, 1896. Zanzibar surrendered after 38 minutes.",
            "Bananas are berries, but strawberries aren't.",
            "Octopuses have three hearts."
        };
        Random random = new Random();
        int index = random.nextInt(facts.length);
        return "Did you know? " + facts[index];
    }
    
}
