package selab.tree;

import selab.clone.Cloneaable;

public class JTree implements Tree {
    private int privateVar4;
    public int publicVar4;
    public JTree(int publicVar, int privateVar) {
        this.privateVar4 = privateVar;
        this.publicVar4 = publicVar;
    }

    public int getPrivateVar() {
        return this.privateVar4;
    }

    public JTree() {
    }

    public Cloneaable clone() {
        return null;
    }
}
