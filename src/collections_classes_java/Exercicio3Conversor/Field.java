package collections_classes_java.Exercicio3Conversor;

public class Field {

    private String name;
    private String value;
    private DataType type;

    public Field(String name, String value, DataType type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public DataType getType() {
        return type;
    }
}
