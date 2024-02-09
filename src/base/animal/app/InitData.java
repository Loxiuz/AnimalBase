package base.animal.app;

import base.animal.data.Animal;
import org.jetbrains.annotations.NotNull;

public class InitData {
    private AnimalController controller;

    public InitData(@NotNull AnimalController controller) {
        this.controller = controller;
    }

    public void initData(){
        controller.createAnimal(new Animal("Mike the Magick Marsvin", 10));
        controller.createAnimal(new Animal("Horsey the Horsing Horse", 15));
        controller.createAnimal(new Animal("Drake the Dancing Dragon", 12));
    }


}
