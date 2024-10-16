import java.util.Random;
public class Demo{
  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow(b.getY() - a.getY(),2) + Math.pow(b.getX() - a.getX(),2));
  }

  public static void main(String[]args){
    // Original Testing
    System.out.println("\nNormal Testing\n");
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    System.out.println(p1 + ", " + p2 + ", " + p3);
    System.out.println(distance(p1,p2));
    System.out.println(Point.distance(p1,p2));
    System.out.println(p1.distanceTo(p2));
    System.out.println(distance(p1,p2)==Point.distance(p1,p2)&&Point.distance(p1,p2)==p1.distanceTo(p2));
    System.out.println(distance(p1,p3)==Point.distance(p1,p3)&&Point.distance(p1,p3)==p1.distanceTo(p3));
    System.out.println(distance(p2,p3)==Point.distance(p2,p3)&&Point.distance(p2,p3)==p2.distanceTo(p3));
    //Testing using Random
    System.out.println("\nRandom Testing Loop\n");
    for(int i = 0; i < 10; i ++){
      Random rand = new Random();
      Point p4 = new Point(rand.nextInt(-100, 100),rand.nextInt(-100, 100));
      Point p5 = new Point(rand.nextInt(-100, 100),rand.nextInt(-100, 100));
      Point p6 = new Point(rand.nextInt(-100, 100),rand.nextInt(-100, 100));
      System.out.println(p4 + ", " + p5 + ", " + p6);
      System.out.println(distance(p4,p5));
      System.out.println(Point.distance(p4,p5));
      System.out.println(p4.distanceTo(p5));
      System.out.println(distance(p4,p5)==Point.distance(p4,p5)&&Point.distance(p4,p5)==p4.distanceTo(p5));
      System.out.println(distance(p4,p6)==Point.distance(p4,p6)&&Point.distance(p4,p6)==p4.distanceTo(p6));
      System.out.println(distance(p5,p6)==Point.distance(p5,p6)&&Point.distance(p5,p6)==p5.distanceTo(p6));
    }
    System.out.println("\nTesting for Triangle\n");
    Point p7 = new Point(0,0);
    Point p8 = new Point(4,0);
    Point p9 = new Point(2,Math.sqrt(12.0));
    System.out.println(p7 + ", " + p8 + ", " + p9);
    System.out.println(distance(p7,p8));
    System.out.println(distance(p7,p9));
    System.out.println(distance(p8,p9));
    System.out.println(distance(p7,p8)==distance(p7,p9)&&distance(p7,p9)==distance(p8,p9));
  }
}
