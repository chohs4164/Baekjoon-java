import java.util.Scanner;
public class _10101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angle1,angle2,angle3;
        angle1=scanner.nextInt();
        angle2=scanner.nextInt();
        angle3=scanner.nextInt();

        if(angle1==60&&angle2==60&&angle3==60) {
            System.out.println("Equilateral");
            return;
        }
        if(angle1+angle2+angle3==180 && angle1==angle2||angle2==angle3||angle1==angle3) {
            System.out.println("Isosceles");
            return;
        }
        if(angle1+angle2+angle3==180 && angle1!=angle2 && angle2!=angle3 && angle1!=angle3) {
            System.out.println("Scalene");
            return;
        }
        if(angle1+angle2+angle3!=180)
            System.out.println("Error");
    }
}
