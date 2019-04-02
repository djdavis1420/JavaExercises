package ClassExercises;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(((0 - this.x) * (0 - this.x)) + ((0 - this.y) * (0 - this.y)));
    }

    public double distance(int x, int y) {
        return Math.sqrt(((x - this.x) * (x - this.x)) + ((y - this.y) * (y - this.y)));
    }

    public double distance(Point that) {
        return Math.sqrt(((that.x - this.x) * (that.x - this.x)) + ((that.y - this.y) * (that.y - this.y)));
    }
}
