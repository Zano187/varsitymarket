package za.ca.cput.adp3capstone.repository.products;

/* Monitor.java
MonitorRepository class
Author: Brezano Liebenberg (230463886)
Date: 17 April 2025
 */

import za.ca.cput.adp3capstone.domain.products.Monitor;

import java.util.HashMap;

public class MonitorRepository implements IMonitorRepository {

    private static IMonitorRepository repository = null;
    private HashMap<Long, Monitor> monitors;

    private MonitorRepository(){
        monitors = new HashMap<>();
    }

    private IMonitorRepository getRepository(){
        if(repository == null){
            repository = new MonitorRepository();
        }
        return repository;
    }


    @Override
    public Monitor read(Long productId) {
        Monitor monitor = monitors.get(productId);
        if(repository == null) {
        return null;
        }
        return monitor;
    }

    @Override
    public Monitor create(Monitor monitor) {
        if(monitor == null){
            return null;
        }
        return monitors.put(monitor.getProductId(), monitor);
    }

    @Override
    public Monitor update(Monitor monitor) {
        Monitor monitorToUpdate = monitors.get(monitor.getProductId());
        if(monitorToUpdate == null){
            return null;
        }
        monitors.put(monitor.getProductId(), monitor);
        return null;
    }

    @Override
    public boolean delete(Monitor monitor) {
        if(monitor == null){
            return false;
        }
        monitors.remove(monitor.getProductId());
        return true;
    }

    @Override
    public HashMap<Long, Monitor> getAll() {
        return monitors;
    }
}
