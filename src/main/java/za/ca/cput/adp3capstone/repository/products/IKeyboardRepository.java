package za.ca.cput.adp3capstone.repository.products;

import za.ca.cput.adp3capstone.domain.products.Keyboard;
import za.ca.cput.adp3capstone.repository.IRepository;

import java.util.HashMap;

public interface IKeyboardRepository extends IRepository<Keyboard, Long> {
    HashMap<Long, Keyboard> getAll();
}
