package miage.gqui.bowling;

public class Jeu {

    private Integer lancer1;
    private Integer lancer2;

    public Jeu(Integer lancer1, Integer lancer2) {
        this.lancer1 = lancer1;
        this.lancer2 = lancer2;
    }

    public Jeu(int lancer1) {
        this.lancer1 = lancer1;
    }

    public int nombreQuillesTombees() {
        return this.lancer1 + this.lancer2;
    }

    public boolean isSpare() {
        return lancer1 + lancer2 == 10 && !this.isStrike();
    }

    public boolean isStrike() {
        return lancer1 == 10;
    }

    public int nombreQuillesTombeesLancer1() {
        return lancer1;
    }

    public int nombreQuillesTombeesLancer2() {
        return lancer2;
    }
}
