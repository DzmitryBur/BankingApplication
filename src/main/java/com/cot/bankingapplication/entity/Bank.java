package com.cot.bankingapplication.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "banks")
@Data
@EqualsAndHashCode(exclude = "accounts")
//@EqualsAndHashCode(exclude = "users")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "swift")
    private String swift;

    @OneToMany(mappedBy = "bank")
//    @OneToMany(mappedBy = "bank", fetch = FetchType.LAZY)
    private Set<Account> accounts = new HashSet<>();

//    @OneToMany(mappedBy = "bank")
//    private Set<User> users = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "accounts",
            joinColumns = @JoinColumn(name = "bank_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    @JsonIgnoreProperties("banks")
    private List<User> users;
}
