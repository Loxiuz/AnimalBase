package base.animal.app;

import base.animal.data.Animal;

import java.util.Collection;

public class Application {

    public static void main(String[] args){
    new Application().start();
    }
    private void start(){
        AnimalController controller = new AnimalController();
        InitData initData = new InitData(controller);
        initData.initData();


        Collection<Animal> animalList = controller.getAllAnimalsSorted(new AnimalNameComparator());
        for(Animal anAnimal: animalList){
            System.out.println(anAnimal);
        }

    }
}