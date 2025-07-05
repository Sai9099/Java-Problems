class SmartDevice {
    protected String deviceName;
    protected boolean status;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.status = false;
    }

    public void turnOn() {
        status = true;
        System.out.println(deviceName + " is now ON.");
    }

    public void adjustSettings() {
        System.out.println("Adjusting default settings for " + deviceName);
    }
}

class SmartLight extends SmartDevice {
    private int brightness;

    public SmartLight(String deviceName, int brightness) {
        super(deviceName); 
        this.brightness = brightness;
    }

    @Override
    public void turnOn() {
        super.turnOn(); 
        System.out.println(deviceName + " brightness set to " + brightness);
    }

    @Override
    public void adjustSettings() {
        super.adjustSettings(); 
        System.out.println("Adjusting brightness of " + deviceName);
    }
}

class SmartFan extends SmartDevice {
    private int speed;

    public SmartFan(String deviceName, int speed) {
        super(deviceName);
        this.speed = speed;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(deviceName + " speed set to " + speed);
    }

    @Override
    public void adjustSettings() {
        super.adjustSettings();
        System.out.println("Adjusting speed of " + deviceName);
    }
}

class SmartThermostat extends SmartDevice {
    private int temperature;

    public SmartThermostat(String deviceName, int temperature) {
        super(deviceName);
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(deviceName + " set to " + temperature + "°C");
    }

    @Override
    public void adjustSettings() {
        super.adjustSettings();
        System.out.println("Adjusting temperature of " + deviceName);
    }
}

public class Main{
    public static void main(String[] args) {
        SmartLight light = new SmartLight("Living Room Light", 75);
        SmartFan fan = new SmartFan("Ceiling Fan", 3);
        SmartThermostat thermostat = new SmartThermostat("Thermostat", 22);

        light.turnOn();
        light.adjustSettings();

        fan.turnOn();
        fan.adjustSettings();

        thermostat.turnOn();
        thermostat.adjustSettings();
    }
}
