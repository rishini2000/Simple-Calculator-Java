
import javax.swing.JOptionPane;

public class SimpleCalV2{

public static void main (String [] args) {

    String opcode = JOptionPane.showInputDialog("Select Operation\n\n1 for Addition(+)\n2 for Subtraction(-)\n3 for multyplication(x)\n4 for Division(/)\n5 for remainder(%)\n\n");
    int op = Integer.parseInt(opcode);

    String number1 = JOptionPane.showInputDialog("Enter Number 1 : ");
    int n1 = Integer.parseInt(number1);

    String number2 = JOptionPane.showInputDialog("Enter Number 2 : ");
    int n2 = Integer.parseInt(number2);

    int ans = 0;
    
    if(op==1)
    ans = n1+n2;

    if(op==2)
    ans = n1-n2;

    if(op==3)
    ans = n1*n2;

    if(op==4)
    ans = n1/n2;
    
    if(op==5)
    ans = n1%n2;

    JOptionPane.showMessageDialog(null, "Answer is : " + ans);

}    

}