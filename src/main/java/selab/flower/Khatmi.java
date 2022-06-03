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

    private Khatmi(Khatmi target) {
        super();
        this.publicVar1 = target.publicVar1;
        this.privateVar1 = target.privateVar1;
    }

    public Cloneaable clone() {
        return new Khatmi(this);
    }

    public int getPrivateVar() {
        return this.privateVar1;
    }
}
