package org.example.wisesaying.service;

import org.example.wisesaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseSayingService {
    List<WiseSaying> wiseSayingList = new ArrayList<>();
    long lastid = 0;
// 왜 long타입일까..?
    public long create(long id, String content, String author) {
        lastid++;
        WiseSaying wiseSaying = new WiseSaying(id, content, author);
        wiseSayingList.add(wiseSaying);
        return id;
    }

    public List<WiseSaying> list() {
        return this.list();
    }

    public void remove(WiseSaying wiseSaying) {
        this.wiseSayingList.remove(wiseSaying);
    }

    public void modify(WiseSaying wiseSaying, String content, String author) {
        wiseSaying.setContent(content);
        wiseSaying.setAuthor(author);
    }
    public WiseSaying wiseSayingFindById (long id) {
        for (WiseSaying wiseSaying : wiseSayingList) {
            if (wiseSaying.getId() == id) {
                return wiseSaying;
            }
        }
        return null;
    }
}