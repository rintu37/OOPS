/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awtsum;

import java.awt.*;
import java.awt.event.*;
public class Awtsum implements ActionListener{

    Frame f=new Frame();
    Label l1=new Label("First Number");
    Label l2=new Label("Second Number");
    Label l3=new Label("Sum");
    TextField t1=new TextField();
    TextField t2=new TextField();
    TextField t3=new TextField();
    Button b1=new Button("find");
    Button b2=new Button("Cancel");
    Awtsum()
    {
    l1.setBounds(50,100,100,20);
    l2.setBounds(50,140,100,20);
    l3.setBounds(50,180,100,20);
    t1.setBounds(200,100,100,20);
    t2.setBounds(200,140,100,20);
    t3.setBounds(200,180,100,20);
    b1.setBounds(50,250,50,20);
    b2.setBounds(110,250,50,20);
    
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(t1);
    f.add(t2);
    f.add(t3);
    f.add(b1);
    f.add(b2);
    b1.addActionListener(this);
    b2.addActionListener(this);
    
    f.setLayout(null);
    f.setVisible(true);
    f.setSize(400,300);
    
    }
    public void actionPerformed(ActionEvent e)
    {
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());
        if(e.getSource()==b1)
        {
            t3.setText(String.valueOf(n1+n2));
            
        }
        if(e.getSource()==b2)
        {
            System.exit(0);
            
        }
        



}
    public static void main(String[] args) {
        new Awtsum();
    }
    
}
