package nassim.fr.Triangle;

public class Triangle{
    public enum Type {EQUILATERAL, ISOCELE, SCALENE};
    public enum Angle {AIGU, DROIT, OBTUS};
    private double a, b, c;
    public Triangle(double a, double b, double c) throws TriangleException {
        if (a+b<=c || a<=0 | b<=0 | c<=0){
            throw new TriangleException();
        }
    }
    public Type getType ( ) { return null ; }
    public static Angle getPlusGrandAngle() { return null; }
    public String toString ( ) { return null; }
}
