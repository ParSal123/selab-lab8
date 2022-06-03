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

    private JTree(JTree target) {
        super();
        this.publicVar4 = target.publicVar4;
        this.privateVar4 = target.privateVar4;
    }

    public Cloneaable clone() {
        return new JTree(this);
    }
}
