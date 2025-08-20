package org.example;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "department")
public class Department {

    @Id
    private int dtId;

    private String dName;

    @ManyToMany(mappedBy = "department")
    private List<Employee> emp;

    // getters and setters
    public int getDtId() { return dtId; }
    public void setDtId(int dtId) { this.dtId = dtId; }

    public String getdName() { return dName; }
    public void setdName(String dName) { this.dName = dName; }

    public List<Employee> getEmp() { return emp; }
    public void setEmp(List<Employee> emp) { this.emp = emp; }
}


//package org.example;
//
//import jakarta.persistence.*;
//
//import java.util.List;
//
//@Entity
//@Table(name = "department")
//public class Department {
//
//    @Id
//    private int dtId;
//
//    private String dName;
//
//    // Many departments can belong to one Employee
//    //@ManyToOne
//    @ManyToMany(mappedBy = "department")
////    @JoinColumn(name = "emp_id") // foreign key in department table
//    private List<Employee> emp;
//
//    public int getDtId() {
//        return dtId;
//    }
//
//    public void setDtId(int dtId) {
//        this.dtId = dtId;
//    }
//
//    public String getdName() {
//        return dName;
//    }
//
//    public void setdName(String dName) {
//        this.dName = dName;
//    }
//
//    public List<Employee> getEmp() {
//        return emp;
//    }
//
//    public void setEmp(List<Employee> emp) {
//        this.emp = emp;
//    }
//}
//package org.example;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;
//
//@Entity
//public class Department {
//
//    @Id
//    private int dtId;
//    private String dName;
//
//    @ManyToOne
//    private Employee Emp;
//
//    public Employee getEmp() {
//        return Emp;
//    }
//
//    public void setEmp(Employee emp) {
//        Emp = emp;
//    }
//
//    public int getDtId() {
//        return dtId;
//    }
//
//    public void setDtId(int dtId) {
//        this.dtId = dtId;
//    }
//
//    public String getdName() {
//        return dName;
//    }
//
//    public void setdName(String dName) {
//        this.dName = dName;
//    }
//
//    @Override
//    public String toString() {
//        return "Department{" +
//                "dtId=" + dtId +
//                ", dName='" + dName + '\'' +
//                '}';
//    }
//}
