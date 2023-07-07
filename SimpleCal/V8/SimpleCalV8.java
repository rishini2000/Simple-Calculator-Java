
import javax.swing.JOptionPane;

public class SimpleCalV8{

    public static void main(String[] args){

        while(true){
            String opcode = JOptionPane.showInputDialog("Select Operation\n\n1 for Addition(+)\n2 for Subtraction(-)\n3 for Multyplication(*)\n4 for Division(/)\n5 for Remainder(%)\n\n0 for Exit");
            int op = Integer.parseInt(opcode);

            if(op==0) System.exit(0);

            String number1 = JOptionPane.showInputDialog("Enter Number 1 : ");
            double n1 = Double.parseDouble(number1);
        
            String number2 = JOptionPane.showInputDialog("Enter Number 2 : ");
            double n2 = Double.parseDouble(number2);

            double ans = 0;

            CalV2 c1 = new CalV2(n1, n2);

            if(op==1) ans = c1.getSum();

            if(op==2) ans = c1.getSub();

            if(op==3) ans = c1.getMul();

            if(op==4) ans = c1.getDiv();

            if(op==5) ans = c1.getRem();

            JOptionPane.showMessageDialog(null, "Answer is = " + ans);

        }
    }
}