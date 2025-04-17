import java.util.*;

public class ComplexNumberCalculator {
    public static void main(String[] args) {
        complex calcy = new complex();
        Scanner sc = new Scanner(System.in);
        System.out.println("Which operation to perform? ");
        String operation = sc.nextLine();
        System.out.println("X1:");
        int x1 = sc.nextInt();
        System.out.println("y1:");
        int y1 = sc.nextInt();
        System.out.println("X2:");
        int x2 = sc.nextInt();
        System.out.println("y2:");
        int y2 = sc.nextInt();
        switch (operation) {
            case "plus":
                System.out.println(calcy.sum(x1,y1,x2,y2)[0] + " " + calcy.sum(x1,y1,x2,y2)[1]);
                break;
            case "sub":
                System.out.println(calcy.dif(x1, y1, x2, y2)); 
                break;
            case "pro":
                System.out.println(calcy.product(x1, y1, x2, y2));
                break;
            default:
                break;
        }
    }
}
class complex{
    int[] sum(int x1, int y1, int x2, int y2){
        int[] ans = new int[2];
        ans[0]=x1+x2;
        ans[1]=y1+y2;
        return ans;
    }
    int[] dif(int x1, int y1, int x2, int y2){
        int[] ans = new int[2];
        ans[0]=x1-x2;
        ans[1]=y1-y2;
        return ans;        
    }
    int[] product(int x1, int y1, int x2, int y2){
        int[] ans = new int[2];
        ans[0]=x1*x2;
        ans[1]=y1*y2;
        return ans; 
    }
}
