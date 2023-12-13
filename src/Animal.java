public class Animal {
    String nume;
    String culoare;
    boolean vegetarian;

    Animal() {
        nume = "Unknown";
        culoare = "Unknown";
        vegetarian = false;
    }

    public Animal(String nume, String culoare, boolean vegetarian) {
        this.nume = nume;
        this.culoare = culoare;
        this.vegetarian = vegetarian;
    }

    public Animal(String nume) {
        this.nume = nume;
    }

    public Animal(String nume, String culoare) {
        this.nume = nume;
        this.culoare = culoare;
    }

    public String afiseaza() {
        return (nume + " are culoarea " + culoare);
    }


    public void mananca() {
        System.out.println(nume + " mananca");
    }

    public void doarme() {
        System.out.println(nume + " doarme");
    }


    String rasa;
    int varsta;

    public Animal(String rasa, int varsta) {
        this.rasa = rasa;
        this.varsta = varsta;
    }

    public Animal(String nume, String culoare, String rasa, int varsta) {
        this.nume = nume;
        this.culoare = culoare;
        this.rasa = rasa;
        this.varsta = varsta;
    }

    public void mananaca2() {
        System.out.println(nume +" este din rasa "+ rasa+", " + culoare + " are "+ varsta + " ani si mananaca");
    }
    public void doarme2(){
        System.out.println(nume +" este din rasa "+rasa+", "+culoare+ " are "+varsta+" ani si doarme");
    }

    public  void scoateSunete(){
        System.out.println(nume +" scoate sunete");
    }




}

