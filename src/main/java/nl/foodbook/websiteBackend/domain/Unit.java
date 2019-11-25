package nl.foodbook.websiteBackend.domain;



public enum Unit {
    G("g"),
    ML("ml"),
    L("L"),
    TS("teaspoon"),
    TBS("tablespoon"),
    CUP("cup"),
    OUNCE("ounce"),
    SLICES("slices"),
    CLOVES("cloves"),
    POUND("pound");

    private String value;

    public String getValue() {
        return value;
    }

    private Unit(String value) {
        this.value = value;
    }

}


