package org.cantoncoders.coderrelationshipmanagement;

public class DataStore {

    private Coder[] coders = new Coder[2];
    private int nextCoderIndex = 0;
    public Coder getCoderByFirstName(String firstName) {
        for(int currentIndexOfCoder = 0; currentIndexOfCoder < coders.length; currentIndexOfCoder++){
            if(coders[currentIndexOfCoder].getFirstName().equals(firstName)){
                return coders[currentIndexOfCoder];
            }
        }

        return coders[0];
    }

    public void add(Coder coder) {
        this.coders[nextCoderIndex] = coder;
        nextCoderIndex++;
    }
}
