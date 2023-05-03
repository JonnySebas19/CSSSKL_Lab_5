public class Circle extends Shape {
    public int radius;
    public Circle( int newX, int newY, int newRadius){
        super(newX, newY);
        this.radius = newRadius;
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public int getRadius(){
        return radius;
    }
}
