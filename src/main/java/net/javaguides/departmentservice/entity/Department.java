package net.javaguides.departmentservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String departmentName;
    private String departmentDescription;
    private String departmentCode;
}
