package com.example.factorydesign.factory;

import com.example.factorydesign.phone.AndroidPhone;
import com.example.factorydesign.phone.IPhone;
import com.example.factorydesign.phone.Phone;
import com.example.factorydesign.phone.WindowsPhone;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("phoneFactory")
@Component
public class PhoneFactory {

    public Phone getPhone(String phone) {
        if (phone.equals("android")) {
            System.out.println("Android Phone created!");
            return new AndroidPhone();
        } else if (phone.equals("i")) {
            System.out.println("I Phone created!");
            return new IPhone();
        } else if (phone.equals("windows")) {
            System.out.println("Windows Phone created!");
            return new WindowsPhone();
        }
        return null;
    }
}
