package com.enum_.example2;

/**
 * @author LiGuofeng
 * @version 1.0
 */
public class Enum {
 public static void main(String[] args) {
  System.out.println(Season1.SPRING);
  Season1 s1=Season1.SPRING;
  Season1 s2=Season1.SPRING;
  System.out.println(s1.toString());
  System.out.println(s1==s2);
  //Enum
  //Enum
  System.out.println(s1.name());
  System.out.println(s1.ordinal());
  for(Season1 season: Season1.values()){
   System.out.print(season+" ");
  }
  Season1 s3=Season1.valueOf("SUMMER");
  System.out.println(s3);
  System.out.println(s3.compareTo(s1));
 }
}
enum Season1{
 SPRING("春天","温暖"), WINTER("冬天","寒冷"),AUTUMN,SUMMER;
 private String name;
 private String desc;

 private Season1(String name, String desc) {
  this.name = name;
  this.desc = desc;
 }
 private Season1() {
 }

}