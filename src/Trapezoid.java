public class Trapezoid extends Shape {

    public Trapezoid(int x, int y, int width, int height, String color) {
        super(x, y, width, height, color);
        setSideA(getWidth());
        setName("Trapezoid");
    }

    @Override
    protected int findSideC() {
        return (int) (getHeight() / Math.sin(45));
    }

    @Override
    protected int findSideB() {
        return (int) (getSideA() - 2 * getHeight() * (Math.cos(45) / Math.sin(45)));
    }

    @Override
    protected int findArea() {
        return (getSideA() + getSideB() / 2 * getHeight());
    }

    @Override
    public String say() {
        return super.say();

    }
}
