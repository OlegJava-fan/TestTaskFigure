

public class Rectangle extends Shape {

    public Rectangle(int x, int y, int width, int height, String color) {

        super(x, y, width, height, color);
        setSideA(getWidth());
        setSideB(getHeight());
        setName("Rectangle");
    }
    @Override
    protected int findSideC() {
        return (int) Math.sqrt(getSideA()*getSideA()+ getSideB()*getSideB());
    }

    @Override
    protected int findSideB() {
        return getHeight();
    }

    @Override
    protected int findArea() {
        return getSideA()*getSideB() ;
    }

    @Override
    public String say() {
        return super.say();
    }
}
