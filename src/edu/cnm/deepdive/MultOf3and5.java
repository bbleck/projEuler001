package edu.cnm.deepdive;

public class MultOf3and5 {


  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i < 100; i++) {
      if(i%3==0 ||i%5==0){
        System.out.println(i);
        sum+=i;
      }
    }
    System.out.println(sum);
  }

}