package org.dongguk.study.service;

import lombok.RequiredArgsConstructor;
import org.dongguk.study.domain.Diary;
import org.dongguk.study.dto.DiaryDto;
import org.dongguk.study.repository.DiaryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DiaryService {
    private final DiaryRepository diaryRepository;
    public DiaryDto createDiary(Long id, String name, String title, String content, Boolean state) {
        Diary diary = Diary.builder()
                .id(id)
                .name(name)
                .title(title)
                .content(content)
                .state(state)
                .build();
        diaryRepository.save(diary);
        return DiaryDto.builder()
                .id(id)
                .name(name)
                .title(title)
                .content(content)
                .state(state)
                .build();
    }

    public DiaryDto readDiary(Long id) {
        Diary diary = diaryRepository.findById(id).orElseThrow(() -> new RuntimeException("The diary with id " + id + " is not found"));
        return DiaryDto.builder()
                .id(diary.getId())
                .name(diary.getName())
                .title(diary.getTitle())
                .content(diary.getContent())
                .state(diary.getState())
                .build();
    }

    @Transactional
    public DiaryDto updateDiary(Long id, String name, String title, String content) {
        Diary diary = diaryRepository.findById(id).orElseThrow(() -> new RuntimeException("The diary with id " + id + " is not found"));
        if (diary.getName() == name) diary.setName(name);
        if (diary.getTitle() == title) diary.setTitle(title);
        if (diary.getContent() == content) diary.setContent(content);
        return DiaryDto.builder()
                .id(id)
                .name(name)
                .title(title)
                .content(content)
                .state(Boolean.TRUE)
                .build();
    }

    @Transactional
    public Boolean deleteDiary(Long id) {
        Diary user = diaryRepository.findById(id).orElseThrow(() -> new RuntimeException("The diary with id " + id + " is not found"));
        user.setState(Boolean.TRUE);
        return Boolean.TRUE;
    }
}
