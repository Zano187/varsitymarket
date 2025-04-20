package za.ca.cput.adp3capstone.domain.products;

/* Keyboard.java
Keyboard Domain Class
Author: Brezano Liebenberg (230463886)
Date: 15 April 2025
 */

public class Keyboard extends Product{

    private String layout;
    private String connectionType;
    private boolean backlit;

    private Keyboard(){}

    private Keyboard(Builder builder){
        this.layout = builder.layout;
        this.connectionType = builder.connectionType;
        this.backlit = builder.backlit;
    }

    public String getLayout() {
        return layout;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public boolean isBacklit() {
        return backlit;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "layout='" + layout + '\'' +
                ", connection type=" + connectionType +
                ", backlit=" + backlit +
                '}';
    }

    public static class Builder {
        private String layout;
        private String connectionType;
        private boolean backlit;

        public Builder setLayout(String layout) {
            this.layout = layout;
            return this;
        }

        public Builder setConnectionType(String connectionType) {
            this.connectionType = connectionType;
            return this;
        }

        public Builder setBacklit(boolean backlit) {
            this.backlit = backlit;
            return this;
        }

        public Builder copy(Keyboard keyboard) {
            this.layout = keyboard.layout;
            this.connectionType = keyboard.connectionType;
            this.backlit = keyboard.backlit;
            return this;
        }

        public Keyboard build(){
            return new Keyboard(this);
        }

    }

}
