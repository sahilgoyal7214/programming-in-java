// Card.java
public class Card {
  private char value;
  private String suit;

  // Constructor to initialize card with value and suit
  public Card(char value, String suit) {
      this.value = value;
      this.suit = suit;
  }

  // Getter method to retrieve the value of the card
  public int getValue() {
      return value;
  }

  // Getter method to retrieve the suit of the card
  public String getSuit() {
      return suit;
  }

  // Setter method to set the suit of the card
  public void setSuit(String suit) {
      this.suit = suit;
  }

  // Setter method to set the value of the card
  public void setValue(char value) {
      this.value = value;
  }

  // toString method to represent the card as a string
  @Override
  public String toString() {
      return value + " of " + suit;
  }
}