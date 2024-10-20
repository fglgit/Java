package com.enum_.example3;

/**
 * @author LiGuofeng
 * @version 1.0
 */
public class Enum {
 public static void main(String[] args) {
  for(Week week :Week.values()){
   System.out.println(week.getDesc());
   System.out.println(week);
  }
 }
}
enum Week{
 Mon("星期一"),TUSE("星期二"),WED("星期三"),THUR("星期四"),FRI("星期五"),SAT("星期六"),SUN("星期天");

 private String desc;

 Week(String desc) {
  this.desc = desc;
 }

 public String getDesc() {
  return desc;
 }

 @Override
 public String toString() {
  return desc;
 }
}
