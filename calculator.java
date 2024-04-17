import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

class Main {

    public static void calcbody(){
    showMessageDialog(null, "This Software is Created By Mohd Kaif Ansari");
    JFrame CalcFrame=new JFrame("Simple Calculator");
    JTextField j1=new JTextField(16);
    j1.setEditable(false);
    j1.setBounds(50, 10, 220, 50);
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b00,b000,bpoint;
    JButton equalButton=new JButton("=");
    equalButton.setBounds(165, 280, 110, 50);
    JButton plusButton=new JButton("+");
    plusButton.setBounds(215,60,50,50);
    JButton minusButton=new JButton("-");
    minusButton.setBounds(215,115,50,50);
    JButton multiplyButton=new JButton("*");
    multiplyButton.setBounds(215,170,50,50);
    JButton DivisonButton=new JButton("/");
    DivisonButton.setBounds(215,225,50,50);
    b1=new JButton("1");
    b1.setBounds(50,60,50,50);
    b2=new JButton("2");
    b2.setBounds(105,60,50,50);
    b3=new JButton("3");
    b3.setBounds(160,60,50,50);
    b4=new JButton("4");
    b4.setBounds(50,115,50,50);
    b5=new JButton("5");
    b5.setBounds(105,115,50,50);
    b6=new JButton("6");
    b6.setBounds(160,115,50,50);
    b7=new JButton("7");
    b7.setBounds(50,170,50,50);
    b8=new JButton("8");
    b8.setBounds(105,170,50,50);
    b9=new JButton("9");
    b9.setBounds(160,170,50,50);
    b00=new JButton("0");
    b00.setBounds(50,225,50,50);
    b000=new JButton("00");
    b000.setBounds(105,225,50,50);
    bpoint=new JButton(".");
    bpoint.setBounds(160,225,50,50);
    JButton clearButton=new JButton("Clear");
    clearButton.setBounds(50,280,110,50);
    b1.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) 
        {  
            if (j1.getText().isEmpty()) {
                j1.setText("1");
                
            }
            else{
           String j2=j1.getText().concat("1");
            j1.setText(j2);
        }

        } 
    }); 
    b2.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) 
        { 
            if (j1.getText().isEmpty()) {
                j1.setText("2");
                
            }
            else{
           String j2=j1.getText().concat("2");
            j1.setText(j2);
        }
        } 
    });
    b3.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) 
        { 
            if (j1.getText().isEmpty()) {
                j1.setText("3");
                
            }
            else{
           String j2=j1.getText().concat("3");
            j1.setText(j2);
        }
        } 
    });
    b4.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) 
        { 
            if (j1.getText().isEmpty()) {
                j1.setText("4");
                
            }
            else{
           String j2=j1.getText().concat("4");
            j1.setText(j2);
        }
        } 
    });
    b5.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) 
        { 
            if (j1.getText().isEmpty()) {
                j1.setText("5");
                
            }
            else{
           String j2=j1.getText().concat("5");
            j1.setText(j2);
        }
        } 
    });
    b6.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) 
        { 
            if (j1.getText().isEmpty()) {
                j1.setText("6");
                
            }
            else{
           String j2=j1.getText().concat("6");
            j1.setText(j2);
        }
        } 
    });
    b7.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) 
        { 
            if (j1.getText().isEmpty()) {
                j1.setText("7");
                
            }
            else{
           String j2=j1.getText().concat("7");
            j1.setText(j2);
        }
        } 
    });
    b8.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) 
        { 
            if (j1.getText().isEmpty()) {
                j1.setText("8");
                
            }
            else{
           String j2=j1.getText().concat("8");
            j1.setText(j2);
        }
        } 
    });
    b9.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) 
        { 
            if (j1.getText().isEmpty()) {
                j1.setText("9");
                
            }
            else{
           String j2=j1.getText().concat("9");
            j1.setText(j2);
        }
        } 
    });
    b00.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) 
        { 
            if (j1.getText().isEmpty()) {
                j1.setText("0");
                
            }
            else{
           String j2=j1.getText().concat("0");
            j1.setText(j2);
        }
        } 
    });
    b000.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) 
        { 
            if (j1.getText().isEmpty()) {
                j1.setText("00");
                
            }
            else{
           String j2=j1.getText().concat("00");
            j1.setText(j2);
        }
        } 
    });
    bpoint.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) 
        { 
            if (j1.getText().isEmpty()){
                j1.setText(".");  
            } 
           
            else{
                String j2=j1.getText().concat(".");

                j1.setText(j2);
            }
            {
               

        }
        } 
    });
    clearButton.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) 
        { 
            j1.setText("");
        } 
    });
    plusButton.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) 
        { 
            if (j1.getText().isEmpty()) {
                j1.setText("+");
                
            }
            else{
           String j2=j1.getText().concat("+");
            j1.setText(j2);
        }
        } 
    });
    minusButton.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) 
        { 
            if (j1.getText().isEmpty()) {
                j1.setText("-");
                
            }
            else{
           String j2=j1.getText().concat("-");
            j1.setText(j2);
        }
        } 
    });
    multiplyButton.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) 
        { 
            if (j1.getText().isEmpty()) {
                j1.setText("*");
                
            }
            else{
           String j2=j1.getText().concat("*");
            j1.setText(j2);
        }
        } 
    });
    DivisonButton.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) 
        { 
            if (j1.getText().isEmpty()) {
                j1.setText("/");
                
            }
            else{
           String j2=j1.getText().concat("/");
            j1.setText(j2);
        }
        } 
    });
    equalButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        try {
                            String[] tokens = j1.getText().split("[-+*/]");
                            double num1 = Double.parseDouble(tokens[0]);
                            double num2 = Double.parseDouble(tokens[1]);
                            double result = 0;
                            String operator = j1.getText().substring(tokens[0].length(), tokens[0].length() + 1);
                            switch (operator) {
                                case "+":
                                    result = num1 + num2;
                                    break;
                                case "-":
                                    result = num1 - num2;
                                    break;
                                case "*":
                                    result = num1 * num2;
                                    break;
                                case "/":
                                    result = num1 / num2;
                                    break;
                                default:
                                    throw new IllegalArgumentException("Invalid operator");
                            }
                            j1.setText(String.valueOf(result));
                        } catch (IllegalArgumentException ex) {
                            JOptionPane.showMessageDialog(null, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            JOptionPane.showMessageDialog(null, "Missing operator or operand", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });

    CalcFrame.add(b1);
    CalcFrame.add(b2);
    CalcFrame.add(b3);
    CalcFrame.add(plusButton);
    CalcFrame.add(b4);
    CalcFrame.add(b5);
    CalcFrame.add(b5);
    CalcFrame.add(b6);
    CalcFrame.add(minusButton);
    CalcFrame.add(b7);
    CalcFrame.add(b8);
    CalcFrame.add(b9);
    CalcFrame.add(multiplyButton);
    CalcFrame.add(b00);
    CalcFrame.add(b000);
    CalcFrame.add(bpoint);
    CalcFrame.add(DivisonButton);
    CalcFrame.add(equalButton);
    CalcFrame.add(clearButton);
    
    CalcFrame.add(j1);
    CalcFrame.setLayout(null); 
	CalcFrame.setSize(310, 400); 
    CalcFrame.setResizable(false);
	CalcFrame.setVisible(true);
    CalcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
    }
class calculator{
    public static void main(String[] args) {
        Main.calcbody();
    }
   
}