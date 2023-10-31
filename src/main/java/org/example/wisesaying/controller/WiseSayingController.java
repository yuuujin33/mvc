package org.example.wisesaying.controller;

import org.example.wisesaying.entity.WiseSaying;
import org.example.wisesaying.service.WiseSayingService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseSayingController {
    Scanner sc;

    WiseSayingService wiseSayingService = new WiseSayingService();
    // sc 다 빨간줄
    public WiseSayingController (Scanner sc) {
        this.sc = sc;
    }

    public void write() {
        System.out.printf("명언:");
        String content = sc.nextLine();
        System.out.printf("작가:");
        String author = sc.nextLine();

        long id = wiseSayingService.create(content, author);
        System.out.println(id + "번 명언이 등록되었습니다.");
    }

    public void list() {
        List<WiseSaying> wiseSayingList = wiseSayingService.list();
        System.out.println("번호 / 작가 / 명언");
        for (WiseSaying wiseSaying : wiseSayingList) {
            System.out.printf("%d, %s, %s \n", wiseSaying.getId(), wiseSaying.getAuthor(), wiseSaying.getContent());
        }
    }

    public void remove() {
        System.out.println("삭제 번호 :");
        long removeId = sc.nextLong();
        sc.nextLine();

        WiseSaying wiseSaying = wiseSayingService.wiseSayingFindById(removeId);
        wiseSayingService.remove(wiseSaying);
        System.out.println(removeId + "번 명언이 삭제 되었습니다.");
    }

    public void modify() {
        System.out.printf("수정 번호 :");
        long modifyId = sc.nextLong();
        sc.nextLine();
        WiseSaying wiseSaying = wiseSayingService.wiseSayingFindById(modifyId);

        System.out.printf("기존 명언 : %s\n", wiseSaying.getContent());
        String content = sc.nextLine();
        wiseSaying.setContent(content);
        System.out.printf("기존 작가 : %s\n", wiseSaying.getAuthor());
        String author = sc.nextLine();
        wiseSaying.setAuthor(author);

        wiseSayingService.modify(wiseSaying, content, author);
        System.out.println(modifyId + "번 명언이 수정되었습니다.");
    }
}