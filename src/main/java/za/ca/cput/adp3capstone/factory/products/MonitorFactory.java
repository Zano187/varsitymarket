package za.ca.cput.adp3capstone.factory.products;

/* Monitor.java
Monitor Factory class
Author: Brezano Liebenberg (230463886)
Date: 17 April 2025
 */

import za.ca.cput.adp3capstone.domain.products.Monitor;
import za.ca.cput.adp3capstone.util.Helper;

public class MonitorFactory {

    public static Monitor createMonitor(String screenSize, String resolution
            , String aspectRatio, String ports, boolean touchScreen) {
        if(Helper.isStringNullOrEmpty(screenSize)
                || Helper.isStringNullOrEmpty(resolution)
                || Helper.isStringNullOrEmpty(aspectRatio)
                || Helper.isStringNullOrEmpty(ports)
                || Helper.isBoolean(touchScreen))
            return null;

        return new Monitor.Builder()
                .setScreenSize(screenSize)
                .setResolution(resolution)
                .setAspectRatio(aspectRatio)
                .setPorts(ports)
                .setTouchScreen(touchScreen)
                .build();
    }
}
