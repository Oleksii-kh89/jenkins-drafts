def setTime() {
    def time = new Date().getTime()
    this.testS = time - 300000
}
def getTime() {
    return this.testS;
}
