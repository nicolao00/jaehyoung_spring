package org.dongguk.study.repository;

import org.dongguk.study.domain.Diary;
import org.dongguk.study.dto.DiaryDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Long> {
    public DiaryDto createDiary(Long id, String name, String title, String content, Boolean state);
    public DiaryDto readDiary(Long id);
    public DiaryDto updateDiary(Long id, String name, String title, String content);
    public Boolean deleteDiary(Long id);
}
