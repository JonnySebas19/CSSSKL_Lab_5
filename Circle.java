import java.awt.*;
public class Circle extends Shape {
    private int radius;
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
    public void setRadius(int newRadius){
        this.radius = newRadius;
    }
    @Override
    public void draw(Graphics g){
        g.drawOval(getX(), getY(), radius, radius);
    }

}
