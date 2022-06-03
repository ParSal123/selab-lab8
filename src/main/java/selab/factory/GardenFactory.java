package selab.factory;

import selab.flower.Flower;
import selab.tree.Tree;

public interface GardenFactory {
    Flower createFlower();

    Tree createTree();
}
