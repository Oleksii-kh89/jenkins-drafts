def call() {
    def value = new Date().getTime()
    this.name = value - 300000;
    return this.name;
}
