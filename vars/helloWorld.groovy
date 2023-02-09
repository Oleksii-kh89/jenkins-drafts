def call() {
    def time = new Date().getTime()
    this.timeStart = time - 300000
    return this.timeStart
}
