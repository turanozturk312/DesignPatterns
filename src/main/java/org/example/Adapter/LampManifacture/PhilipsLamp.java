package org.example.Adapter.LampManifacture;

public class PhilipsLamp extends AbstractLamp {

    public PhilipsLamp() {
        super("Philips");
    }

    public void onPhilipsLamp() {
        if (isAlreadyOn()) {
            System.out.println("Lamp is already on");
            return;
        }

        setCurrentState(LampStates.ON.getState());
        printCurrentState();
    }

    public void offPhilipsLamp() {
        if (isAlreadyOff()) {
            System.out.println("Lamp is already off");
            return;
        }

        setCurrentState(LampStates.OFF.getState());
        printCurrentState();
    }
}
