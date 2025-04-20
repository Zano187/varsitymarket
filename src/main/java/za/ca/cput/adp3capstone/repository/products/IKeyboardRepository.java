package za.ca.cput.adp3capstone.repository.products;

/* Keyboard.java
Keyboard Repository Interface
Author: Brezano Liebenberg (230463886)
Date: 15 April 2025
 */

import za.ca.cput.adp3capstone.domain.products.Keyboard;
import za.ca.cput.adp3capstone.repository.IRepository;

import java.util.HashMap;

public interface
IKeyboardRepository extends IRepository<Keyboard, Long> {
    HashMap<Long, Keyboard> getAll();
}
