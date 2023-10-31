package org.example.wisesaying.repository;

import org.example.wisesaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;

public class WiseSayingRepository {
    List<WiseSaying> wiseSayingList = new ArrayList<>();
    long lastid = 0;
    public long create(String content, String author) {
        long id = lastid + 1;
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
