package org.evercraft

enum Alignment {
    GOOD,
    EVIL,
    NEUTRAL
}

class PlayerCharacter {

    String name
    Alignment alignment
    int armorClass = 10
    int hitPoints = 5

    def PlayerCharacter(String name, Alignment alignment = Alignment.GOOD) {
        this.name = name
        this.alignment = alignment
    }
}
