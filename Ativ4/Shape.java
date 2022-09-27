package Ativ4;

public abstract class Shape {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public double area(){
        return 0;
    }
}
