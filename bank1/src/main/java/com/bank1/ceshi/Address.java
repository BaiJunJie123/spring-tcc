package com.bank1.ceshi;

public class Address {

    public String sheng;

    public String shi;

    public String xian;

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng;
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    @Override
    public String toString() {
        return "Address{" +
                "sheng='" + sheng + '\'' +
                ", shi='" + shi + '\'' +
                ", xian='" + xian + '\'' +
                '}';
    }
}
