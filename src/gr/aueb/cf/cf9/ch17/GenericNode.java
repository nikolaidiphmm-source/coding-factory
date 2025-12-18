package gr.aueb.cf.cf9.ch17;

public class GenericNode<Τ> {
    private Τ value;

    public GenericNode() {

    }

    public GenericNode(Τ value) {
        this.value = value;
    }

    public Τ getValue() {
        return value;
    }

    public void setValue(Τ value) {
        this.value = value;
    }
}
