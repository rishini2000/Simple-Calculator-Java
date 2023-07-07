import javax.swing.JOptionPane;

public class CalFunctionV2{

    public static void showSum(double x, double y){
        double ans = x+y;
        JOptionPane.showMessageDialog(null, "Answer is : " + ans);
    }
    public static void showSub(double x, double y){
        double ans = x-y;
        JOptionPane.showMessageDialog(null, "Answer is : " + ans);
    }
    public static void  showMul(double x, double y){
        double ans = x*y;
        JOptionPane.showMessageDialog(null, "Answer is : " + ans);
    }
    public static void showDiv(double x, double y){
        double ans = x/y;
        JOptionPane.showMessageDialog(null, "Answer is : " + ans);
    }
    public static void showRem(double x, double y){
        double ans = x%y;
        JOptionPane.showMessageDialog(null, "Answer is : " + ans);
    }

}