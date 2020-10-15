package sample;

import java.io.*;
import java.text.DecimalFormat;

/**
 * @author :chensuzi
 * @version :V1.0
 * @ClassName :ValidateActionJson
 * @Description :TODO
 * @date :2020/10/14 16:35
 **/
public class GGA_Processing {

    public static void GGA_Processing(File file,FileWriter fw) {
        try{
            // File file = new File("E:\\ftp\\test.txt");//输入txt文件路径
            BufferedReader br = new BufferedReader(new FileReader(file));
          //  FileWriter fw = new FileWriter("E:\\ftp\\test_1.txt", true);//输出txt文件路径
            BufferedWriter bw = new BufferedWriter(fw);
            String s = null;
            int i;
            while ((s = br.readLine()) != null) {//使用readLine方法内，一次读一容行
                // System.out.println(s.substring(0, 79));
                //$GPGGA,092725.00,4717.11399,N,00833.91590,E,1,08,1.01,499.6,M,48.0,M,,*5B
                //读取每一行中的经纬度
                String[] s_split = s.split(",");
                String str = s_split[2];
                String str1 = s_split[4];
                //转度分为度格式
                double du1=Integer.valueOf(str.substring(0,2)) + Double.valueOf(str.substring(2)) / 60.0;
                double du2=Integer.valueOf(str1.substring(0,3)) + Double.valueOf(str1.substring(3)) / 60.0;
                //实现重写
                String sr = "";
                DecimalFormat df = new DecimalFormat("0.0000000");//设置保留位数
                for(i=0;i<s_split.length;++i){
                    if(i==2){
                        sr = sr + String.valueOf(df.format(du1));
                    }
                    else if(i==4){
                        sr = sr + String.valueOf(df.format(du2));
                    }
                    else
                        sr += s_split[i];
                    if(i < s_split.length-1)
                        sr +=",";
                }
                System.out.println("str1.substring(0,3) = " + str1.substring(0,3));
                System.out.println("Double.valueOf(str1.substring(3))  = " + Double.valueOf(str1.substring(3)) );
                bw.write(sr + "\r\n");
            }
            br.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

}
