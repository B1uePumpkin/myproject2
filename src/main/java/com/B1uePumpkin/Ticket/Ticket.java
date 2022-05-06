package com.B1uePumpkin.Ticket;

public class Ticket {
//    public static final int TAIPEI_STATION = 100;
//    public static final int TAICHUNG_STATION = 200;
//    public static final int KAOHSIUNG_STATION = 300;

    // 台北    台中    高雄
    // 100    200    400
    //    500    600
    // <=====1100=====>
    Station start;
    Station destination;
    int price;
    public Ticket(Station start, Station destination) {
        this.start = start;
        this.destination = destination;
        int diff = Math.abs(start.id- destination.id);
        switch (diff){
            case 100:
                price=500;
                break;
            case  200:
                price=600;
                break;
            case  300:
                price=1100;
                break;
        }
//        if (start==Station.TAIPEI_STATION){
//            if (destination==Station.TAICHUNG_STATION){
//                price=500;
//            }else{
//                price=1100;
//            }
//        }else if (start==Station.TAICHUNG_STATION){
//            if (destination==Station.KAOHSIUNG_STATION){
//                price=600;
//            }else{
//                price=500;
//            }
//        }else if (start==Station.KAOHSIUNG_STATION){
//            if (destination==Station.TAICHUNG_STATION){
//                price=600;
//            }else{
//                price=1100;
//            }
//        }
    }

    public void print(){
        System.out.println(start.name+"\t"+destination.name+"\t"+price);
    }
}
