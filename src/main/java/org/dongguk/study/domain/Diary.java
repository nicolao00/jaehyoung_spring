package org.dongguk.study.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;


import java.sql.Timestamp;


@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "diary")
@DynamicUpdate
@Builder
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "created_date")
    private Timestamp createdDate;
    @Column(name = "name")
    private String name;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;
    @Column(name = "state")
    private Boolean state;

//    @Builder
//    public Diary(Timestamp createdDate, String name, String title, String content, Boolean state){
//        this.createdDate = createdDate;
//        this.name = name;
//        this.title = title;
//        this.content = content;
//        this.state = state;
//    }
}
