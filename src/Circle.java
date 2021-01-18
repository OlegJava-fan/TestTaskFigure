public class Circle extends Shape {
    private final int diameter = findSideC();
    private final int radius = findSideB();


    public Circle(int x, int y, int width, int height, String color) {

        super(x, y, width, height, color);
        setName("Circle");
    }


    @Override
    protected int findSideC() {
        return getHeight();
    }

    @Override
    protected int findSideB() {
        return getHeight() / 2;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    protected int findArea() {
        return (int) ((getRadius() * getRadius()) * Math.PI);
    }

    @Override
   public String say() {
      String s ="Figure: " + getName()+
                " Radius= "+getRadius()+ " Diameter = " +getDiameter()+
                " Area= "+ findArea()+ " Color "+ getColor();
        return s;
    }
}


