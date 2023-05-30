package ChrisHofer.Uebungen.Abstract_Interface.Figures;

public class Circle extends Figure {
    protected double length;
    protected double width;

    public Circle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
