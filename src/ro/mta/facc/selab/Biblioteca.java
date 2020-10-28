package ro.mta.facc.selab;

import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {
    ArrayList<Carte> listaCarti;

    public void sort()
    {
        Collections.sort(listaCarti);
    }

    public Biblioteca() {
        listaCarti = new ArrayList<Carte>();
    }

    public Biblioteca(ArrayList<Carte> list)
    {
        listaCarti = new ArrayList<Carte>();
        for (Carte c : list)
        {
            listaCarti.add(c);
        }

    }

    public void add(Carte carte)
    {
        listaCarti.add(carte);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Carte c : listaCarti)
        {
            builder.append(c);
            builder.append("\n");
        }

        return builder.toString();
    }
}
