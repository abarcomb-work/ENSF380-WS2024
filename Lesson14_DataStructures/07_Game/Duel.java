/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/

package edu.ucalgary.oop;

import java.util.*;

class Duel {
    private GameCharacter player1;
    private GameCharacter player2;
    private ArrayList<String> fightOutcomeLog = new ArrayList <String>();
    private boolean fightOutcomeDetermined = false;

    public Duel(GameCharacter one, GameCharacter two) {
        if (one.ATTACK_PRIORITY > two.ATTACK_PRIORITY) {
            this.player1 = one;
            this.player2 = two;
        } else {
            this.player2 = one;
            this.player1 = two;
        }
    }

    public ArrayList<String> getFightOutcomeLog() { return this.fightOutcomeLog; }
  
    public ArrayList<String> fightAndReturnLog() throws SingleUseMethodException {
        // The exact same duel cannot be fought more than once
        if (fightOutcomeDetermined == true) {
            throw new SingleUseMethodException();
        }    

        // Players make some statements
        fightOutcomeLog.add(this.player1.characterName + " says: " + this.player1.talk("Game on."));
        fightOutcomeLog.add(this.player2.characterName + " says: " + this.player2.talk("Let's go."));

        // Players fight to the death
        while( (player1.lifeforce > 0) && (player2.lifeforce > 0)) {
            this.fightRound();
        }

        return fightOutcomeLog;
    }

    private void fightRound() {
        String name1 = player1.characterName;
        String name2 = player2.characterName;

        // The fastest player attacks first. Build up output message,
        // do damage, and see how much lifeforce remains.
        fightOutcomeLog.add(player1.getAttackMessage());
        boolean playerIsAlive = attackOpponent(player1, player2);

        // Player 2 survived the attack and makes their own attack
        if (playerIsAlive == true) {
            fightOutcomeLog.add(player2.getAttackMessage());
            playerIsAlive = attackOpponent(player2, player1);
        }
    }

    // Returns true if the victim is alive, false if they are not
    private boolean attackOpponent(GameCharacter attacker, GameCharacter victim) {
        // Damage is a random amount between 1 and the maximum for the character
        Random damage = new Random();
        int damageCaused = damage.nextInt(attacker.ATTACK_DAMAGE) + 1;
        fightOutcomeLog.add(attacker.characterName + " does " + String.valueOf(damageCaused) + " damage.");

        // Damage is deducted from the victim's lifeforce
        victim.lifeforce = victim.lifeforce - damageCaused;

        if (victim.lifeforce <= 0) {
            fightOutcomeLog.add(victim.characterName + " has died!");
            fightOutcomeDetermined = true;
            return false;
        }

        fightOutcomeLog.add(victim.characterName + " has " + String.valueOf(victim.lifeforce) + " life remaining.");
        return true;
    }
}
