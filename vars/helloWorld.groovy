def call() {
    //sh "echo Hello World"
  def chars = "abcdefghyjklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                    def run_id = "Test_"
                        for (int i = 0; i < 15; i++){
                            q = chars.charAt(new Random().nextInt(chars.length()))
                            run_id = run_id+q
                        }
                    buildDescription "${run_id}"
}
