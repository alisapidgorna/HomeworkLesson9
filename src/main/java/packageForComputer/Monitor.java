package packageForComputer;

public class Monitor {
    private double size;
    private int horizontal;
    private int vertical;

    public Monitor(double size, int horizontal, int vertical) {
        this.size = size;
        this.horizontal = horizontal;
        this.vertical = vertical;
    }
    public void show(){
        System.out.println("Monitor -> is showing");
    }
    public double getSize() {
        return size;
    }
    public int getHorizontal() {
        return horizontal;
    }
    public int getVertical() {
        return vertical;
    }
}
