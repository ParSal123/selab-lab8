package selab;

import selab.factory.GardenFactory;
import selab.factory.IranianGardenFactory;
import selab.flower.Flower;
import selab.tree.Tree;

public class App {
    public static void main(String[] args) {
        GardenFactory factory = new IranianGardenFactory(); // or JapaneseGardenFactory
        Tree tree = factory.createTree();
        Flower flower = factory.createFlower();
        // Do whatever you want with the garden! :-)
    }
}
