package businesslogic;

public enum DiscountPercentage {

    PERCENTAGE15(15),
    PERCENTAGE7(7),
    PERCENTAGE3(3),
    PERCENTAGE23(23),
    PERCENTAGE27(27),
    PERCENTAGE5(5),
    PERCENTAGE9(9);

    private int percentage;

    DiscountPercentage(int percentage) {
        this.percentage= percentage;
    }

    public int getPercentage() {
        return percentage;
    }

}
