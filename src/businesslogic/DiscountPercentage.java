package businesslogic;

public enum DiscountPercentage {

    PERCENTAGE15("15"),
    PERCENTAGE7("7"),
    PERCENTAGE3("3"),
    PERCENTAGE23("23"),
    PERCENTAGE27("27"),
    PERCENTAGE5("5"),
    PERCENTAGE9("9");

    private String percentage;

    DiscountPercentage(String percentage) {
        this.percentage= percentage;
    }

    public String getPercentage() {
        return percentage;
    }

}
