/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Parneet Kaur
 * Student number:991724032
 * 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand=new Random();
        String[] suits={"hearts","diamonds","clubs","spades"};
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(rand.nextInt(13)+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
        }
        Scanner in=new Scanner(System.in);
        System.out.println("pick a number from 1-13");
        int value=in.nextInt();
        in.nextLine();
        
        System.out.println("pick a suit {Hearts, Diamonds, Clubs, Spades}=");
        String usersuit=in.nextLine();
        
        Card userCard=new Card();
        userCard.setValue(value);
        userCard.setSuit(usersuit);
        
        //insert code to ask the user for Card value and suit, create their card
        
        // and search magicHand here
        boolean found=false;
        for(Card card : magicHand){
            if(card!= null){
                if(card.getValue()==userCard.getValue()&& card.getSuit().equalsIgnoreCase((userCard.getSuit()))){
                    found=true;
                    break;
                }
            }
        }
        //Then report the result here
        if(found){
            System.out.println("your card is in magic hand");
        }
        else{
            System.out.println("your card is not in magic hand");
        }
        // add one luckcard hard code 2,clubs
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

        // Check if the lucky card is in the magic hand
        found = false;
        for (Card card : magicHand) {
            if (card != null && card.getValue() == luckyCard.getValue() && card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        // Report the result for the lucky card
        if (found) {
            System.out.println("The lucky card (2 of Clubs) is in the magic hand. You win!");
        } else {
            System.out.println("The lucky card (2 of Clubs) is not in the magic hand. You lose.");
        }
    }
    
}
