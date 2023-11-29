package tn.esprit.gestionzoo.entities;

public interface Omnivore<F> extends Carnivore<F>,Herbivore<F>{

    void eatPlantAndMeet(F food);
}
