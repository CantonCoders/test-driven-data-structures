package org.cantoncoders.coderrelationshipmanagement;

import java.util.Objects;

public class Coder {
    private String firstName;
    private String email;



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coder)) return false;
        Coder coder = (Coder) o;
        return Objects.equals(firstName, coder.firstName) && Objects.equals(email, coder.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, email);
    }
}
