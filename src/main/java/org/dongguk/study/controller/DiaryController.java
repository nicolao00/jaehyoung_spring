package org.dongguk.study.controller;

import lombok.RequiredArgsConstructor;
import org.dongguk.study.dto.DiaryDto;
import org.dongguk.study.service.DiaryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class DiaryController {
    private final DiaryService diaryService;

    @PostMapping("/diary")
    public DiaryDto createDiary() {
        return diaryService.createDiary(1L, "nameTest", "titleTest", "contentTest", Boolean.TRUE);
    }
    @GetMapping("/diary")
    public DiaryDto readDiary() {
        return diaryService.readDiary(1L);
    }

    @PutMapping("/diary")
    public DiaryDto updateDiary() {
        return diaryService.updateDiary(1L, "nameTest", "titleTest", "contentTest");
    }

    @DeleteMapping("/diary")
    public Boolean deleteDiary() {
        return diaryService.deleteDiary(1L);
    }
}
