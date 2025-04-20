package za.ca.cput.adp3capstone.factory.products;

/* Keyboard.java
Keyboard Factory Class
Author: Brezano Liebenberg (230463886)
Date: 15 April 2025
 */

import za.ca.cput.adp3capstone.domain.products.Keyboard;
import za.ca.cput.adp3capstone.util.Helper;

public class KeyboardFactory {
    public static Keyboard createKeyboard(String layout, String connectionType, boolean backlit) {
        if( Helper.isStringNullOrEmpty(layout)
                || Helper.isStringNullOrEmpty(connectionType)
                || Helper.isBoolean(backlit))
        {return null;}

        return new Keyboard.Builder()
                .setLayout(layout)
                .setConnectionType(connectionType)
                .setBacklit(backlit)
                .build();
    }
}
