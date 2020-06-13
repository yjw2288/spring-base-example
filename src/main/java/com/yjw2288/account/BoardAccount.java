package com.yjw2288.account;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "board_account")
@Getter
@Setter
public class BoardAccount {
    @Id
    @Column(name = "board_account_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long boardAccountId;

    @Column(name = "name")
    private String name;
}
