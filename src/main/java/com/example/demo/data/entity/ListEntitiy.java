package com.example.demo.data.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name= "LIST")
public class ListEntitiy {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "CONTENT_KEY")
    int contentKey;
    @Column(name="CONTENT")
    String content;
}
