package selab.flower;

import selab.clone.Cloneaable;

public class Khatmi implements Flower {
    public int publicVar1;
    private int privateVar1;

    public Khatmi(int publicVar, int privateVar) {
        this.publicVar1 = publicVar;
        this.privateVar1 = privateVar;
    }

    public Khatmi() {
    }

    public Cloneaable clone() {
        return null;
    }

    public int getPrivateVar() {
        return this.privateVar1;
    }
}
