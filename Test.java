class Test {
   public static void main(String args[]) {
      Game g = new Game();
      g.getDeck().initialize_Deck();
      g.getDeck().shuffle();
      g.getDeck().print_Deck();
   }
}
