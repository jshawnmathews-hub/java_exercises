import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * This class creates a simple UI calculator using JFrame
 *
 * @author Shawn Mathews
 * @version 1.0
 */
public class SimpleGUI extends JFrame implements ActionListener {
    double num1 = 0;
    char op = ' ';
    boolean clearOnNext = true;
    JTextField display;

    public SimpleGUI(){
        super("Calculator");
        setSize(300,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField("0");
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 32));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4,4,5,5));
        String[] btnLabels = {"7","8","9","/","4","5","6","*","1","2","3","-","0","C","=","+"};

        for(int i = 0; i < btnLabels.length; i++){
            JButton b = new JButton(btnLabels[i]);
            b.setFont(new Font("Arial", Font.PLAIN, 20));
            b.addActionListener(this);
            panel.add(b);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();

        if(cmd.equals("0") || cmd.equals("1") || cmd.equals("2") || cmd.equals("3") || cmd.equals("4")
                || cmd.equals("5") || cmd.equals("6") || cmd.equals("7") || cmd.equals("8") || cmd.equals("9")){
            if(clearOnNext == true){
                display.setText(cmd);
                clearOnNext = false;
            }
            else{
                if(display.getText().equals("0")){
                    display.setText(cmd);
                } else {
                    display.setText(display.getText() + cmd);
                }
            }
            return;
        }

        if(cmd.equals("C")){
            display.setText("0");
            num1 = 0;
            op = ' ';
            clearOnNext = true;
            return;
        }

        if(cmd.equals("=")){
            double num2 = Double.parseDouble(display.getText());
            double ans = 0;

            if(op=='+')
                ans = num1+num2;
            else if(op=='-')
                ans = num1-num2;
            else if(op=='*')
                ans=num1*num2;
            else if(op=='/'){
                if(num2==0){
                    display.setText("Error");
                    op=' ';
                    clearOnNext=true;
                    return;
                }
                ans = num1/num2;
            }
            else
                ans = num2;

            String ansStr = "" + ans;
            if(ansStr.endsWith(".0")){
                ansStr = ansStr.substring(0, ansStr.length()-2);
            }
            display.setText(ansStr);

            op = ' ';
            clearOnNext = true;
            return;
        }

        num1 = Double.parseDouble(display.getText());
        op = cmd.charAt(0);
        clearOnNext = true;
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new SimpleGUI();
            }
        });
    }
}