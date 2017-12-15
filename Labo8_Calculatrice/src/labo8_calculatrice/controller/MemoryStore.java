/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo8_calculatrice.controller;

import labo8_calculatrice.model.State;

/**
 *
 * @author James
 */
public class MemoryStore extends Operator{
    public MemoryStore(State state){
        super(state);
    }
    public void execute() {
        state.memorySave();
    }
    
    public String help() {
        return "Remplace la memoire par la current value";
    }
}
