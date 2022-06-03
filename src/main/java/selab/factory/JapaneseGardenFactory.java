package selab.factory;

import selab.flower.Flower;
import selab.flower.JFlower;
import selab.tree.JTree;
import selab.tree.Tree;

public class JapaneseGardenFactory implements GardenFactory {
    @Override
    public Flower createFlower() {
        return new JFlower();
    }

    @Override
    public Tree createTree() {
        return new JTree();
    }
}
