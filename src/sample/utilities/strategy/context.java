package sample.utilities.strategy;

import sample.entities.joueur;

public class context {
        private strategie strategy;

        public context(strategie strategy){
            this.strategy = strategy;
        }

        public void executeStrategy(joueur joueur) throws Exception {
            strategy.play(joueur);
        }

}
