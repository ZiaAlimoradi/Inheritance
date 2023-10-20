public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle (6.0);
        Square square = new Square(3.0);
        ShapeBuilder builder = new ShapeBuilder();
        builder.addShape (circle);
        builder.addShape(square);
        double totalArea = builder.getTotalArea();
            System.out.println("Total area of shapes:"+ totalArea);
        }
    }
