class Player {
   boolean turn;

   public Player(boolean com) {
      this.turn = com;
   }

   public boolean get_Turn() {
      return this.turn;
   }

   public void set_Turn(boolean turn) {
      this.turn = turn;
   }

   public void change_Turn() {
      this.turn = !turn;
   }
}
