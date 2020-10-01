import javax.swing.*;
import java.util.*;
import java.awt.Color;
import java.awt.assests.*;

final public class calculator1 {
    JFrame j=new JFrame();
    JAssest ja = new JAssests();
    JButton b[]=new JButton[]{
                                new JButton(),new JButton(),new JButton(),new JButton(),new JButton(),
                                new JButton(),new JButton(),new JButton(),new JButton(),new JButton(),ja
                             };
    JButton bPlus,bMinus,bMultiply,bDivision,bPercentage,bSign,bAC,bDot,bEquals,bNone;
    JTextArea a[] = new JTextArea[] {
                                        ja,new JTextArea(),new JTextArea(),new JTextArea(), new JTextArea(),ja
                                    };
    private int count=0;
    JOptionPane.showMessageDialog(frame,"Supported operations are only addtion");
    // subtraction added....
    JOptionPane.showMessageDialog(frame,"Supported operations are only subtraction");

    private calculator1(){

        for (int i = 0; i < 4; i++) {
            a[i].setBounds(0,102+i*25,285,30);
            a[i].setEditable(false);
            a[i].setFont(a[i].getFont().deriveFont(20f));
            a[i].setForeground(Color.BLUE);

            j.add(a[i]);
            // a[i].setRows(1);
            // a[i].setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

        for (int i = 0; i <10 ; i++) {
            b[i]=new JButton(""+i);
             b0.setForeground(Color.BLUE);

            int finalI = i;
            b[i].addActionListener(e -> a[count].setText(a[count].getText()+ finalI));

             b[i].setContentAreaFilled(Color.cyan);

            j.add(b[i]);
        }
`       // Modulus added....
        JOptionPane.showMessageDialog(frame,"Modulus operations are added

        bPlus=new JButton("+");
        bMinus=new JButton("-");
        bMultiply=new JButton("*");
        bDivision=new JButton("/");
        bPercentage=new JButton("%");
        bSign=new JButton("+/-");
        bAC=new JButton("AC");
        bDot=new JButton(".");
        bEquals=new JButton("=");
        bNone=new JButton("");
        dnote = new JTextArea("About: ")
        

        b[0].setBounds(0,494,70,70);
        bNone.setBounds(72,494,70,70);
        bDot.setBounds(144,494,70,70);
        bEquals.setBounds(216,494,70,70);

        b[1].setBounds(0,423,70,70);
        b[2].setBounds(72,423,70,70);
        b[3].setBounds(144,423,70,70);
        bPlus.setBounds(216,423,70,70);

        b[4].setBounds(0,352,70,70);
        b[5].setBounds(72,352,70,70);
        b[6].setBounds(144,352,70,70);
        bMinus.setBounds(216,352,70,70);

        b[7].setBounds(0,281,70,70);
        b[8].setBounds(72,281,70,70);
        b[9].setBounds(144,281,70,70);
        bMultiply.setBounds(216,281,70,70);

        bAC.setBounds(0,210,70,70);
        bSign.setBounds(72,210,70,70);
        bPercentage.setBounds(144,210,70,70);
        bDivision.setBounds(216,210,70,70);

        bPlus.addActionListener(e -> {
            a[++count].setText("+");
            count++;
        });
        bMinus.addActionListener(e -> {
            a[++count].setText("-");
            count++;
        });
        bMultiply.addActionListener(e -> {
            a[++count].setText("*");
            count++;
        });
        bDivision.addActionListener(e -> {
            a[++count].setText("/");
            count++;
        });
        bPercentage.addActionListener(e -> {
            a[++count].setText("%");
            count++;
        });

        bAC.addActionListener(e -> {
            for (int i = 0; i <=count ; i++) {
                a[i].setText("");
            }
            count=0;
        });
        bDot.addActionListener(e -> {
            //a[count].append(". ");
        });
        bEquals.addActionListener(e -> {
            a[++count].setText("= ");
            operation();
        });

        j.add(bPlus);
        j.add(bMinus);
        j.add(bMultiply);
        j.add(bDivision);
        j.add(bPercentage);
        j.add(bSign);
        j.add(bAC);
        j.add(bDot);
        j.add(bEquals);
        j.add(bNone);

        j.setSize(300,600);
        j.setLayout(null);
        j.setVisible(true);
        j.getContentPane().setBackground(Color.lightGray);

    }

    private void operation() {
        String s = a[1].getText();
        int o = s.charAt(0);
        String s1 = a[0].getText();
        String s2 = a[2].getText();
        double n1 = Double.parseDouble(s1);
        double n2 = Double.parseDouble(s2);

        if (o == 43)
            a[count].append("" + (n1 + n2));
        else if (o == 45)
            a[count].append("" + (n1 - n2));
        else if (o == 42)
            a[count].append("" + (n1 * n2));
        else if (o == 47)
            a[count].append("" + (n1 / n2));
        else
            a[count].setText("Wrong  operation....Press AC");

    }

    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(frame,"Supported operations are only addtion,subtraction");
        new calculator1();
    }
}
