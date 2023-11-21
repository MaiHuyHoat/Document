package com.ead.app.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;


import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Candidate")
@Entity
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
    @Column(name = "avatar", columnDefinition = "text")

    protected String avatar;
    @Column(name = "name")
    @Size(max = 100, message = "Tên không được dài quá 100 ký tự ")
    @Size(min = 5, message = "Tên không được ngắn dưới 5 ký tự ")
    protected String name;
    @Column(name="genger")
    protected boolean gender;
    @Column(name = "address")


    protected String address;
    @Column(name = "phone")
    @Pattern(regexp = "^0\\d{1,11}$", message = "Số điện thoại phải bắt đầu bằng số 0 và không dài quá 12 ký tự")
    @Size(max = 12, message = "Số điện thoại không được dài quá 12 ký tự")
    protected String phone;
    @Column(name = "dateofbirth")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    protected Date dateofbirth;
    @Column(name = "academylevel")
    protected String academylevel;


}
