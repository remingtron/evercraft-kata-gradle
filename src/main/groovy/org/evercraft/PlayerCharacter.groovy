package org.evercraft

enum Alignment {
    GOOD,
    EVIL,
    NEUTRAL
}

class PlayerCharacter {

    private static final int CRITICAL_HIT = 20
    private static final int CRITICAL_HIT_DAMAGE_MULTIPLIER = 2

    final String name
    final Alignment alignment
    int armorClass = 10
    int hitPoints = 5

    def PlayerCharacter(String name, Alignment alignment = Alignment.GOOD) {
        this.name = name
        this.alignment = alignment
    }

    def attack(PlayerCharacter opponent, int roll) {
        def damageMultiplier = roll == CRITICAL_HIT ? CRITICAL_HIT_DAMAGE_MULTIPLIER : 1
        if (roll >= opponent.armorClass) {opponent.hitPoints -= damageMultiplier}
    }

    def isAlive() {
        hitPoints > 0
    }
}
