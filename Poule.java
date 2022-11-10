public class Poule extends Animal implements Volaille {

    @Override
    public void eat() {
        System.out.println("La poule fait pic pic quand elle mange");
    }

    @Override
    public void cry() {
        System.out.println("La poule fait piou piou");
    }

    @Override
    public void pondre() {
        System.out.println("Oh un oeuf de poule");
    }
    
}
