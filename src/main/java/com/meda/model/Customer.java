package com.meda.model;

import java.util.Objects;

public class Customer {

    private String firstName;
    private String lastName;

    private Customer() {

    }

    private Customer(Builder builder) {
        this.firstName = Objects.requireNonNull(builder.firstName, "firstname");
        this.lastName = Objects.requireNonNull(builder.lastName, "lastName");

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }



    @Override
    public String toString() {
        return "Customer [firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String firstName;
        private String lastName;

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

}
