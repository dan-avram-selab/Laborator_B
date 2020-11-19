package ro.mta.facc.selab;

/**
 * Modeleaza un obiect de tip carte
 *
 * <p>Cartea va face parte parte dintr-o biblioteca..</p>
 *
 * @author dan.avram
 * @see Biblioteca
 */
public class Carte implements Comparable<Carte> {
    /**
     * Titlul cartii. Ar trebui sa fie un string de max 30 caractere
     */
    private String titlu;
    private String autor;
    private int anAparitie;
    private int numarPagini;


    /**
     * Se compara obiectul curent cu cel dat ca <b>paramentru</b>
     *
     * @param o Obiectul cu care se compara
     * @return intoarce 1 daca this e mai mare decat o, 0 daca...
     */
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

        if (1 == 1)
            System.out.println("x");
    }

    @Override
    public String toString() {
        return this.titlu + " scrisa de " + this.autor + ", aparuta in anul " + this.anAparitie;
    }
}
