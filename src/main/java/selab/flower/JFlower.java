package selab.flower;

import selab.clone.Cloneaable;

public class JFlower implements Flower {
    public int publicVar2;
    private int privateVar2;

    public JFlower(int publicVar, int privateVar) {
        this.publicVar2 = publicVar;
        this.privateVar2 = privateVar;
    }

    public JFlower() {
    }

    public Cloneaable clone() {
        return null;
    }

    public int getPrivateVar() {
        return this.privateVar2;
    }
}
