package base.animal.app;

import base.animal.data.Animal;

import java.util.Comparator;

public class AnimalNameComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
