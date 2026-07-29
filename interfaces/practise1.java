package interfaces;

interface voiceControllable {
          void takeVoiceCommmand(String command);
}

interface wifiConnected {
          void connectToWifi(String networkName);
}

abstract class SmartDevice {
          protected String deviceName;

          public SmartDevice(String deviceName) {
                    this.deviceName = deviceName;
          }

          public void turnOn() {
                    System.out.println(deviceName + "is now on");

          }

          public void turnOff() {
                    System.out.println(deviceName + "is now off.");
          }
}

class smartTv extends SmartDevice implements voiceControllable, wifiConnected {
          public smartTv(String name) {
                    super(name);
          }

          @Override
          public void connectToWifi(String networkName) {
                    System.out.println(deviceName + " connected to wifi network:  " + networkName);
          }

          @Override
          public void takeVoiceCommmand(String command) {
                    System.out.println(deviceName + "executing voice command " + command);
          }

          public void connectToWIFi(String command) {
                    System.out.println(deviceName + "executing voice command:" + command);
          }

}

class BasicSmartLamp extends SmartDevice implements wifiConnected {

          public BasicSmartLamp(String name) {
                    super(name);
                    // TODO Auto-generated constructor stub
          }

          @Override
          public void connectToWifi(String networkName) {
                    System.out.println(deviceName + " connected to wifi " + networkName);
          }
}

public class practise1 {
          public static void main(String[] args) {
                    smartTv tv = new smartTv("livind room sony tv");
                    tv.turnOn();
                    tv.connectToWIFi("home_network_5g");
                    tv.takeVoiceCommmand("open youtube");

                    System.out.println("--------------------");
                    BasicSmartLamp lamp = new BasicSmartLamp("bedroom desk lamp ");
                    lamp.turnOn();
                    lamp.connectToWifi("home_network_2.4g");
          }
}
