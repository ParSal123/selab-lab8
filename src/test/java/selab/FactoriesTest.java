package selab;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import selab.factory.GardenFactory;
import selab.factory.IranianGardenFactory;
import selab.factory.JapaneseGardenFactory;
import selab.flower.Flower;
import selab.flower.JFlower;
import selab.flower.Khatmi;
import selab.tree.Chenar;
import selab.tree.JTree;
import selab.tree.Tree;

/**
 * Unit test for simple App.
 */
public class FactoriesTest
{

    @Test
    public void IranianGardenFactory_Should_Create_Chenar_Tree()
    {
        GardenFactory factory = new IranianGardenFactory();
        Tree tree = factory.createTree();
        assertTrue(tree instanceof Chenar);
    }
    
    @Test
    public void IranianGardenFactory_Should_Create_Khatmi_Flower()
    {
        GardenFactory factory = new IranianGardenFactory();
        Flower flower = factory.createFlower();
        assertTrue(flower instanceof Khatmi);
    }
    
    @Test
    public void JapaneseGardenFactory_Should_Create_JTree_Tree()
    {
        GardenFactory factory = new JapaneseGardenFactory();
        Tree tree = factory.createTree();
        assertTrue(tree instanceof JTree);
    }

    @Test
    public void JapaneseGardenFactory_Should_Create_JFlower_Flower()
    {
        GardenFactory factory = new JapaneseGardenFactory();
        Flower flower = factory.createFlower();
        assertTrue(flower instanceof JFlower);
    }
}
