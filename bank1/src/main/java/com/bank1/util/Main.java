package com.bank1.util;

import com.bank1.po.AccountInfoPo;
import org.omg.PortableServer.POA;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        AccountInfoPo po =null;
       // po.setBalance(111);
        try {
            Integer s =  Optional.ofNullable(po).map(u -> u.getBalance()).get();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
      //  System.out.println(po.getBalance());
    }
}
