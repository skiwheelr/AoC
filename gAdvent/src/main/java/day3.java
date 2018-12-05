
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;

public class day3 {
    
    
     public void slice(FileInputStream d3) throws IOException, NumberFormatException {
        int cover = 0;
        int countf = 0;
        //int[2000][2000] overall;

        BufferedReader br = new BufferedReader(new InputStreamReader(d3));

        String strLine;
        //Read File Line By Line


        int lenX = 0 , lenY  =0  , lenA =0;
        int [][] fish = new int[1229][4];


        while ((strLine = br.readLine()) != null) {



       //for(int i=0; i < .lines; i++) {
            int a = strLine.indexOf("@ ");
            int c = strLine.indexOf(",");
            int b = strLine.indexOf(":");
            int x = strLine.indexOf("x");
            String entrys = strLine.substring(1, a-1);
            String xpts = strLine.substring(a+2, c);
            String ypts = strLine.substring(c+1, b);
            String xdims = strLine.substring(b+2, x);
            String ydims = strLine.substring(x+1);

            int entry = Integer.valueOf(entrys);
            fish [entry -1][0] = Integer.valueOf(xpts);
            fish [entry -1][1] = Integer.valueOf(ypts);
            fish [entry -1][2] = Integer.valueOf(xdims);
            fish [entry -1][3] = Integer.valueOf(ydims);


            if((fish[entry -1][0] + fish[entry -1][2]) > lenX)
                lenX = fish[entry -1][0] + fish[entry -1][2];

            if((fish[entry -1][1] + fish[entry -1][3]) > lenY)
                lenY = fish[entry -1][1] + fish[entry -1][3];

        }

        System.out.println("\n\n\n\n"+lenX+"\n\n"+lenY);
        int[][] map = new int[lenX][lenY];

        for(int t[] : fish){
            for(int i = 0;i < t[2] ; i++){
                for(int j = 0;j< t[3];j++){
                    map[t[0]+i][t[1]+j]++;
                }
            }


        }
        for(int q[] : map){
            for(int g : q){
                System.out.print(g);
                if(g > 1)countf++;
            }
            System.out.println();

        }


        System.out.println("Overall double coverage is: " + countf);

       }


}
