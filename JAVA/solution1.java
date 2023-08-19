import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    
    Map<String,Integer> hM = new HashMap<>();
    DecimalFormat decimalFormat = new DecimalFormat("#.######");
    
    hM.put("p",0);
    hM.put("n",0);
    hM.put("z",0);
    for(Integer i : arr){
        if(i>0){
           hM.put("p",hM.getOrDefault("p",0)+1);
        }else if(i<0){
            hM.put("n",hM.getOrDefault("n",0)+1);
        }else{
            hM.put("z",hM.getOrDefault("z",0)+1);
            
        }
    }
    //System.out.println((double)hM.get("p")/arr.size());
    
    // calculation
    
    String p = decimalFormat.format((double)hM.get("p")/arr.size());
    String n = decimalFormat.format((double)hM.get("n")/arr.size());
    String z = decimalFormat.format((double)hM.get("z")/arr.size());
    System.out.println(p);
    System.out.println(n);
    System.out.println(z);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
