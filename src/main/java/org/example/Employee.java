package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private int eID;
    private String eName;
    private long ePhone;

    public String getClause() {
        return eName;
    }

    public void seteName(String clause) {
        this.eName = clause;
    }

    public int geteID() {
        return eID;
    }

    public void seteID(int eID) {
        this.eID = eID;
    }

    public long getePhone() {
        return ePhone;
    }

    public void setePhone(long ePhone) {
        this.ePhone = ePhone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eID=" + eID +
                ", clause='" + eName + '\'' +
                ", ePhone=" + ePhone +
                '}';
    }
}



