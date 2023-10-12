package com.company.Randomcode;

import java.util.Date;

public class MainOrder {
    public static void main(String[] args){


        Order mainOrder = new Order(1, new Date(), OderStatus.PENDING_PAYMENT);
        System.out.println(mainOrder.toString());
        OderStatus b = OderStatus.DELIVERED;
        OderStatus p = OderStatus.valueOf("DELIVERED");
        System.out.println(p);
    }
}
