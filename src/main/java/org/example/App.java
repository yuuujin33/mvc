package org.example;

import org.example.controller.WiseSayingController;

import java.util.Scanner;

public class App {
    Scanner sc = new Scanner(System.in);
    WiseSayingController wiseSayingController = new WiseSayingController();
    void run () {
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.printf("명령어 :");
            String command = sc.nextLine();
            if (command.equals("종료")) {
                break;
            } else if (command.equals("등록")) {
                WiseSayingController.write();
            } else if (command.equals("목록")) {
                WiseSayingController.list();
            } else if (command.equals("삭제")) {
                WiseSayingController.remove();
            } else if (command.equals("수정")) {
                WiseSayingController.modify();
            }
        }
        sc.close();
    }
}
