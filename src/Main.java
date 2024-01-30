public class Main {
    public static void main(String[] args) {
        interface SmartDevice {
            void turnOn();
            void turnOff();
            void connectToInternet();
        }
        abstract class Gadget implements SmartDevice {
            @Override
            public void turnOn() {
                System.out.println("on");
            }
            @Override
            public void turnOff() {
                System.out.println("off");
            }
            @Override
            public void connectToInternet() {
                System.out.println("connected");
            }
            abstract void receiveNotification(String message);
            abstract void batteryStatus();
        }
        class SmartPhone extends Gadget {
            @Override
            void receiveNotification(String message) {
                System.out.println("notification phone" + message);
            }
            @Override
            void batteryStatus() {
                System.out.println("bataryia 70%");
            }
            void makeCall(String number) {
                System.out.println("call" + number);
            }
            void sendSMS(String message) {
                System.out.println("SMS" + message);
            }
            void connectToDevice(SmartDevice anotherDevice) {
                System.out.println("phone connected to another device");
            }
        }
        class SmartWatch extends Gadget {
            @Override
            void receiveNotification(String message) {
                System.out.println("notification chasy" + message);
            }
            @Override
            void batteryStatus() {
                System.out.println("watch battery 80%");
            }
            void trackHeartRate() {
                System.out.println("heart rate");
            }
            void showTime() {
                System.out.println("time on watch");
            }
            void connectToDevice(SmartDevice anotherDevice) {
                System.out.println("watch connected to another device");
            }
        }
        class SmartTV extends Gadget {
            @Override
            void receiveNotification(String message) {
                System.out.println("notification on tv" + message);
            }

            @Override
            void batteryStatus() {
                System.out.println("tv does not have a battery wtf");
            }

            void streamVideo(String url) {
                System.out.println("getting video from site" + url);
            }

            void changeChannel(int channel) {
                System.out.println("changing kanal to" + channel);
            }
            void connectToDevice(SmartDevice anotherDevice) {
                System.out.println("tvshka connected to another device");
            }
        }
    }
}