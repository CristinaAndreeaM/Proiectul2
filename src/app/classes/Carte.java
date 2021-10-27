package app.classes;
import app.interfaces.IBiblioteca;

import java.util.Scanner;

public class Carte implements IBiblioteca
{
        private String _titlu;
        private int  _nrCapitole;
        private int  _nrPagini;
        public String _categorie;
        public Autor _autori;

        public Carte (String titlu, int nrCapitole, int nrPagini, String categorie,Autor autori)
        {
            _titlu = titlu;
            _nrCapitole = nrCapitole;
            _nrPagini = nrPagini;
            _categorie=categorie;
            _autori=autori;
        }
        public String detaliiCarte()
        {
            String rez= "Cartea cu titlu "+_titlu+" are autorul " +_autori;
            return rez;

        }
        public String getTitlu()
        {
            return _titlu;
        }
        public int getCapitole()
        {
            return _nrCapitole;
        }
        public int getPagini()
        {
            return _nrPagini;
        }

        public String toString()
        {
            return "Carte{" + "Titlu='" + _titlu + '\'' +  ", Capitole=" + _nrCapitole + ", Pagini=" + _nrPagini +", Categorie='" + _categorie + '\'' + _autori.toString() +'}';
        }
}
