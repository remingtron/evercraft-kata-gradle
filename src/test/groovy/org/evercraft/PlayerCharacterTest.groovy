package org.evercraft

import org.junit.Before
import org.junit.Test

class PlayerCharacterTest {

    def arbitraryCharacter;

    @Before
    public void setup() {
        arbitraryCharacter = new PlayerCharacter("bozo")
    }

    @Test
    public void itHasAName() {
        def character = new PlayerCharacter("arya")
        assert character.name == "arya"
    }

    @Test
    public void itHasDefaultAlignmentOfGood() {
        def character = new PlayerCharacter("foo")
        assert character.alignment == Alignment.GOOD
    }

    @Test
    public void itCanHaveEvilAlignment() {
        def character = new PlayerCharacter("randomName", Alignment.EVIL)
        assert character.alignment == Alignment.EVIL
    }

    @Test
    public void itCanHaveNeutralAlignment() {
        def character = new PlayerCharacter("randomName", Alignment.NEUTRAL)
        assert character.alignment == Alignment.NEUTRAL
    }

    @Test
    public void itHasDefaultArmorClassOfTen() {
        assert arbitraryCharacter.armorClass == 10
    }

    @Test
    public void itHasFiveHitPointsByDefault() {
        assert arbitraryCharacter.hitPoints == 5
    }
}