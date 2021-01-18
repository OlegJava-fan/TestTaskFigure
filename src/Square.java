public class Square extends Shape {
    public Square(int x, int y,int width, int height, String color){
        super(x,y,width,height,color);
        setSideA(getWidth());
        setName("Square");
    }
    @Override
    protected int findSideC() {
        return (getHeight()/2);
    }

    @Override
    protected int findSideB() {
        return (getWidth());
    }

    @Override
    protected int findArea() {
        return getHeight()*getWidth();
    }
    @Override
    public String say() {
       return super.say();

    }
}
