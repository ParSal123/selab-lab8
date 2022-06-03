package selab;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import selab.flower.JFlower;
import selab.flower.Khatmi;
import selab.tree.Chenar;
import selab.tree.JTree;

public class PrototypeTest {

    @Test
    public void JTree_Clone_Should_Create_a_Different_JTree_Object() {
        JTree jTree = new JTree();
        JTree jTree2 = (JTree) jTree.clone();
        assertTrue(jTree != jTree2);
    }

    @Test
    public void JTree_Clone_Should_Copy_Private_and_Public_Variables() {
        JTree jTree = new JTree(2, 3);
        JTree jTree2 = (JTree) jTree.clone();
        assertTrue(jTree.publicVar4 == jTree2.publicVar4 && jTree.getPrivateVar() == jTree2.getPrivateVar());
    }

    @Test
    public void Chenar_Clone_Should_Create_a_Different_Chenar_Object() {
        Chenar chenar = new Chenar();
        Chenar chenar2 = (Chenar) chenar.clone();
        assertTrue(chenar != chenar2);
    }

    @Test
    public void Chenar_Clone_Should_Copy_Private_and_Public_Variables() {
        Chenar chenar = new Chenar(2, 3);
        Chenar chenar2 = (Chenar) chenar.clone();
        assertTrue(chenar.publicVar3 == chenar2.publicVar3 && chenar.getPrivateVar() == chenar2.getPrivateVar());
    }

    @Test
    public void JFlower_Clone_Should_Create_a_Different_JFlower_Object() {
        JFlower jFlower = new JFlower();
        JFlower jFlower2 = (JFlower) jFlower.clone();
        assertTrue(jFlower != jFlower2);
    }

    @Test
    public void JFlower_Clone_Should_Copy_Private_and_Public_Variables() {
        JFlower jFlower = new JFlower(2, 3);
        JFlower jFlower2 = (JFlower) jFlower.clone();
        assertTrue(jFlower.publicVar2 == jFlower2.publicVar2 && jFlower.getPrivateVar() == jFlower2.getPrivateVar());
    }

    @Test
    public void Khatmi_Clone_Should_Create_a_Different_Khatmi_Object() {
        Khatmi khatmi = new Khatmi();
        Khatmi khatmi2 = (Khatmi) khatmi.clone();
        assertTrue(khatmi != khatmi2);
    }

    @Test
    public void Khatmi_Clone_Should_Copy_Private_and_Public_Variables() {
        Khatmi khatmi = new Khatmi(2, 3);
        Khatmi khatmi2 = (Khatmi) khatmi.clone();
        assertTrue(khatmi.publicVar1 == khatmi2.publicVar1 && khatmi.getPrivateVar() == khatmi2.getPrivateVar());
    }
}
