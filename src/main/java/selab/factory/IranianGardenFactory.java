package selab.factory;

import selab.flower.Flower;
import selab.flower.Khatmi;
import selab.tree.Chenar;
import selab.tree.Tree;

public class IranianGardenFactory implements GardenFactory {
    @Override
    public Flower createFlower() {
        return new Khatmi();
    }

    @Override
    public Tree createTree() {
        return new Chenar();
    }
}
