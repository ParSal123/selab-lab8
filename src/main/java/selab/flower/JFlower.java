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
    
    private JFlower(JFlower target) {
        super();
        this.publicVar2 = target.publicVar2;
        this.privateVar2 = target.privateVar2;
    }

    public Cloneaable clone() {
        return new JFlower(this);
    }

    public int getPrivateVar() {
        return this.privateVar2;
    }
}
