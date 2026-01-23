package com.oops.poly.overriding;
public class RBI {
    double roi(){
        return 6.5;
    }
}
class ICICI extends RBI{
    @Override
    double roi() {
        return 7.2;
    }
}
class HDFC extends RBI{
    @Override
    double roi() {
        return 7.6;
    }
}
class OverridingDemo{
    public static void main(String[] args) {
        RBI rbi = new RBI();
        ICICI icici = new ICICI();
        HDFC hdfc = new HDFC();
        System.out.println("The rate of interest of RBI is:" + rbi.roi()+"%");
        System.out.println("The rate of interest of ICICI is:"+icici.roi()+"%");
        System.out.println("The rate of interest of HDFC is:"+hdfc.roi()+"%");
    }
}
