package carRent.domain;

public enum CarBodyTyoeEnum {

    SEDAN("SEDAN"),
    HATCHBACK("HATCHBACK"),
    PICKUP("PICKUP"),
    COMBI("COMBI");

    private final String value;

    CarBodyTyoeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
