class Game {

   private Deck deck;
   private Player player;
   private Player ia;

   public Game() {
      this.deck = Deck.getInstance();
      this.player = new Player(false);
      this.ia = new Player(true);
   }

   public Deck getDeck() {
      return this.deck;
   }

   public Player getIA() {
      return this.ia;
   }

   public Player getPlayer() {
      return this.player;
   }
}
