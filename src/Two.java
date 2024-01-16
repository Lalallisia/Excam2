public class Two extends One {
    public int j;

    public Two(int initialValueOne, int initialValueTwo) {
        super(initialValueOne);
        this.j = initialValueTwo;
    }

    public int calculateSum() {
        return super.j + this.j;
    }
}
