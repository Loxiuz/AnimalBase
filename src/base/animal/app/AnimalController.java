package base.animal.app;

import base.animal.data.Animal;

import java.util.*;

public class AnimalController {
    private Map<Integer, Animal> allAnimals = new HashMap<>();
    private int lastId = 0;

    public Animal createAnimal(Animal newAnimal){
        lastId++;
        var animal = new Animal(newAnimal);
        animal.setId(lastId);
        allAnimals.put(lastId, animal);
        return animal;
    }

    public List<Animal> getAllAnimals(){
        return new ArrayList<>(allAnimals.values());
    }

    public Collection<Animal> getAllAnimalsSorted(){
        return new TreeSet<>(allAnimals.values());
    }

    public List<Animal> getAllAnimalsSorted(Comparator<Animal> comparator){
        List<Animal> animalList = new ArrayList<>(allAnimals.values());
        animalList.sort(comparator);
        return animalList;
    }
}
