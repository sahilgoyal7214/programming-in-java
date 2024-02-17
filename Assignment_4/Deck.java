//Deck.java
import java.util.*;

public class Deck {
    private ArrayList<Card> cards;

    // Constructor to initialize the deck with 52 cards and shuffle them
    public Deck() {
        this.cards = new ArrayList<Card>();
    
        // Define possible values and suits for cards
        String[] values = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
    
        // Create cards for each combination of value and suit
        for (String suit : suits) {
            for (String value : values) {
                char charValue;
                if (value.equals("A") || value.equals("J") || value.equals("Q") || value.equals("K")) {
                    charValue = value.charAt(0);
                } else {
                    charValue = value.charAt(0);
                }
                this.cards.add(new Card(charValue, suit));
            }
        }
    
        // Shuffle the deck
        Collections.shuffle(this.cards);
    }    

    // Method to retrieve the entire deck and print all cards in a line
    public void printDeck() {
        StringBuilder deckString = new StringBuilder();
        for (Card card : cards) {
            deckString.append(card.toString()).append(", ");
            }
        System.out.println(deckString.toString());
    }

    // Method to get the top card of the deck
    public Card getCard() {
        return cards.get(0);
    }

    // Method to find cards of the same suit as provided
    public ArrayList<Card> sameCard(String suit) {
        ArrayList<Card> sameSuitCards = new ArrayList<>();
        for (Card card : cards) {
            if (card.getSuit().equalsIgnoreCase(suit)) {
                sameSuitCards.add(card);
            }
        }
        return sameSuitCards;
    }

    // Method to compare cards having the same rank or number as provided
    public ArrayList<Card> compareCard(char value) {
        ArrayList<Card> sameRankCards = new ArrayList<>();
        for (Card card : cards) {
            if (card.getValue() == value) {
                sameRankCards.add(card);
            }
        }
        return sameRankCards;
    }

    // Method to search for a particular card with given suit and value
    public Card findCard(String suit, char value) {
        for (Card card : cards) {
            if (card.getSuit().equalsIgnoreCase(suit) && card.getValue() == value) {
                return card;
            }
        }
        return null;
    }

    // Method to deal 5 random cards from the deck
    public ArrayList<Card> dealCard() {
        ArrayList<Card> dealtCards = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int index = rand.nextInt(cards.size());
            dealtCards.add(cards.remove(index));
        }
        return dealtCards;
    }

    // Method to shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }
}
