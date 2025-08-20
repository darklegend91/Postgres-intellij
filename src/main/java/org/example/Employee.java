package org.example;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    private int eID;

    private String eName;

    private long ePhone;

    @ManyToMany
    @JoinTable(
            name = "employee_department",   // ✅ force join table name
            joinColumns = @JoinColumn(name = "emp_eID"),             // FK column for Employee
            inverseJoinColumns = @JoinColumn(name = "department_dtId") // FK column for Department
    )
    private List<Department> department;

    // getters and setters
    public int geteID() { return eID; }
    public void seteID(int eID) { this.eID = eID; }

    public String geteName() { return eName; }
    public void seteName(String eName) { this.eName = eName; }

    public long getePhone() { return ePhone; }
    public void setePhone(long ePhone) { this.ePhone = ePhone; }

    public List<Department> getDepartment() { return department; }
    public void setDepartment(List<Department> department) { this.department = department; }
}


//package org.example;
//
//import jakarta.persistence.*;
//import java.util.List;
//
//@Entity
//@Table(name = "employee")
//public class Employee {
//
//    @Id
//    private int eID;
//
//    private String eName;
//
//    private long ePhone;
//
////    @OneToMany(mappedBy = "emp", cascade = CascadeType.ALL, orphanRemoval = true)
//    @ManyToMany(mappedBy = "emp", cascade = CascadeType.ALL)
//    private List<Department> department;
//
//    public int geteID() {
//        return eID;
//    }
//
//    public void seteID(int eID) {
//        this.eID = eID;
//    }
//
//    public String geteName() {
//        return eName;
//    }
//
//    public void seteName(String eName) {
//        this.eName = eName;
//    }
//
//    public long getePhone() {
//        return ePhone;
//    }
//
//    public void setePhone(long ePhone) {
//        this.ePhone = ePhone;
//    }
//
//    public List<Department> getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(List<Department> department) {
//        this.department = department;
//    }
//}
