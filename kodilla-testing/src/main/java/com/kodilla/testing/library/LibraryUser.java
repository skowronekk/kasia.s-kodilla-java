package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {
    String firstname;
    String lastname;
    String peselId;

    public LibraryUser(String firstName, String lastName, String peselId) {
        this.firstname = firstName;
        this.lastname = lastName;
        this.peselId = peselId;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public String getPeselId() {
        return peselId;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "firstName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                ", peselId='" + peselId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryUser that = (LibraryUser) o;
        return Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastname, that.lastname) &&
                Objects.equals(peselId, that.peselId);
    }

    @Override
    public int hashCode() {

        int result = firstname.hashCode();
        result = 31 * result + lastname.hashCode();
        result = 31 * result + peselId.hashCode();
        return result;
    }
}
