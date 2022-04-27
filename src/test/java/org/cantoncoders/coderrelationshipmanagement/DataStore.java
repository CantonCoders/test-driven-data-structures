package org.cantoncoders.coderrelationshipmanagement;

public class DataStore {
    public Coder getCoderByFirstName(String nick) {
        Coder nickTheCoder = new Coder();
        nickTheCoder.setFirstName("Nick");

        return nickTheCoder;
    }
}
