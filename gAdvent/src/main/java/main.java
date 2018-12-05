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

public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        main adv = new main();
        
        //File fr = new File("/input01.txt");
        //FileInputStream d1 = new FileInputStream("input01.txt");
        //System.out.println(adv.chronal(d1));

//        FileInputStream d2 = new FileInputStream("input02.txt");
//        day2 i2 = new day2();
//        i2.invent(d2);
//
//        day3 d3 = new day3();
//        File fr3 = new File("/input03.txt");
//        FileInputStream fi3 = new FileInputStream("input03.txt");
//        d3.slice(fi3);

          day4 d4 = new day4();
          File fr4 = new File("/input04.txt");
          FileInputStream fi4 = new FileInputStream("input04.txt");
          d4.sneak(fi4);

    }
}

