def setName() {
    def time = new Date().getTime()
    this.testS = time - 300000
}
def getName() {
    return this.testS;
}
