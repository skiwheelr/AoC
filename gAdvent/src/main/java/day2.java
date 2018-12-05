import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import static org.apache.commons.lang.CharSetUtils.count;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//import static jdk.nashorn.internal.objects.NativeDebug.map;
import java.util.HashMap;
import java.util.*;
import org.apache.commons.io.FileUtils;
//import org.apache.commons.lang.StringUtils;



public class day2 {
    
    public void invent(FileInputStream d2) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(d2));
        int checksum = 1;

        ArrayList<String> lines = new ArrayList<>();
        String strLine;
        int countp = 1;

        while ((strLine = br.readLine()) != null) {
            lines.add(strLine);
        }
        //for each line in array
       for (String line : lines)
            {  //for each character in line
                for (int i=0; i <= line.length();i++){
                 //int count = countOccurences(line, line.charAt(i,0);
               //  String sub = line.charAt(i);

                 //int count = StringUtils.countMatches(line,(line.substring(line.charAt(i), line.charAt(i))));
                 //if (count >= 2){ countp *= count;}

                }
                                 System.out.println(countp);



//                System.out.println(line);
//                   HashMap<Character, Integer> map = new HashMap<>();
//                    for (int i = 0; i < line.length(); i++) {
//                        char c = line.charAt(i);
//                            if (map.containsKey(c)) {
//                               int cnt = map.get(c);
//                                  map.put(c, ++cnt);
//
//                            } else {
//                                map.put(c, 1);
//                            }
//                            //System.out.println(map.get(c));
//                            int rep = map.get(c);
//
//                            if (rep > 1){
//                              int[] checksummer = null;
//                              checksummer[i] = 1;
//                              checksummer[i] *= rep;
//                                System.out.println(checksummer[i]);
//                            }
//
//                    }
//
            }



    }

private static int countOccurences(String someString, char searchedChar, int index) {
    if (index >= someString.length()) {
        return 0;
    }

    int count = someString.charAt(index) == searchedChar ? 1 : 0;
    return count + countOccurences(
      someString, searchedChar, index + 1);
}

//    public int chronal(FileInputStream fr2) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(fr2));
//        int total = 0;
//        ArrayList<Integer> past = new ArrayList<>();
//        past.add(0);
//
//        String strLine;
//        //Read File Line By Line
//        while ((strLine = br.readLine()) != null) {
//            // Print the content on the console
//            //System.out.println (strLine);
//
//            if (strLine.startsWith("+")) {
//                total += Integer.parseInt(strLine.substring(1));
//                // past.add(total);
//                past.add(total);
//                //if(past.contains(total) ){
//                //      System.out.println("Repeat found: "+ past.get(past.size()-1));
//                //}
//            } else {
//                total -= Integer.parseInt(strLine.substring(1));
//                // past.add(total);
//                past.add(total);
//                //if(past.contains(total) ){
//                //    System.out.println("Repeat found: "+ past.get(past.size()-1));
//                //  }
//            }
//            //if(past.contains(total) ){
//                //    System.out.println("Repeat found: "+ past.get(past.size()-1));
//                //  }
//
//            System.out.println(total);
//            // System.out.println(past);
//        }
//
//        //Close the input stream
//        br.close();
//
//        return total;
//    }

}


