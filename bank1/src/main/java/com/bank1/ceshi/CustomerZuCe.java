package com.bank1.ceshi;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

public class CustomerZuCe implements PropertyEditorRegistrar {

    @Override
    public void registerCustomEditors(PropertyEditorRegistry propertyEditorRegistry) {
        propertyEditorRegistry.registerCustomEditor(Address.class,new CustomerJiXi());
    }
}
