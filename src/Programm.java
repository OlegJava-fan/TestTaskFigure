import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {
    Rectangle rectangle =new Rectangle(0,0,100,200,"RED");
    Circle  circle= new Circle(0,200,100,100,"BLUE");
    Square square=new Square(0,400,200,200,"GREEN");
    Trapezoid trapezoid= new Trapezoid(200, 0 ,100,50,"MAGENTA");
        ArrayList<Object>figure=new ArrayList<>(4);
        figure.add(rectangle.say());
        figure.add(square.say());
        figure.add(circle.say());
        figure.add(trapezoid.say());

        for (int i=0;i<Math.random()*3;i++){
            System.out.println(figure.get(i));

        }
    }
}