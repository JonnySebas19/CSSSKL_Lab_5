import java.awt.*;
public class Cube extends Shape {
    private int sideLength;
    private int offset;
    public Cube(int x, int y, int sideLength, int offset){
        super(x, y);
        this.sideLength = sideLength;
        this.offset = offset;
    }
    public int getSideLength(){
        return this.sideLength;
    }
    public void setSideLength(int sideLength){
        this.sideLength = sideLength;
    }
    public int getOffset(){
        return offset;
    }
    public void setOffset(int offset){
        this.offset = offset;
    }
    @Override
    public double getArea(){
        return sideLength * sideLength * 6;
    }
    @Override
    public void draw (Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor( Color.BLUE );
        g2d.draw3DRect(getX(), getY(), sideLength, sideLength, true);
        g2d.draw3DRect(getX() + offset, getY() + offset, sideLength , sideLength, true);

        //Connecting lines of the two squares for the cube
        g2d.drawLine(getX(), getY(), getX() + offset, getY() + offset);
        g2d.drawLine(getX() + sideLength, getY(), getX() + offset + sideLength, getY() + offset);
        g2d.drawLine(getX(), getY() + sideLength, getX() + offset, getY() + offset + sideLength);
        g2d.drawLine(getX() + sideLength, getY() + sideLength, getX() + offset + sideLength, getY() + offset + sideLength);
    }

}
