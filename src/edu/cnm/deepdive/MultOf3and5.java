package edu.cnm.deepdive;

public class MultOf3and5 {

  static final int ATHOUSAND = 1000;
  static final int NUM_ONE = 3;
  static final int NUM_TWO = 5;


  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i < ATHOUSAND; i++) {
      if(i%NUM_ONE==0 ||i%NUM_TWO==0){
        sum+=i;
      }
    }
    System.out.println("Sum: " + sum);
  }

}
