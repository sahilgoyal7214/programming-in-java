// Main.java
// Sahil Goyal
// AIML-B1
// 2022-26
// 22070126094

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input
        Deck deck = new Deck(); // Create a new deck of cards
        int choice; // Variable to store the user's choice
        do {
            // Display the menu options to the user
            System.out.println("\nMenu:");
            System.out.println("1. Display the entire deck");
            System.out.println("2. Find cards of the same suit");
            System.out.println("3. Compare cards with the same rank or number");
            System.out.println("4. Find a particular card");
            System.out.println("5. Deal 5 random cards");
            System.out.println("6. Shuffle the deck");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt(); // Read the user's choice
            scanner.nextLine(); // Consume newline character

            // Perform actions based on the user's choice
            switch (choice) {
                case 1:
                    System.out.println("Entire Deck:");
                    deck.printDeck(); // Display the entire deck
                    break;
                case 2:
                    System.out.print("Enter suit to find cards: ");
                    String suit = scanner.nextLine(); // Read the suit from the user
                    System.out.println(deck.sameCard(suit)); // Display cards with the same suit
                    break;
                case 3:
                    System.out.print("Enter value to compare cards: ");
                    char value = scanner.next().charAt(0); // Read the value to compare
                    System.out.println(deck.compareCard(value)); // Display cards with the same value
                    break;
                case 4:
                    System.out.print("Enter suit of the card: ");
                    String cardSuit = scanner.nextLine(); // Read the suit of the card
                    // Consume the newline character left in the input buffer
                    System.out.print("Enter value of the card: ");
                    char cardValue = scanner.next().charAt(0); // Read the value of the card
                    Card foundCard = deck.findCard(cardSuit, cardValue); // Find the card
                    if (foundCard != null) {
                        System.out.println("Card found: " + foundCard); // Display the found card
                    }
                    else {
                        System.out.println("Card not found."); // Display message if card not found
                    }
                    break;
                case 5:
                    System.out.println("Dealt cards: " + deck.dealCard()); // Deal 5 random cards
                    break;
                case 6:
                    deck.shuffleDeck(); // Shuffle the deck
                    System.out.println("Deck shuffled.");
                    break;
                case 7:
                    System.out.println("Exiting..."); // Exit the program
                    break;
                default:
                    System.out.println("Invalid choice!"); // Display message for invalid choice
            }
        } while (choice != 7); // Repeat until the user chooses to exit
        scanner.close(); // Close the scanner to prevent resource leak
    }
}