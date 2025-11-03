package co.edu.umanizales.ciudad_api.model;

// bibliotecas para poder hacer enum
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ServicesP {
    WATER("water"),
    LIGHT("ligth"),
    GAS("gas");

    private final String label;

    ServicesP(String label) {
        this.label = label;
    }

    @JsonValue
    public String getLabel() {
        return label;
    }

    public static ServicesP from(String value) {
        if (value == null) return null;
        String v = value.trim();
        for (ServicesP t : values()) {
            if (t.name().equalsIgnoreCase(v) || t.label.equalsIgnoreCase(v)) {
                return t;
            }
        }
        throw new IllegalArgumentException("Unknown service type: " + value);
    }

    @JsonCreator
    public static ServicesP fromJson(String value) {
        return from(value);
    }
}


