package org.example.controller;

import org.example.WiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseSayingController {
    static List<WiseSaying> wiseSayingList = new ArrayList<>();
    static long id = 1;

    public void write() {
        System.out.printf("명언:");
        Scanner sc;
        String content = sc.nextLine();
        System.out.printf("작가");
        String author = sc.nextLine();

        WiseSaying wiseSaying = new WiseSaying(id, content, author);
        wiseSayingList.add(wiseSaying);
        System.out.printf(id + "번 명언이 등록되었습니다.\n");
        id++;
    }

    public void list() {
        System.out.printf("번호 / 명언 / 작가\n");
        for (WiseSaying wiseSaying : wiseSayingList) {
            System.out.printf("%d / %s / %S\n", wiseSaying.getId(), wiseSaying.getContent(), wiseSaying.getAuthor());
        }
    }

    public void remove() {
        System.out.println("삭제 번호 :");
        long removeId = sc.nextLong();
        sc.nextLine();
        for (WiseSaying wiseSaying : wiseSayingList) {
            if (wiseSaying.getId() == removeId) {
                wiseSayingList.remove(wiseSaying);
            }
        }
        System.out.println(removeId + "번 명언이 삭제 되었습니다.");
    }

    public void modify() {
        System.out.printf("수정 번호 :");
        long modifyId = sc.nextLong();
        sc.nextLine();
        for (WiseSaying wiseSaying : wiseSayingList) {
            if (wiseSaying.getId() == modifyId) {
                System.out.printf("기존 명언 : %s\n", wiseSaying.getContent());
                String content = sc.nextLine();
                wiseSaying.setContent(content);
                System.out.printf("기존 작가 : %s\n", wiseSaying.getAuthor());
                String author = sc.nextLine();
                wiseSaying.setAuthor(author);
            }
        }
        System.out.println(modifyId + "번 명언이 수정되었습니다.");
    }
}
