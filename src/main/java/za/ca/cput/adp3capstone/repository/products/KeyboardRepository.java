package za.ca.cput.adp3capstone.repository.products;

/* Keyboard.java
KeyboardRepository Class
Author: Brezano Liebenberg (230463886)
Date: 15 April 2025
 */

import za.ca.cput.adp3capstone.domain.products.Keyboard;

import java.util.HashMap;

public class KeyboardRepository implements IKeyboardRepository{

    private static IKeyboardRepository repository = null;
    private HashMap<Long, Keyboard> keyboards;

    private KeyboardRepository(){
        keyboards = new HashMap<>();
    }

    public static IKeyboardRepository getRepository(){
        if(repository == null){
            repository = new KeyboardRepository();
        }
        return repository;
    }

    @Override
    public Keyboard read(Long productId) {
        Keyboard keyboard = keyboards.get(productId);
        if(keyboard == null){
            return null;
        }
        return keyboard;
    }

    @Override
    public Keyboard create(Keyboard keyboard) {
        if(keyboard == null){
            return null;
        }
        return keyboards.put(keyboard.getProductId(), keyboard);
    }

    @Override
    public Keyboard update(Keyboard keyboard) {
        Keyboard keyboardToUpdate = keyboards.get(keyboard.getProductId());
        if(keyboardToUpdate == null){
            return null;
        }
        keyboards.put(keyboard.getProductId(), keyboard);
        return null;
    }

    @Override
    public boolean delete(Keyboard keyboard) {
        if(keyboard == null){
            return false;
        }
        keyboards.remove(keyboard.getProductId());
        return true;
    }

    @Override
    public HashMap<Long, Keyboard> getAll() {
        return keyboards;
    }
}
