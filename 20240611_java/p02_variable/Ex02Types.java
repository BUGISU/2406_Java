package p02_variable;

import p01_class.Animal;

import java.util.Locale;

public class Ex02Types {
  boolean power;
  char c1;
  byte b1;
  short s1;
  int i1;
  long l1;
  float f1;
  double d1;
  String str = "Hello";
  Animal animal = new Animal();
  public static void main(String[] args) {
    //변수의 종류: Primitive - 일반 변수, Reference - 참조 변수
    //Primitive type ( 일반 변수는 실제 값을 가짐 )
    //boolean power = true; //논리형 true, false 1byte(8bit)
    //char c1 = 'A';  // 문자형, 2byte, 0 ~ 65535 ->Char는 오로지 한글자만 입력가능
    //byte b1 = 10; // 정수형 , 1byte, -128~127
    //short s1 = 10; //정수형,2byte,-32768~32767
    //int i1 =10; //정수형,4byte,-2147483648~2147483647
    //long l1 = 10L; //정수형,8byte,-61경~
    //float f1 = 0.1f; //실수형,4byte,소수점 7째 자리까지,표현 범위 : 10^-45~10^38
    //double d1 = 0.1d; //실수형,8byte,소수점 13째 자리까지, 표현 범위 : 10^-324~10^308

    //Reference type(참조형 변수, 주소값을 가짐)
    String str = "Hello";
    System.out.println(str);
    Animal animal = new Animal();
    System.out.println(animal);

    /*----------------------------------------------------------------------------*/
    Ex02Types ex2 = new Ex02Types();
    System.out.println(ex2.power);
    System.out.println(ex2.c1);
    System.out.println(ex2.b1);
    System.out.println(ex2.s1);
    System.out.println(ex2.i1);
    System.out.println(ex2.l1);
    System.out.println(ex2.f1);
    System.out.println(ex2.d1);
    System.out.println(ex2.str);
    System.out.println(ex2.animal);
  }

}
