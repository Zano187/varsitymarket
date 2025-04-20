package za.ca.cput.adp3capstone.domain.products;

/* Monitor.java
Monitor Domain Class
Author: Brezano Liebenberg (230463886)
Date: 17 April 2025
 */

public class Monitor extends Product{

    private long monitorId;
    private String screenSize;
    private String resolution;
    private String aspectRatio;
    private String ports;
    private boolean touchScreen;

    private Monitor() {
    }

    private Monitor(Builder builder){
        this.monitorId = builder.monitorId;
        this.screenSize = builder.screenSize;
        this.resolution = builder.resolution;
        this.aspectRatio = builder.aspectRatio;
        this.ports = builder.ports;
        this.touchScreen = builder.touchScreen;
    }

    public long getMonitorId() {
        return monitorId;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public String getResolution() {
        return resolution;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }

    public String getPorts() {
        return ports;
    }

    public boolean getTouchScreen() {
        return touchScreen;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "screen size='" + screenSize + '\'' +
                ", resolution=" + resolution +
                ", aspect ratio=" + aspectRatio +
                ", ports=" + ports +
                ", touch screen=" + touchScreen +
                '}';
    }

    public static class Builder {
        private long monitorId;
        private String screenSize;
        private String resolution;
        private String aspectRatio;
        private String ports;
        private boolean touchScreen;

        public Builder setMonitorId(long monitorId) {
            this.monitorId = monitorId;
            return this;
        }

        public Builder setScreenSize(String screenSize) {
            this.screenSize = screenSize;
            return this;
        }

        public Builder setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }

        public Builder setAspectRatio(String aspectRatio) {
            this.aspectRatio = aspectRatio;
            return this;
        }

        public Builder setPorts(String ports) {
            this.ports = ports;
            return this;
        }

        public Builder setTouchScreen(boolean touchScreen) {
            this.touchScreen = touchScreen;
            return this;
        }

        public Builder copy(Monitor monitor) {
            this.monitorId = monitor.monitorId;
            this.screenSize = monitor.screenSize;
            this.resolution = monitor.resolution;
            this.aspectRatio = monitor.aspectRatio;
            this.ports = monitor.ports;
            this.touchScreen = monitor.touchScreen;
            return this;
        }

        public Monitor build() {
            return new Monitor(this);
        }
    }
}
