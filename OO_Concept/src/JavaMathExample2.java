
public class JavaMathExample2 {
  
  public static void main(String[] args){
    double a = 30;
    // converting values to radiant
    double b = Math.toRadians(a);
    // return the trigonometric sine o`f a
    System.out.println("Sine value of a is: " + Math.sin(a));
    // return the trigonometric cosine value of a
    System.out.println("Cosine value of a is: " + Math.cos(a));
    // return the trigonometric tangent value of a
    System.out.println("Tangent value of a is: " + Math.tan(a));
    // return the trigonometric arc sine of a
    System.out.println("Arc sine value of a is: " + Math.asin(Math.sin(a)));
    // return the trigonometric arc cosine value of a
    System.out.println("Arc cosine value of a is: " + Math.acos(Math.cos(a)));
    // return the trigonometric arc tangent value of a
    System.out.println("Arc tangent value of a is: " + Math.atan(Math.tan(a)));
    // return the hyperbolic sine of a
    System.out.println("Hyperbolic sine value of a is: " + Math.sinh(a));
    // return the hyperbolic cosine value of a
    System.out.println("Hyperbolic cosine value of a is: " + Math.cosh(a));
    // return the hyperbolic tangent value of a
    System.out.println("Hyperbolic tangent value of a is: " + Math.tanh(a));
  }
}
