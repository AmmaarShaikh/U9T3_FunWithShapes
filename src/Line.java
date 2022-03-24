import java.awt.Graphics;

public class Line extends Shape{

    public Line(){
        super();
    }

    @Override
    public void draw(Graphics g){
        g.setColor(getColor());

        g.drawLine(getX1(), getY1(), getX2(), getY2());
    }
}
