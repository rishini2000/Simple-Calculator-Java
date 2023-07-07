import javax.swing.JOptionPane;

public class SimpleCalV6{

public static void main(String[] args) {

while (true){

    String opcode = JOptionPane.showInputDialog("Select Operation\n\n1 for Addition(+)\n2 for Subtraction(-)\n3 for Multyplication(x)\n4 for Division(/)\n5 for Remainder(%)\n\n0 for Exit");
    int op = Integer.parseInt(opcode);

    if(op==0) System.exit(0);

    String number1 = JOptionPane.showInputDialog("Enter Number 1 : ");
    double n1 = Double.parseDouble(number1);

    String number2 = JOptionPane.showInputDialog("Enter Number 2 : ");
    double n2 = Double.parseDouble(number2);

    double ans = 0;

    if(op==1) ans = CalFunctionV2.getSum(n1,n2);

    if(op==2) ans = CalFunctionV2.getSub(n1,n2);

    if(op==3) ans = CalFunctionV2.getMul(n1,n2);

    if(op==4) ans = CalFunctionV2.getDiv(n1,n2);

    if(op==5) ans = CalFunctionV2.getRem(n1,n2);

    JOptionPane.showMessageDialog(null, "Answer is = " + ans);
             }

        }
        
}