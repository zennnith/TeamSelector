/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cricket.teamselector.components;

import org.jgap.BaseGene;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.InvalidConfigurationException;
import org.jgap.RandomGenerator;
import org.jgap.UnsupportedRepresentationException;

/**
 *
 * @author ZenitH
 */
public class Player extends BaseGene{
    
    private String playerID;

    public Player(Configuration a_configuration) throws InvalidConfigurationException {
        super(a_configuration);
    }

    @Override
    protected Object getInternalValue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected Gene newGeneInternal() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setAllele(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getPersistentRepresentation() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setValueFromPersistentRepresentation(String string) throws UnsupportedOperationException, UnsupportedRepresentationException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setToRandomValue(RandomGenerator rg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void applyMutation(int i, double d) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void cleanup() {
        super.cleanup();
        this.playerID = null;
    }
    
    
    
}
