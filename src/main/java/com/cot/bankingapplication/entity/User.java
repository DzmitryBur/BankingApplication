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

@Entity(name = "users")
@Data
@EqualsAndHashCode(exclude = "accounts")
//@EqualsAndHashCode(exclude = "banks")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "industry")
    private String industry;

    @Column(name = "residency")
    private String residency;

    @OneToMany(mappedBy = "user")
    private Set<Account> accounts = new HashSet<>();

//    @OneToMany(mappedBy = "user")
//    private Set<Bank> banks = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "accounts",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "bank_id"))
    @JsonIgnoreProperties("users")
    private List<Bank> banks;

//    @ManyToMany
//    @JoinTable(name = "l_author_book",
//            joinColumns = @JoinColumn(name = "author_id"),
//            inverseJoinColumns = @JoinColumn(name = "book_id"))
//    @JsonIgnoreProperties("authors")
//    private List<Book> books;
}
