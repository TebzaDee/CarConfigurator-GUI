package Mphahlele.TA;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;

public class showCar
{
    public static void main(String[] args) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new gui().setVisible(true);
            }
        });
    }
}
