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

    private Chenar(Chenar target) {
        super();
        this.publicVar3 = target.publicVar3;
        this.privateVar3 = target.privateVar3;
    }

    public Cloneaable clone() {
        return new Chenar(this);
    }

    public int getPrivateVar() {
        return this.privateVar3;
    }
}
