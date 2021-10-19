package app.gui;

import app.classes.Carte;
import app.interfaces.Biblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Proiect2
{
    private JButton autoriButton;
    private JPanel MyPanel;
    private JButton exitButton;
    private JButton imprumutButton;
    private JPanel Meniu;
    private JPanel AutoriPanel;
    private JButton noraRobertsButton;
    private JButton irvinDYalomButton;
    private JButton davidLevithanButton;
    private JButton hectorMalotButton;
    private JButton jKRowlingButton;
    private JButton johnDaselvButton;
    private JLabel LabelNora1;
    private JLabel LabelNora2;
    private JLabel LabelNora3;
    private JLabel LabelIrvin;
    private JLabel LabelDavid;
    private JLabel LabelHector;
    private JLabel LabelRowling;
    private JLabel LabelJohn;
    private JPanel CartiPanel;
    private JButton backButton2;
    private JButton backButton1;
    private JPanel ImprumutarePanel;
    private JButton dataImprumutariiButton;
    private JButton dataReturnariiButton;
    private JButton backButton;


    public Proiect2()
    {
        imprumutButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ImprumutarePanel.setVisible(true);
                Meniu.setVisible(false);
            }
        });
        dataImprumutariiButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                long millis=System.currentTimeMillis();
                java.sql.Date date=new java.sql.Date(millis);
                dataImprumutariiButton.setText(date.toString());
            }
        });

        dataReturnariiButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                long millis=System.currentTimeMillis();
                java.sql.Date date=new java.sql.Date(millis);
                String dt = date.toString();  // Start date
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Calendar c = Calendar.getInstance();
                try {
                    c.setTime(sdf.parse(dt));
                } catch (ParseException ex)
                {
                    ex.printStackTrace();
                }
                c.add(Calendar.DATE, 14);
                dt = sdf.format(c.getTime());
                dataReturnariiButton.setText(dt);

            }
        });
        backButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ImprumutarePanel.setVisible(false);
                Meniu.setVisible(true);

            }
        });

        autoriButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //System.out.println("Buton apasat");
                AutoriPanel.setVisible(true);
                Meniu.setVisible(false);

            }
        });

        backButton1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                AutoriPanel.setVisible(false);
                Meniu.setVisible(true);
            }
        });
        backButton2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                CartiPanel.setVisible(false);
                AutoriPanel.setVisible(true);
                LabelNora1.setVisible(false);
                LabelNora2.setVisible(false);
                LabelNora3.setVisible(false);
                LabelIrvin.setVisible(false);
                LabelDavid.setVisible(false);
                LabelHector.setVisible(false);
                LabelRowling.setVisible(false);
                LabelJohn.setVisible(false);
            }
        });
        noraRobertsButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                CartiPanel.setVisible(true);
                backButton2.setVisible(true);
                AutoriPanel.setVisible(false);
                LabelNora1.setVisible(true);
                LabelNora2.setVisible(true);
                LabelNora3.setVisible(true);

            }
        });

        irvinDYalomButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                CartiPanel.setVisible(true);
                backButton2.setVisible(true);
                AutoriPanel.setVisible(false);
                LabelIrvin.setVisible(true);
            }
        });
        davidLevithanButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                CartiPanel.setVisible(true);
                backButton2.setVisible(true);
                AutoriPanel.setVisible(false);
                LabelDavid.setVisible(true);
            }
        });
        hectorMalotButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                CartiPanel.setVisible(true);
                backButton2.setVisible(true);
                AutoriPanel.setVisible(false);
                LabelHector.setVisible(true);
            }
        });
        jKRowlingButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                CartiPanel.setVisible(true);
                backButton2.setVisible(true);
                AutoriPanel.setVisible(false);
                LabelRowling.setVisible(true);
            }
        });
        johnDaselvButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                CartiPanel.setVisible(true);
                backButton2.setVisible(true);
                AutoriPanel.setVisible(false);
                LabelJohn.setVisible(true);

            }
        });

        exitButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);

            }
        });


    }



    public static void main(String[] args)
    {
        JFrame jFrame= new JFrame("Biblioteca");
        jFrame.setContentPane(new Proiect2().MyPanel);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setSize(550,400);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
        jFrame.setLocation(650,250);


    }
}
