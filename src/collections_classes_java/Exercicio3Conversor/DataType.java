package collections_classes_java.Exercicio3Conversor;

public enum DataType {

    TEXT("Texto"),
    INTEGER("Número Inteiro"),
    FLOAT("Número Decimal"),
    BOOLEAN("Booleano"),
    DATE("Data");

    private final String description;

    DataType(String description) {
        this.description = description;
    }

    public static DataType fromString(String text) {
        for (DataType type : DataType.values()) {
            if (type.name().equalsIgnoreCase(text) || type.description.equalsIgnoreCase(text)) {
                return type;
            }
        }
        return TEXT;
    }
}
