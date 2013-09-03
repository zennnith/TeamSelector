/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cricket.teamselector.components;

import org.jgap.BaseChromosome;
import org.jgap.Chromosome;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.IChromosome;
import org.jgap.IGeneConstraintChecker;
import org.jgap.InvalidConfigurationException;

/**
 *
 * @author ZenitH
 */
public class Team extends BaseChromosome{

    public Team(Configuration a_configuration) throws InvalidConfigurationException {
        super(a_configuration);
    
    }

    @Override
    public Object clone() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setFitnessValue(double d) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setFitnessValueDirectly(double d) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getFitnessValue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getFitnessValueDirectly() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setIsSelectedForNextGeneration(boolean bln) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isSelectedForNextGeneration() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setConstraintChecker(IGeneConstraintChecker igcc) throws InvalidConfigurationException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setApplicationData(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object getApplicationData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void cleanup() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isHandlerFor(Object o, Class type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object perform(Object o, Class type, Object o1) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
