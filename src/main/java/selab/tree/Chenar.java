package selab.tree;

import selab.clone.Cloneaable;

public class Chenar implements Tree {
    public int publicVar3;
    private int privateVar3;

    public Chenar(int publicVar, int privateVar) {
        this.privateVar3 = privateVar;
        this.publicVar3 = publicVar;
    }

    public Chenar() {
    }

    public Cloneaable clone() {
        return null;
    }

    public int getPrivateVar() {
        return this.privateVar3;
    }
}
