public class TestUnit {
    public static void main(String[] args) {
        Unit u1 = new Unit("d");
        Unit u2 = new Unit("f");
        Unit u3 = new Unit("a");

        u1.setNext(u2);
        u2.setNext(u3);
    }
}