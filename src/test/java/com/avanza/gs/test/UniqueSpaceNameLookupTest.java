package com.avanza.gs.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueSpaceNameLookupTest {

    @Test
    public void verifyNameGeneration() {
        assertEquals("apa-1", UniqueSpaceNameLookup.getSpaceNameWithSequence("apa"));
        assertEquals("apa-2", UniqueSpaceNameLookup.getSpaceNameWithSequence("apa"));
    }

}
