# Assignment 4: Card Deck Management System

Welcome to Assignment 4 of the Java Programming Assignments repository! This folder contains a Java program implementing a menu-driven Card Deck Management System.

## Table of Contents

- [Problem Statement](#problem-statement)
- [Program](#program)
- [Usage](#usage)

## Problem Statement

Write a menu-driven Java Program to manage a deck of cards. The program should fulfill the following requirements:

1. Represent a deck of cards as an array of objects (you may use the Vector class).
2. Use integers to encode the ranks and suits of the cards.
3. Implement suitable default and parameterized constructors for the Card class.
4. Ensure that all data members of the Card class have private access.
5. Implement the following methods in the Card class:
   - `createDeck()`: Create a deck of 52 cards.
   - `printCard()`: Print the details of a single card.
   - `printDeck()`: Print the entire deck of cards.
   - `sameCard()`: Check if two cards are the same.
   - `compareCard()`: Compare two cards.
   - `sortCard()`: Sort the deck of cards.
   - `findCard()`: Search for a specific card in the deck.
   - `dealCards()`: Deal 5 random cards from the existing deck.

## Program

1. **Main.java:**
   - Contains the main program implementing the menu-driven Card Deck Management System.
   - Allows users to perform various operations on the deck of cards, such as creating a deck, printing cards, comparing cards, sorting cards, finding cards, and dealing cards.

2. **Card.java:**
   - Defines the `Card` class representing a playing card.
   - Includes constructors, private data members for rank and suit, and methods for various card operations.

3. **Deck.java:**
   - Defines the `Deck` class representing a deck of cards.
   - Contains methods for creating a deck, printing cards, comparing cards, sorting cards, finding cards, and dealing cards.

4. **UserInput.java:**
   - Utility class for user input handling.

## Usage

To run the program:

1. **Compile the Java files:**
   ```
   javac Main.java
   javac Card.java
   javac Deck.java
   javac UserInput.java
   ```

2. **Run the program:**
   ```
   java Main
   ```

Follow the on-screen menu prompts to perform various operations on the deck of cards.

Feel free to explore and modify the program to suit your needs or to further practice Java programming concepts.

## Author

- [Sahil Goyal](https://github.com/sahilgoyal7214)

