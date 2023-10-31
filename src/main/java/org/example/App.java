package org.example;

import org.example.wisesaying.controller.WiseSayingController;

import java.util.Scanner;

public class App {
    Scanner sc = new Scanner(System.in);

    void run() {
        System.out.println("== 명언 앱 ==");
        WiseSayingController wiseSayingController = new WiseSayingController(sc);
        while (true) {
            System.out.printf("명령어 :");
            String command = sc.nextLine();
            if (command.equals("종료")) {
                break;
//                write, list, remove, modify 빨간줄
            } else if (command.equals("등록")) {
                wiseSayingController.write();
            } else if (command.equals("목록")) {
                wiseSayingController.list();
            } else if (command.equals("삭제")) {
                wiseSayingController.remove();
            } else if (command.equals("수정")) {
                wiseSayingController.modify();
            }
        }
        sc.close();
    }
}
