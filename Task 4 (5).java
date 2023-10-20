public class Square implements Shape {
    private double length;

    public Square (double Length) {
        this.length = length;
    }
    @Override
    public double getArea(){
        return length * length;

    }
}


