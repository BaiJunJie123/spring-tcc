package com.bank1.ceshi;

import java.beans.PropertyEditorSupport;

public class CustomerJiXi extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws java.lang.IllegalArgumentException {
        String[] s = text.split("_");
        Address address = new Address();
        address.setSheng(s[0]);
        address.setShi(s[1]);
        address.setXian(s[0]);
        this.setValue(address);
    }
}
