import java.util.*;
public class BigO{
  public static void main(String[] args){

    ///////////////////////////////
    // BIG-O
    //////////////////////////////

    /*
    Big-O-1. What is Big-O analysis? 
    ANSWER: “A way for us to compare the speed and efficiency of different algorithms.”

    BigO-2. Find the Big-O of each of these functions:
      a. f(n) = 25n^2 + 20n + 15n^3  
      b. f(n) = log(n) + sqrt(n)     
      c. f(n) = 1*2*3*4*...*n       

      ANSWER:
      a. O(n^3)
      b. O(sqrt(n))
      c. O(n!)

    BigO-3. What is the time complexity of method1?
      What is the best-case? What is the worst-case?
      ANSWER: Best-case: O(1) 
      Worst-Case: O(n)

    BigO-4. What is the time complexity of method2?
      ANSWER: O(n^2)

    BigO-5. What is the time complexity of method3?
      ANSWER: O(log(n))

    */
  }
  public static boolean method1(ArrayList<Integer> nums){
      for(int num : nums){
          if(num == -1){
              return false;
          }
      }
      return true;
  }
  public static void method2(int n){
      for(int i = 0; i < n; i++){
          for(int j = 0; j < n/4; j++){
              for(int k = 0; k < 2; k++){
                  System.out.println(i + j + k);
              }
          }
      }
  }
  public static void method3(int num){
      if(num == 0){
          return;
      }
      method3(num/2);
  }
}