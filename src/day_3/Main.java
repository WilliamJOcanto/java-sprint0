package day_3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

    Pet pet1 = new Pet("Cooper", PetType.DOG, 12);
    Pet pet2 = new Pet("Tito", PetType.CAT, 10);
    Person person1 = new Person("Will", "Ocanto", "23451123-8", 29, 1.77, false);
    Set<Pet> mascots1 = new HashSet<>();
    mascots1.add(pet1);
    mascots1.add(pet2);
    person1.addPets(mascots1);

    person1.present();

    Pet pet3 = new Pet("Muñeca", PetType.DOG, 14);
    Person person2 = new Person("Sharon", "Ocanto", "23452808-6", 33, 1.67, true);
    Set<Pet> mascots2 = new HashSet<>();
    mascots2.add(pet3);
    person2.addPets(mascots2);
    person2.present();
    }
}