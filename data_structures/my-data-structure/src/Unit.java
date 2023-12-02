public class Unit {
    private String value;
    private Unit next;

    public Unit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Unit getNext() {
        return next;
    }

    public void setNext(Unit next) {
        this.next = next;
    }
}