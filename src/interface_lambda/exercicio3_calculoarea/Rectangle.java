package interface_lambda.exercicio3_calculoarea;

public record Rectangle(double height, double base) implements GeometricForm {

    @Override
    public double getArea() {
        return height * base;
    }
}
