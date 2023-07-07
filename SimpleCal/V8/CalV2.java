
import javax.swing.JOptionPane;

public class CalV2{

    double n1;
    double n2;
public CalV2(double x, double y){
    n1 = x;
    n2 = y;
}

public double getSum(){
    double ans = n1+n2;
    return ans;
}

public double getSub(){
    double ans = n1-n2;
    return ans;

}

public double getMul(){
    double ans = n1*n2;
    return ans;
}

public double getDiv(){
    double ans = n1/n2;
    return ans;
}

public double getRem(){
    double ans = n1%n2;
    return ans;
}

}