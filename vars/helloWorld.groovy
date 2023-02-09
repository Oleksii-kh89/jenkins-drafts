def setName() {
    def value = new Date().getTime()
    this.name = value - 300000;
}
def getName() {
    return this.name;
}
