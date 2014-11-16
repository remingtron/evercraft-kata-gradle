package org.evercraft

import org.junit.Test

class PlayerCharacterTest {
    @Test
    public void itHasAName() {
        def character = new PlayerCharacter("arya")
        assert character.name == "arya"
    }
}