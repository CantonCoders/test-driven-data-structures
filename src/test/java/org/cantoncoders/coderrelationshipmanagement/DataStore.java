package org.cantoncoders.coderrelationshipmanagement;

public class DataStore {

    private Coder coder;
    public Coder getCoderByFirstName(String firstName) {
        return coder;
    }

    public void add(Coder coder) {
        this.coder = coder;
    }
}
