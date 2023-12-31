// Java 프로그래밍 - 입출력_1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void referInputStream() throws IOException {
//      System.in
        System.out.println("== System.in ==");
        System.out.print("입력 : ");
        int a = System.in.read() - '0'; // char 값을 받아오는 명령어
        System.out.println("a = " + a);
        System.in.read(new byte[System.in.available()]);
//      바로 위의 명령문을 입력하지 않으면 밑에 입력이 불가하다

//      InputStreamReader
        System.out.println("== InputStreamReader ==");
        InputStreamReader reader = new InputStreamReader(System.in);
        char[] c = new char[3];
        System.out.print("입력 : ");
        reader.read(c);
        System.out.println(c);


//      BufferedReader
        System.out.println("== BufferedReader ==");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("입력 : ");
        String s1 = br.readLine();
        System.out.println("s1 = " + s1);
    }

    public static void main(String[] args) throws IOException {

//      1. 입력
//      1-1. 다른 입력 방식 참고
//        referInputStream();

//      1-2. Scanner
        System.out.println("== Scanner ==");
        Scanner sc = new Scanner(System.in);
//        System.out.print("입력1 : ");
//        System.out.println(sc.next()); // 데이터 1개를 받아올수있음
//        sc.nextLine();

//        System.out.print("입력2 : ");
//        System.out.println(sc.nextInt());
//        sc.nextLine();

        // 가장 많이 쓰는 방식
//        System.out.print("입력3 : ");
//        System.out.println(sc.nextLine());


//      참고) 정수, 문자열 변환
        int num = Integer.parseInt("12345"); // 문자열을 숫자열로
        String str = Integer.toString(12345); // 숫자열을 문자열로
        
//      2. 출력
        System.out.println("== 출력 ==");
        System.out.println("Hello");
        System.out.println("World!");

        System.out.print("Hello ");
        System.out.print("World!");
        System.out.println();

        System.out.printf("Hello ");
        System.out.printf("World!");
        System.out.println();

        String s = "자바";
        int number = 3;

        System.out.println(s + "는 언어 선호도 " + number + "위 입니다.");
        System.out.printf("%s는 언어 선호도 %d위 입니다.\n", s, number);

        // 서식문자
        System.out.printf("%d\n", 10); // 정수형 %d \n은 줄바꿈
        System.out.printf("%o\n", 10); // 8진수 %o
        System.out.printf("%x\n", 10); // 16진수 %x

        System.out.printf("%f\n", 5.2f); // 실수형 %f

        System.out.printf("%c\n", 'A'); // 문자값 캐릭터 %c
        System.out.printf("%s\n", "안녕하세요"); // 문자열 %s

        System.out.printf("%5d\n", 123); // d앞에 5를 넣을경우 5글자에 맞춰 출력된다
        System.out.printf("%5d\n", 1234); //
        System.out.printf("%5d\n", 12345); //

        System.out.printf("%.2f\n", 1.12645123f);
        // f앞에 2를 넣을경우 소수점 2글자(반올림)까지만 출력

    }
}
