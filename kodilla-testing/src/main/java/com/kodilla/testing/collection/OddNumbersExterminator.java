package com.kodilla.testing.collection;
import java.lang.*;
import java.util.*;

public class OddNumbersExterminator {



      public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
          ArrayList<Integer> evenList = new ArrayList<>();
          for (int i=0; i<numbers.size(); i++){
            int checkedNumber = numbers.get(i);
            if(checkedNumber % 2 == 0) {
                evenList.add(checkedNumber);
            }
         }
          return evenList;
      }
}
