package org.example.Adapter.LampManifacture;

public class LampManifactureMain {

    public static void main(String[] args) {
        LampSwitch switchOne = LampSwitchFactory.getPhilipsLampSwitch();
        switchOne.on();
        switchOne.off();

        System.out.println("---");

        LampSwitch switchTwo = LampSwitchFactory.getSiemensLampSwitch();
        switchTwo.on();
        switchTwo.off();
    }
}
