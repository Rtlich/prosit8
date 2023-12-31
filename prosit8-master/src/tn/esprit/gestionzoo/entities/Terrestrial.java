package tn.esprit.gestionzoo.entities;

public final class Terrestrial extends Animal implements Omnivore<Food> {

    private int nbrLegs;

    public Terrestrial() {
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs:" + nbrLegs;
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println("A terrestrial eats " + meat);
    }

    @Override
    public void eatPlant(Food plant) {
        System.out.println("A terrestrial eats " + plant);
    }

    @Override
    public void eatPlantAndMeet(Food food) {
        if (food.equals(Food.PLANT))
            eatPlant(food);
        else if (food.equals(Food.MEAT))
            eatMeat(food);
        else
            System.out.println("A terrestrial eats " + food);
    }
}
