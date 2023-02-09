def call() {
    def time = new Date().getTime()
    testS = time - 300000
    echo "Test Time NEW :: $testS"
}
