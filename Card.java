class Card {
   /*
   * L'enum "Suit". C'est une énumération qui permet de déterminer la couleur
   * d'une carte. Pour utiliser le type "Suit" dans un autre fichier il faut faire
   * "Card.Suit.HEART" par exemple si on veut utiliser le coeur.
   */
   public enum Suit {
      HEART("Heart"),
      DIAMOND("Diamond"),
      SPADE("Spade"),
      CLUB("Club");

      // suitName qui permet de l'afficher en redéfinissant toString, de sorte à
      // ce que quand on fait un system.out.println ça affiche la couleur et non une variable chelou.
      private String suitName = "";

      Suit(String suitName) {
         this.suitName = suitName;
      }

      public String toString() {
         return suitName;
      }
   }
   //Un tableau de chaines de caractères pour les noms des valeurs
   public static final String[] RANK_NAMES = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
   //Trois variables pour couleur, rang et valeur, ici c'est la valeur au blackjack qui nous intéresse
   private Suit suit;
   private int rank;
   private int value;

   //Le constructeur de la classe dans lequel on initialise nos variables à leur valeur en paramètre
   //On définit également leur valeur par rapport à leur rang
   public Card(Suit suit, int rank) {
      this.suit = suit;
      this.rank = rank;
      if(this.rank<10) {
         this.value = rank+1;
      } else {
         this.value = 11;
      }
   }

   //Le getter de couleur, permet de retourner une couleur de type Suit
   public Suit getSuit() {
      return this.suit;
   }

   //Le getter de rang, retourne un int
   public int getRank() {
      return this.rank;
   }

   //Le getter de nom de couleur si on veut afficher ailleurs
   public String getSuitName() {
      return this.suit.toString();
   }

   //Le getter de nom de rang pour afficher ailleurs
   public String getRankName() {
      return RANK_NAMES[rank];
   }

   //La redéfinition de la méthode toString qui permet d'afficher une carte
   //avec System.out.println ailleurs
   public String toString() {
      return ""+this.getRankName()+" of "+this.getSuitName();
   }

   //Le getter pour la valeur de la carte
   public int getValue() {
      return this.value;
   }
}
