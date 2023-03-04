package jp.co.axa.apidemo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Entity
@Table(name="EMPLOYEE")
public class Employee {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column(name="EMPLOYEE_NAME")
    @Size(max = 40, message = "Employee name cannot exceed 40 characters")
    @NotEmpty(message = "Employee name cannot be empty")
    private String name;

    @Getter
    @Setter
    @Column(name="EMPLOYEE_SALARY")
    @Positive(message = "Salary cannot be Negative")
    private Integer salary;

    @Getter
    @Setter
    @Column(name="DEPARTMENT")
    @Size(max = 40, message = "Department name cannot exceed 40 characters.")
    @NotEmpty(message = "Department name cannot be empty.")
    private String department;

}
