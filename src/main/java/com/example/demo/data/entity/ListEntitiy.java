package com.example.demo.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name= "LIST")
public class ListEntitiy {
    @Id
    @Column(name="contentKey")
    int contentKey;
    @Column(name="content")
    String content;
}
