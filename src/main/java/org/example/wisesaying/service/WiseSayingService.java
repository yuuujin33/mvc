package org.example.wisesaying.service;

import org.example.wisesaying.entity.WiseSaying;
import org.example.wisesaying.repository.WiseSayingRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseSayingService {
    WiseSayingRepository wiseSayingRepository = new WiseSayingRepository();

    public long create(String content, String author) {
        return wiseSayingRepository.create(content, author);
    }

    public List<WiseSaying> list() {
        return this.wiseSayingRepository.list();
    }

    public void remove(WiseSaying wiseSaying) {
        this.wiseSayingRepository.remove(wiseSaying);
    }

    public void modify(WiseSaying wiseSaying, String content, String author) {
       this.wiseSayingRepository.modify(wiseSaying, content, author);
    }
    public WiseSaying wiseSayingFindById (long id) {
        return this.wiseSayingRepository.wiseSayingFindById(id);
    }
}