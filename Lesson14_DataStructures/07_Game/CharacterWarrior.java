/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/

package edu.ucalgary.oop;

public class CharacterWarrior extends GameCharacter {
    private String[] weapons = new String[2];

    public CharacterWarrior(String characterName, int attackPriority) throws IllegalArgumentException {
        super(characterName, "warrior", attackPriority, 20);
        this.weapons[0] = "sword";
    }

    public CharacterWarrior(String characterName, int attackPriority, String weapon) throws IllegalArgumentException {
        super(characterName, "warrior", attackPriority, 12);
        this.weapons[0] = "sword";
        this.weapons[1] = weapon;
    }

    public CharacterWarrior(String characterName, int attackPriority, String weapon1, String weapon2) throws IllegalArgumentException {
        super(characterName, "warrior", attackPriority, 12);
        this.weapons[0] = weapon1;
        this.weapons[1] = weapon2;
    }


    public String getWeapons() {
        String allWeapons = "";
        for (int i=0; i<weapons.length; i++) {
            if (weapons[i] == null) { break; }
            allWeapons = allWeapons + weapons[i] + " and ";
        }
        allWeapons = allWeapons.replaceAll(" and $", "");
        return allWeapons;
    }

    @Override
    public String talk(String message) {
       message = message.replaceAll("\\.", "!!!!!");
       return message.toUpperCase();
    }

    @Override
    public String getAttackMessage() {
       String returnMsg = this.getCharacterName() + " attacks with their " + this.getWeapons() + ".";
       return returnMsg;
    }
}

