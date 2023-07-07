import javax.swing.JOptionPane;

public class SimpleCalV1{

public static void main(String args[]){

String opcode= JOptionPane.showInputDialog("Select Operation\n\n1 for Addition(+)\n2 for Subtraction(-)");//\n \t Escape Charactors
int op = Integer.parseInt(opcode);

String num1 = JOptionPane.showInputDialog("Enter Number 1 : ");
String num2 = JOptionPane.showInputDialog("Enter Number 2 : ");

int n1 = Integer.parseInt(num1);
int n2 = Integer.parseInt(num2);

int ans =0;

if(op==1) ans = n1+n2;

if(op==2) ans = n1-n2;

JOptionPane.showMessageDialog(null,"Answer is " + ans );

}

}


