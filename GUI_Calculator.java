package Meet_11_GUI;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;

// GUI  Calculator dengan FlowLayout
class GUI_Calculator extends JFrame {
    Label label1 = new Label("Masukkan Angka Pertama :");
    Label label2 = new Label("Masukkan Angka Kedua :");
    Label label3 = new Label("Masukkn Angka Pertama :");

    TextField tField1 = new TextField(9);
    TextField tField2 = new TextField(9);
    TextField tField3 = new TextField(9);


    JButton cb1 = new JButton("+");
    JButton cb2 = new JButton("-");
    JButton cb3 = new JButton("/");
    JButton cb4 = new JButton("*");

    GUI_Calculator() {
        setTitle("Design Calculator");
        setLocation(900, 150);
        setSize(180, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void objek() {
        Color Calc_bg= new Color(205, 205, 170);
        getContentPane().setLayout(new FlowLayout());
        getContentPane().setBackground(Calc_bg);

        getContentPane().add(label1);
        getContentPane().add(tField1);

        getContentPane().add(label2);
        getContentPane().add(tField2);

        getContentPane().add(label3);
        getContentPane().add(tField3);

        
        Color blueColor = new Color(0, 0, 255);
        cb1.setBorder(new LineBorder(blueColor));
        cb2.setBorder(new LineBorder(blueColor));
        cb3.setBorder(new LineBorder(blueColor));
        cb4.setBorder(new LineBorder(blueColor));

        cb1.setPreferredSize(new Dimension(45, 25));
        getContentPane().add(cb1);
        
        
        cb2.setPreferredSize(new Dimension(45, 25));
        getContentPane().add(cb2);

        cb3.setPreferredSize(new Dimension(45, 25));
        getContentPane().add(cb3);
        
        cb4.setPreferredSize(new Dimension(45, 25));
        getContentPane().add(cb4);
                
        setVisible(true);
        
    }

    public static void main(String[] args) {
        GUI_Calculator ZZ = new GUI_Calculator();
        ZZ.objek();
    }

}
