package miage.gqui.bowling;

import java.util.ArrayList;
import java.util.List;

public class Partie {

    private List<Jeu> jeux;

    public Partie(Jeu leJeu) {
        jeux = new ArrayList<Jeu>();
        for (int i = 0; i < 10; i++){
            jeux.add(leJeu);
        }
        if(leJeu.isSpare() || leJeu.isStrike()){
            jeux.add(leJeu);
        }
        if(leJeu.isStrike()){
            jeux.add(leJeu);
        }
    }

    public int calculeScore() {
        int score = 0;

        for(int i = 0; i < 10 ; i++) {
            Jeu jeuCourant = jeux.get(i);
            score += jeuCourant.nombreQuillesTombees();
            if(jeuCourant.isSpare()) {
                score += jeux.get(i+1).nombreQuillesTombeesLancer1();
            }else if(jeuCourant.isStrike()){
                score += jeux.get(i+1).nombreQuillesTombeesLancer1();
                if(jeux.get(i+1).nombreQuillesTombeesLancer2() != null) {
                    score += jeux.get(i+1).nombreQuillesTombeesLancer2();
                } else {
                    score += jeux.get(i+1).nombreQuillesTombeesLancer1();
                }
            }
        }

        return score;
    }

}
