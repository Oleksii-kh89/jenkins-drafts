def setName() {
    def time = new Date().getTime();
    this.name = time - 300000;
}
def getName() {
    return this.name;
}
