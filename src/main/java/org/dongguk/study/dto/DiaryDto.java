package org.dongguk.study.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@RequiredArgsConstructor
public class DiaryDto {
    private Long id;
    private Timestamp created_date;
    private String name;
    private String title;
    private String content;
    private Boolean state;

//    @Builder
//    public DiaryDto(Long id, Timestamp created_date, String name, String title, String content, Boolean state) {
//        this.id = id;
//        this.created_date = created_date;
//        this.name = name;
//        this.title = title;
//        this.content = content;
//        this.state = state;
//    }
}
