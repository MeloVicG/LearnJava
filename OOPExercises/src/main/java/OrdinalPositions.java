public enum OrdinalPositions {
    A(1),
    B(2),
    C(3),
    D(4),
    E(5),
    F(6),
    G(7),
    H(8),
    I(9),
    J(10),
    K(11);

    private int ordinal;

    OrdinalPositions(int ordinal){
        this.ordinal = ordinal;
    }

    public int getOrdinal() {

        return ordinal;
    }
}
