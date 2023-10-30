package org.example.wisesaying.service;

import org.example.wisesaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseSayingService {
    List<WiseSaying> wiseSayingList = new ArrayList<>();
    long lastid = 0;

    public long create(long id, String content, String author) {
        lastid++;
        WiseSaying wiseSaying = new WiseSaying(id, content, author);
        wiseSayingList.add(wiseSaying);
        return id;
    }

    public List<WiseSaying> list() {
        for (WiseSaying wiseSaying : wiseSayingList) {
            System.out.printf("%d / %s / %s\n", wiseSaying.getId(), wiseSaying.getContent(), wiseSaying.getAuthor());
        }
        return this.wiseSayingList;
    }

    public void remove(WiseSaying wiseSaying) {
        this.wiseSayingList.remove(wiseSaying);
    }

    public void modify(WiseSaying wiseSaying, String content, String author) {
        wiseSaying.setContent(content);
        wiseSaying.setAuthor(author);
    }
    public WiseSaying wiseSayingFindById {
        for (WiseSaying wiseSaying : wiseSayingList) {
            if (wiseSaying.getId() == id) {
                return wiseSaying;
            }
        }
    }
}