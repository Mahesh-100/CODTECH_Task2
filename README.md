# Title: CodTech IT Solutions Internship - Task Documentation: ChatBot in Java

This documrntation provides a detailed explanation of the task assigned during the CodTech IT solutions Internship program. the task involves writing a java program to create a Sample ChatBot .task documentations will cover the implementation details, retionals behaind the code structure, and insights into the programming techiques utilized. additionally , it will include about the interm, D. Mahesh Kumar, and his assigned ID, ICOD6731

Interm Information. Name : D. Mahesh Kumar Intern ID:ICOD6731

Task Description : the task assigned to D. Mahesh Kumar during the codtech IT solutions Internship program is to write a java program the create a SampleChatbot.
**1. Introduction**

ChatBot is a simple Java-based chatbot program that simulates a conversation with users. 

It provides various features such as responding to greetings, sharing jokes, opening Notepad, providing current time and date, sharing random facts, offering recommendations, performing basic calculations, and allowing users to exit the conversation.

**2. Features**

Greeting Response: The chatbot responds to greetings like "hi" and "hello" with a friendly message.

Joke Sharing: It shares a joke when prompted by the user.

Notepad Opening: The chatbot can open Notepad on the user's system upon request.

Time and Date Display: It provides the current time and date when the user asks.

Random Facts: The chatbot shares random interesting facts upon request.

Recommendations: It offers recommendations for users, such as trying out a new restaurant.

Exiting Conversation: Users can exit the conversation by typing "exit".

**3. Installation**

To run the SampleChatbot program:

Ensure you have Java Development Kit (JDK) installed on your system.

Download the SampleChatbot.java file.

Open a command prompt or terminal.

Navigate to the directory containing the ChatBot.java file.

Compile the program using the command: javac ChatBot.java

Run the program using the command: java ChatBot

Follow the on-screen instructions to interact with the chatbot.

**4.Implementation**

the implementation of the task involves utilizing java programming language to create a simple program that iterates from ChatBot . the program "do" loop to achiew this functionaaly efficiently. below is the 

**5. code implementation:**

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

**6.Usage**
Once the program is running, the chatbot will greet the user and prompt for input. Type your message and press Enter to communicate with the chatbot. You can explore various features by typing specific commands or questions such as "tell me a joke" or "what is the time?".

Example interaction:

`Chatbot: Hi! How can I assist you today?
User: tell me a joke
Chatbot: Why did the math book look sad? Because it had too many problems! 😄`

**Future Enhancements** Potential future enhancements for the Java Chatbot include integrating advanced natural language processing techniques, expanding the response database, and adding features such as voice recognition.

**7. Conclusion:** 

In conclusion, the Java Chatbot project provides a simple yet effective way to engage in conversation using natural language input. With further development and enhancements, it has the potential to become a more sophisticated and intelligent conversational agent.
