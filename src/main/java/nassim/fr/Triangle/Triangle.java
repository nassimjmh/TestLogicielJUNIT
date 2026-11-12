package nassim.fr.Triangle;

public class Triangle{
    public enum Type {EQUILATERAL, ISOCELE, SCALENE};
    public enum Angle {AIGU, DROIT, OBTUS};
    private double a, b, c;
    public Triangle(double a, double b, double c) throws TriangleException {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a){
            throw new TriangleException();
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Type getType ( ) { return null ; }
    public static Angle getPlusGrandAngle() { return null; }
    public String toString ( ) { return null; }
}
