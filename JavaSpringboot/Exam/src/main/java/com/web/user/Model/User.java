package com.web.user.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private  long id;
    @Column(name="name")
    private  String name;
    @Column(name="age")
    private  Integer age;
    @Column(name="salary")
    private  double  salary;
}
