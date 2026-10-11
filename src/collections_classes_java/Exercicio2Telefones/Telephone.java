package collections_classes_java.Exercicio2Telefones;

public enum Telephone {

    LANDLINE_8(8, "Telefone Fixo (sem DDD", "(\\d{4})(\\d{4})", "$1-$2"),

    LANDLINE_10(10, "Telefone Fixo (com DDD)", "(\\d{2})(\\d{4})(\\d{4})", "($1)$2-$3"),

    CELL_PHONE_9(9, "Telefone Celular (sem DDD)", "(\\d{5})(\\d{4})", "$1-$2"),

    CELL_PHONE_11(11, "Telefone Celular (com DDD)", "(\\d{2})(\\d{5})(\\d{4})", "($1)$2-$3");

    private final int length;

    private final String description;

    private final String regex;

    private final String replacement;

    Telephone(int length, String description, String regex, String replacement) {
        this.length = length;
        this.description = description;
        this.regex = regex;
        this.replacement = replacement;
    }

    public int getLength() {
        return length;
    }

    public String getDescription() {
        return description;
    }

    public String format(String cleanedInput) {
        return cleanedInput.replaceAll(regex, replacement);
    }

    public static Telephone getTelephone(int length) {
        for (Telephone telephone : Telephone.values()) {
            if (telephone.getLength() == length) {
                return telephone;
            }
        }
        return null;
    }
}