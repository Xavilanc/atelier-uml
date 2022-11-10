import java.util.ArrayList;

public class Ferme {

    //Attributes
    public ArrayList<Animal> animals = new ArrayList<Animal>();
    
    public static void main(String[] args) {
        Vache vache = new Vache();
        vache.cry();
        vache.eat();

        Poule poule = new Poule();
        poule.pondre();
        poule.cry();
        poule.eat();

        Cochon cochon = new Cochon();
        cochon.boue();
        cochon.cry();
        cochon.eat();

        Dinde dinde = new Dinde();
        dinde.pondre();
        dinde.eat();
        dinde.cry();

        Ferme ferme = new Ferme();

        ferme.animals.add(cochon);
        ferme.animals.add(poule);
        ferme.animals.add(vache);
        ferme.animals.add(dinde);

        ferme.feedAnimals();
        ferme.cryAnimals();

    }

    //Methods
    public void feedAnimals() {
        for (Animal animal: this.animals) {
            animal.eat();
        }
    }

    public void cryAnimals() {
        for (Animal animal: this.animals) {
            animal.cry();
        }
    }
}
