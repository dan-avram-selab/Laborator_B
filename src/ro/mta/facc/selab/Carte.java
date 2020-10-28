package ro.mta.facc.selab;

public class Carte implements Comparable<Carte>{
    private String titlu;
    private String autor;
    private int anAparitie;
    private int numarPagini;

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnAparitie(int anAparitie) {
        this.anAparitie = anAparitie;
    }

    public void setNumarPagini(int numarPagini) {
        this.numarPagini = numarPagini;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnAparitie() {
        return anAparitie;
    }

    public int getNumarPagini() {
        return numarPagini;
    }

    @Override
    public int compareTo(Carte o) {
        if (this.numarPagini < o.numarPagini)
            return -1;
        if (this.numarPagini > o.numarPagini)
            return 1;
        return 0;
    }

    public Carte(String titlu, String autor, int anAparitie, int nrPagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.anAparitie = anAparitie;
        this.numarPagini = nrPagini;
    }

    @Override
    public String toString() {
        return this.titlu + " scrisa de " + this.autor + ", aparuta in anul " + this.anAparitie;
    }
}
