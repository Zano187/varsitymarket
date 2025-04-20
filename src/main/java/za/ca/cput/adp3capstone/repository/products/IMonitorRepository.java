package za.ca.cput.adp3capstone.repository.products;

/* Monitor.java
Monitor Repository Interface
Author: Brezano Liebenberg (230463886)
Date: 17 April 2025
 */

import za.ca.cput.adp3capstone.domain.products.Monitor;
import za.ca.cput.adp3capstone.repository.IRepository;

import java.util.HashMap;

public interface IMonitorRepository extends IRepository<Monitor, Long> {
    HashMap<Long, Monitor> getAll();
}
