package UniquePairs;

import java.util.HashSet;

public class Utility {

    //added 2 parameters. Integer array is for given numbers and another one is for sum of pairs.
   public static void pairs(int [] arr, int sum){
       //Store unique data using by Hashset to eliminate of dublicates
       HashSet<Integer> hashSet = new HashSet<Integer>();

       for (int each : arr){
           //Add datas in Hashset
           hashSet.add(each);


           if (hashSet.contains(sum-each)){
               System.out.print("( " + (sum-each) + " , " + each + " )");
           }
       }
   }

}
