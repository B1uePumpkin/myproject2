package com.B1uePumpkin.parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ruunner {
    public static void main(String[] args) {
        String name = "ABC-1234";
        String enterTime = "08:00";
        String exitTime = "11:30";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        Date d = null;

        try {
            d= sdf.parse(enterTime);
        }catch (Exception e){
            System.out.println("wrong format");
        }

        System.out.println(d);
        System.out.println(d.getTime());

        long ms = 3*60*60*1000;

        try {
            Date d2 = sdf.parse(exitTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            int mins = (int)((d2.getTime()-d.getTime())/1000/60);
            System.out.println(mins);
            int fee=0;
//          1)
//            if (mins%60<15){
//                fee = 30*(mins/60);
//            }else {
//                fee = 30*(mins/60)+30;
//            }

//          2)
            fee=15*(mins/30);
            System.out.println("Fee:"+fee);
//          1) 3:14 =>$90 , 3:15 =>$120
//          2) 3:15-3:30 =>$105
        }catch (Exception e) {
            System.out.println("exit wrong format");
        }
    }
}
