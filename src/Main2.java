import java.sql.SQLOutput;

public class Main2 {
    public static void main(String[] args) {
        Carte carte1 = new Carte(); // cuvantul cheie new se foloseste la crearea sau instantierea obiectelor
        carte1.autor = "Mihai Eminescu";
        carte1.titlu = "Poezii";
        carte1.pret = 35.00;

        Carte carte2 = new Carte();
        carte2.autor = "Ion Creanga";
        carte2.titlu = "Amintiri din copilarie";
        System.out.println(carte1.pret);
        System.out.println(carte2.pret);

        System.out.println(carte1.getPret());
        System.out.println(carte1.afiseaza());
        carte1.titlu = "Basme";
        System.out.println(carte1.afiseaza());

        Masina masina1 = new Masina();
        Masina masina2 = new Masina();
        System.out.println(masina1.marca);
        masina2.marca = "Dacia";
        System.out.println(masina2.marca);
        System.out.println(masina1.marca);

        Masina masina3 = new Masina();
        Masina masina4 = new Masina();
        masina3.anFabricatie = 2010;
        masina4.anFabricatie = 2020;
        System.out.println(masina3.getAnFabricatie());
        System.out.println(masina4.getAnFabricatie());
        //System.out.println(masina4);

        Persoana persoana1 = new Persoana();
        System.out.println(persoana1.nume);
        System.out.println(persoana1.prenume);

        Persoana persoana2 = new Persoana("Ion", "Popescu");
        System.out.println(persoana2.varsta);
        System.out.println(persoana2.sex);

        Persoana persoana3 = new Persoana (36,"F", "Pasca");
        System.out.println(persoana3.varsta+persoana3.sex+persoana3.nume);

        Animal animal1 = new Animal();
        Animal animal4 = new Animal("Azorel");
        Animal animal5 = new Animal("Pisi", "maro");
        Animal animal6 = new Animal("Leo","negru",false);
        System.out.println(animal1.nume);
        System.out.println(animal1.culoare);
        System.out.println(animal1.vegetarian);

        animal1.nume="Pluto";
        System.out.println(animal1.nume);

// ex. 4
        animal1.mananca();
        animal1.doarme();
//ex. 5
        animal1.culoare="maro";
        System.out.println(animal1.afiseaza());
// ex. 6
        Animal animal2 = new Animal("Shar Pei",1);
        System.out.println(animal2.rasa);
        System.out.println(animal2.varsta);
// ex. 7
        Animal animal3 = new Animal("Star","alb","Boxer",2);
        animal3.mananaca2();
        animal3.doarme2();

        Masina masina5 = new Masina();
        System.out.println(masina5.marca);

        animal2.mananca();
        animal2.doarme();
        animal1.mananca();
        animal4.mananca();
        animal5.doarme();
        animal6.doarme();
        System.out.println(animal4.afiseaza());
        System.out.println(animal5.afiseaza());
        System.out.println(animal5.rasa);
        System.out.println(animal5.culoare);
        animal6.doarme2();

        Elev elev1 = new Elev("Popescu");
        Elev elev2 = new Elev("Ionescu");
        System.out.println(elev1.nume);
        System.out.println(elev2.nume);
        elev1.diriginte = "Isoscel2";
        System.out.println(elev2.diriginte);

        elev1.metodaNonStatica();
        Elev.metodaStatica();

        Film film1 = new Film();
        film1.setTitlu("Titanic");
        System.out.println(film1.getTilu());

        Inotator inotator1 = new Inotator();
        inotator1.seAntreneaza();
        inotator1.seOdihneste();

        Maratonist maratonist1 = new Maratonist();
        maratonist1.seAntreneaza();
        maratonist1.seOdihneste();


        animal1.scoateSunete();

        Pisica pisica1 = new Pisica();
        pisica1.scoateSunete();

        Caine caine = new Caine();
        caine.scoateSunete();

        pisica1.scoateSunete();
        caine.scoateSunete();























    }
}
