public class Persoana {
    int varsta;
    String sex;
    String nume;
    String prenume;

    public Persoana(int varsta, String sex, String nume) {
        this.varsta = varsta;
        this.sex = sex;
        this.nume = nume;
    }

    public Persoana(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    Persoana(){
        varsta = 20;
        sex = "m";
        nume = "Unknown";
        prenume = "Unknown";
    }
}
