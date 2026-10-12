package collections_classes_java.Exercicio3Conversor;

import java.util.List;

public class DataConverter {

    public static String toJson(List<Field> fields) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");

        for (int i = 0; i < fields.size(); i++) {
            Field field = fields.get(i);
            sb.append(" \"").append(field.getName()).append("\": ");

            if (field.getType() == DataType.INTEGER || field.getType() == DataType.FLOAT || field.getType() == DataType.BOOLEAN) {
                sb.append(field.getValue());
            }

            if (i < fields.size() - 1) {
                sb.append(", ");
            }
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    public static String toXml(List<Field> fields) {
        StringBuilder sb = new StringBuilder();
        sb.append("<dados>\n");

        for (Field field : fields) {
            sb.append(" <").append(field.getName()).append("> ").append(field.getValue()).append("</").append(field.getName()).append(">\n");
        }
        sb.append("</dados>\n");
        return sb.toString();
    }

    public static String toYaml(List<Field> fields) {
        StringBuilder sb = new StringBuilder();

        for (Field field : fields) {
            sb.append(field.getName()).append(": ").append(field.getValue()).append("\n");
        }
        return sb.toString();
    }
}