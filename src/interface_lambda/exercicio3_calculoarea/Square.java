package interface_lambda.exercicio3_calculoarea;

public record Square(double side) implements GeometricForm {

    @Override
    public double getArea() {
        return side * side;
    }
}
