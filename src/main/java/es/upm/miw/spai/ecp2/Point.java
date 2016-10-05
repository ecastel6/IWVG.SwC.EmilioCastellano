package es.upm.miw.spai.ecp2;

public class Point {

    private int x, y;

    private int maxCoordenate = 100;

    private int minCoordenate = 0;

    public Point(int x, int y) throws Exception {
        setX(x);
        setY(y);
    }

    public Point(int xy) throws Exception {
        this(xy, xy);
    }

    public Point() throws Exception {
        this(0, 0);
    }

    public double module() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double phase() {
        return Math.atan((double) this.y / this.x);
    }

    public void translateOrigin(Point origin) {
        this.x -= origin.getX();
        this.y -= origin.getY();
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) throws Exception {
        if (x > maxCoordenate || x < minCoordenate)
            throw new Exception("Error! La coordenada X solo admite valores de 0 a 100");
        this.x = x;
    }

    public void setY(int y) throws Exception {
        if (y > maxCoordenate || y < minCoordenate)
            throw new Exception("Error! La coordenada Y solo admite valores de 0 a 100");
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point[" + x + "," + y + "]";
    }

}
