package net.incuventure.training.domain;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue
    @Column(name="employee_id", length=50)
    private Integer employeeId;

    @Column(name="firstname")
    String firstName;

    @Column(name="lastname")
    String lastName;

    public Employee(String firstname, String lastname) {

        this.firstName = firstname;
        this.lastName = lastname;

    }
}
