import java.util.*;

//La classe Deck, qui consiste en un et un seul tableau de cartes.
class Deck {
   //Le tableau de cartes, donc notre deck
   private static ArrayList<Card> deck;
   //Le singleton est un peu compliqué. En gros c'est un design pattern qui permet
   //D'éviter qu'une classe ne crée plus d'un seul objet. Pour ça, on crée une
   //variable statique singleton initialisée à null et qui prend une valeur si
   //il n'existe pas d'autre objet de type Deck. Pour construire qu'un seul Deck,
   //On laisse le constructeur vide et on appelle la méthode getInstnce() à chaque
   //fois qu'on veut créer un deck, de sorte à vérifier avant si un deck n'a pas
   //déjà été créé.
   private static Deck singleton = null;
   //Pour suit ça sert simplement à l'initialisation du deck
   private Card.Suit suit = Card.Suit.HEART;

   //La classe est instanciable donc elle a un constructeur mais il est vide car
   //elle ne doit créer qu'un seul objet (cherche design pattern singleton si tu veux)
   private Deck(){}

   //Le nouveau constructeur de la classe. Il vérifie qu'on n'a pas créé d'autre
   //objet Deck avant d'initialiser la variable.
   public static Deck getInstance() {
      if (singleton == null){
         singleton = new Deck();
         deck = new ArrayList<Card>();
      }
      return singleton;
   }

   //La classe initialize_deck permet de le créer avec les cartes dans l'ordre.
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

   //La classe print_Deck permet de l'afficher quand on le demande.
   public void print_Deck() {
      for(int i = 0; i<52; i++) {
         System.out.println(deck.get(i));
      }
   }

   //La classe shuffle permet de le mélanger et c'est super pratique que la
   //méthode shuffle existe déjà dans ArrayList
   public void shuffle() {
      Collections.shuffle(deck);
   }

   //La méthode top permet de récupérer la première carte du paquet
   public Card top() {
      return deck.remove(0);
   }
}
