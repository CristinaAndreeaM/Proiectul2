package app.gui;
import javax.swing.JOptionPane;

import app.classes.Autor;
import app.classes.Carte;
import app.interfaces.IBiblioteca;

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
    private JButton jocPericulosButton;
    private JButton imblanzitoareaDeSufleteButton;
    private JButton calatoriaCatreSineButton;
    private JButton ziDupaZiButton;
    private JButton martoraButton;
    private JButton singurPeLumeButton;
    private JButton harryPotterButton;
    private JButton furtunaButton;
    private JButton backButton3;
    private JPanel CautarePanel;
    private JTextField textField1;
    private JButton cautareButton;
    private JButton cautareCarteButton;

    public Proiect2()
    {

        Autor[] autori =new Autor[6];
        autori[0]=new Autor("Nora Roberts", 45,1990);
        autori[1]=new Autor ("Irvin D. Yalom",59,1992);
        autori[2]=new Autor("David Levithan",51,1989);
        autori[3]=new Autor("Hector Malot", 68,1998);
        autori[4]=new Autor(" J.K. Rowling",70,1979);
        autori[5]=new Autor("John Daselv", 48,2000);

        Carte[] carti=new Carte[8];
        carti[0]=new Carte("Joc periculos",12, 501,"Romantic",autori[0]);
        carti[1]=new Carte ("Imblanzitoarea de suflete", 32,487,"Romantic",autori[0]);
        carti[2]=new Carte("Calatoria catre sine", 43,567,"Aventura",autori[1]);
        carti[3]= new Carte("Zi dupa zi", 46,360,"Sf",autori[2]);
        carti[4]=new Carte ("Martora", 60,354,"Romantic", autori[0]);
        carti[5]=new Carte("Singur pe lume",56,600,"Aventura",autori[3]);
        carti[6]=new Carte("Harry Potter si piatra filosofala",56,450,"Sf",autori[4]);
        carti[7]=new Carte("Furtuna",25,300,"Actiune", autori[5]);




        cautareButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                boolean ok=false;
                String titlu=textField1.getText();
                for(int i=0;i<8;i++)
                {
                    if(titlu.equals(carti[i].getTitlu()))
                    {
                        JOptionPane.showMessageDialog(null,carti[i].detaliiCarte());
                        ok=true;
                    }

                }
                if(ok==false)
                   JOptionPane.showMessageDialog(null,"Cartea nu a fost gasita");
            }
        });


        imprumutButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ImprumutarePanel.setVisible(true);
                Meniu.setVisible(false);
            }
        });
        jocPericulosButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                imblanzitoareaDeSufleteButton.setVisible(false);
                calatoriaCatreSineButton.setVisible(false);
                ziDupaZiButton.setVisible(false);
                martoraButton.setVisible(false);
                singurPeLumeButton.setVisible(false);
                harryPotterButton.setVisible(false);
                furtunaButton.setVisible(false);
                dataImprumutariiButton.setVisible(true);
                dataReturnariiButton.setVisible(true);
                backButton.setVisible(true);
                backButton3.setVisible(false);
            }
        });
        dataImprumutariiButton.setVisible(false);
        dataReturnariiButton.setVisible(false);
        backButton.setVisible(false);

      imblanzitoareaDeSufleteButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                jocPericulosButton.setVisible(false);
                calatoriaCatreSineButton.setVisible(false);
                ziDupaZiButton.setVisible(false);
                martoraButton.setVisible(false);
                singurPeLumeButton.setVisible(false);
                harryPotterButton.setVisible(false);
                furtunaButton.setVisible(false);
                dataImprumutariiButton.setVisible(true);
                dataReturnariiButton.setVisible(true);
                backButton.setVisible(true);
                backButton3.setVisible(false);
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
                try
                {
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
                jocPericulosButton.setVisible(true);
                imblanzitoareaDeSufleteButton.setVisible(true);
                calatoriaCatreSineButton.setVisible(true);
                ziDupaZiButton.setVisible(true);
                martoraButton.setVisible(true);
                singurPeLumeButton.setVisible(true);
                harryPotterButton.setVisible(true);
                furtunaButton.setVisible(true);
                dataImprumutariiButton.setVisible(false);
                dataReturnariiButton.setVisible(false);
                backButton3.setVisible(true);

            }
        });
        backButton3.addActionListener(new ActionListener()
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
        cautareCarteButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                AutoriPanel.setVisible(false);
                Meniu.setVisible(false);
                CautarePanel.setVisible(true);
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
        jFrame.setSize(600,400);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
        jFrame.setLocation(650,250);


    }
}
