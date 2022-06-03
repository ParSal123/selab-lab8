package selab;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import selab.tree.JTree;
import selab.tree.Tree;

public class PrototypeTest {
    
    @Test
    void JTree_Clone_Should_Create_a_Different_JTree_Object() {
        JTree jTree = new JTree();
        JTree jTree2 = (JTree) jTree.clone();
        assertTrue(jTree != jTree2);
    }

    @Test
    void JTree_Clone_Should_Copy_Private_and_Public_Variables() {
        JTree jTree = new JTree(2, 3);
        JTree jTree2 = (JTree) jTree.clone();
        assertTrue(jTree.publicVar4 == jTree2.publicVar4 && jTree.getPrivateVar() == jTree2.getPrivateVar());
    }

}
