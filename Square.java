public class Square extends Rectangle{


    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }


    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }



    @Override
    public double getPerimeter() {
        return getSide() * 4;
    }

    @Override
    public String toString() {
        return "Square{" + "Side: " + getSide() +", color: " + getColor() + ", Filled: " +isFilled() +"}";
    }
}
