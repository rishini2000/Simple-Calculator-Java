import javax.swing.JOptionPane;

public class SimpleCalV5{

    public static void main(String[] args) {

        while(true){

            String opcode = JOptionPane.showInputDialog("Select Operation\n\n1 for Addition(+)\n2 for Subtraction(-)\n3 for Multypllication(x)\n4 for Division (/)\n5 for Remainder(%)\n\n0 for Exit");

            int op = Integer.parseInt(opcode);

            if(op==0) System.exit(0);

            String number1 = JOptionPane.showInputDialog("Enter Number 1 : ");
            double n1 = Double.parseDouble(number1);

            String number2 = JOptionPane.showInputDialog("Enter Number 1 : ");
            double n2 = Double.parseDouble(number2);

            if(op==1) CalFunctionV2.showSum(n1,n2);

            if(op==2) CalFunctionV2.showSub(n1,n2);

            if(op==3) CalFunctionV2.showMul(n1,n2);

            if(op==4) CalFunctionV2.showDiv(n1,n2);

            if(op==5) CalFunctionV2.showRem(n1,n2);
        }
    }
}


    

