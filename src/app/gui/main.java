package app.gui;
import app.classes.Autor;
import app.classes.Carte;

import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

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
        System.out.println("Alegeti categoria : \n1.Romanitc\n 2. Sf\n 3.Actiune\n 4.Aventura\n");
        int optiune=sc.nextInt();
        if(optiune==1)
        {
            System.out.println("1.Nora Roberts");
            int optiuneAutor=sc.nextInt();
            if(optiuneAutor==1)
            {
                boolean ok=false;
                for(int i=0;i<=7;i++)
                    if(carti[i]._categorie.equals("Romantic") && carti[i]._autori._nume.equals("Nora Roberts"))
                    {
                        ok=true;
                        System.out.println(carti[i].toString());
                    }
                if(ok==false)
                    System.out.println("Nu exista carte de aceasta categorie");
            }
        }
        else if(optiune==2)
        {
            System.out.println("1.David Levithan\n 2.J.K.Rowlling");
            int optiuneAutor=sc.nextInt();
            if(optiuneAutor==1)
            {
                boolean ok = false;
                for (int i = 0; i <= 7; i++)
                {
                    if (carti[i]._categorie.equals("Sf") && carti[i]._autori._nume.equals("David Levithan"))
                    {
                        ok = true;
                        System.out.println(carti[i].toString());
                    }
                }

                if (ok == false)
                    System.out.println("Nu exista carte de aceasta categorie");
            }
            else if (optiuneAutor==2)
            {
                boolean ok = false;
                for (int i = 0; i <= 7; i++)
                {
                    if (carti[i]._categorie.equals("Sf") && carti[i]._autori._nume.equals("J.K.Rowlling"))
                    {
                        ok = true;
                        System.out.println(carti[i].toString());
                    }
                }

                if (ok == false)
                    System.out.println("Nu exista carte de aceasta categorie");
            }

        }
        else if (optiune==3)
        {
            System.out.println("1.John Daselv");
            boolean ok=false;
            for(int i=0;i<=7;i++)
                if(carti[i]._categorie.equals("Actiune"))
                {
                    ok=true;
                    System.out.println(carti[i].toString());
                }
            if(ok==false)
                System.out.println("Nu exista carte de aceasta categorie");
        }
        else if (optiune ==4)
        {
            System.out.println("1. Irvin D. Yalom \n 2.Hector Malot");
            int optiuneAutor=sc.nextInt();
            if(optiuneAutor==1)
            {

                boolean ok = false;
                for (int i = 0; i <= 7; i++)
                    if (carti[i]._categorie.equals("Aventura") && carti[i]._autori._nume.equals("Irvin D. Yalom"))
                    {
                        ok = true;
                        System.out.println(carti[i].toString());
                    }
                if (ok == false)
                    System.out.println("Nu exista carte de aceasta categorie");
            }
            else if(optiuneAutor==2)
            {
                boolean ok = false;
                for (int i = 0; i <= 7; i++)
                    if (carti[i]._categorie.equals("Aventura") && carti[i]._autori._nume.equals("Hector Malot"))
                    {
                        ok = true;
                        System.out.println(carti[i].toString());
                    }
                if (ok == false)
                    System.out.println("Nu exista carte de aceasta categorie");
            }

        }
        else System.out.println("Optiune nevalida");

    }
}
