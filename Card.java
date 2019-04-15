class Card {

   public enum Suit {
      HEART("Heart"),
      DIAMOND("Diamond"),
      SPADE("Spade"),
      CLUB("Club");

      private String suitName = "";

      Suit(String suitName) {
         this.suitName = suitName;
      }

      public String toString() {
         return suitName;
      }
   }
   public static final String[] RANK_NAMES = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
   private Suit suit;
   private int rank;
   private int value;

   public Card(Suit suit, int rank) {
      this.suit = suit;
      this.rank = rank;
      if(this.rank<10) {
         this.value = rank+1;
      } else {
         this.value = 11;
      }
   }

   public Suit getSuit() {
      return this.suit;
   }

   public int getRank() {
      return this.rank;
   }

   public String getSuitName() {
      return this.suit.toString();
   }

   public String getRankName() {
      return RANK_NAMES[rank];
   }

   public String toString() {
      return ""+this.getRankName()+" of "+this.getSuitName();
   }

   public int getValue() {
      return this.value;
   }
}
