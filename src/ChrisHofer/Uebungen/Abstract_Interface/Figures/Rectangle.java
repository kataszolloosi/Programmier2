package ChrisHofer.Uebungen.Abstract_Interface.Figures;

public class Rectangle extends Figure {
    protected double radius;

    public Rectangle(double radius) {
        this.radius = radius;
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
