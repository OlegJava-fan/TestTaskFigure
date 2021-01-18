

public abstract class Shape {
    private int sideC;
    private int sideA;
    private int sideB;

    private int x;
    private int y;
    private int width;
    private int height;
    private String color;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public Shape(int x, int y, int width, int height, String color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    abstract protected int findSideC();

    abstract protected int findSideB();

    abstract protected int findArea();

    public String say()
    {
        String s = "Figure: "+ getName() + " Side A= " + getSideA() +
                " Side B= " + findSideB() + " diagonal= " + findSideC() +
                " Area= " + findArea() + " Color " + getColor();
        return s;
    }
}

