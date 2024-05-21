package com.example.financebackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account_records")
public class AccountRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "account_type")
    private int accountType;

    @Column(name = "date")
    private Date date;

    @Column(name = "value")
    private float value;

    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "category_type")
    private int categoryType;

    @Column(name = "comments")
    private String comments;
}
