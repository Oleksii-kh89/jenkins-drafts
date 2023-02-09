def call() {
  def chars = "abcdefghyjklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  def run_id = "Test_"
      for (int i = 0; i < 15; i++){
         q = chars.charAt(new Random().nextInt(chars.length()))
         this.run_id = run_id+q
       }
}
