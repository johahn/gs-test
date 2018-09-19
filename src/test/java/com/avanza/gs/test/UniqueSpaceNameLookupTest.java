package com.avanza.gs.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueSpaceNameLookupTest {

    @Test
    public void verifySequenceGeneration() {
        assertEquals("test-1", UniqueSpaceNameLookup.getSpaceNameWithSequence("test"));
        assertEquals("test-2", UniqueSpaceNameLookup.getSpaceNameWithSequence("test"));
        assertEquals("testa-1", UniqueSpaceNameLookup.getSpaceNameWithSequence("testa"));
    }
}