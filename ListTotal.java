//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListTotal
{
 public static int total( List<Integer> ray )
 {
  //declare and initialize sum as 0
  int sum = 0; 
  //foreach loop that loops through each value in the arrayList
  for (Integer val: ray)
  {
    //add the current value to sum
    sum+=val;  
  }
  //return the sum
  return sum;
 }
}