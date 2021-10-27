package app.classes;
import java.util.Scanner;
import app.interfaces.IBiblioteca;
public class Autor
{
        public String _nume;
        public int _varsta;
        public int  _anulDebut;

        public Autor (String nume , int varsta, int anDebut)
        {
            _nume=nume;
            _varsta=varsta;
            _anulDebut=anDebut;
        }
        public String getNume()
        {
            return _nume;
        }
        public int getVarsta()
        {
            return _varsta;
        }
        public int getAnDebut()
        {
            return _anulDebut;
        }

        public String toString()
        {
            return "Nume=" + _nume + '\'' + ", Varsta=" + _varsta + ", An Debut=" + _anulDebut ;
        }
}

