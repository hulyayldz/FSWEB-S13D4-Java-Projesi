public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(Point p){
        return distance(p.x, p.y);
    }

    public double distance(int x, int y){
        return Math.sqrt((Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)));
    }
}
