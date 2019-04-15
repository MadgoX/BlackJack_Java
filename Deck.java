import java.util.*;

class Deck {
   private static ArrayList<Card> deck;
   private static Deck singleton = null;
   private Card.Suit suit = Card.Suit.HEART;

   private Deck(){}

   public static Deck getInstance() {
      if (singleton == null){
         singleton = new Deck();
         deck = new ArrayList<Card>();
      }
      return singleton;
   }

   public void initialize_Deck() {
      for(int i = 0; i<13; i++) {
         deck.add(new Card(suit, i));
      }
      suit = Card.Suit.DIAMOND;
      for(int i = 0; i<13; i++) {
         deck.add(new Card(suit, i));
      }
      suit = Card.Suit.SPADE;
      for(int i = 0; i<13; i++) {
         deck.add(new Card(suit, i));
      }
      suit = Card.Suit.CLUB;
      for(int i = 0; i<13; i++) {
         deck.add(new Card(suit, i));
      }
   }

   public void print_Deck() {
      for(int i = 0; i<52; i++) {
         System.out.println(deck.get(i));
      }
   }

   public void shuffle() {
      Collections.shuffle(deck);
   }

   public Card top() {
      return deck.remove(0);
   }
}
