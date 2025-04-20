package za.ca.cput.adp3capstone.factory.products;

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
