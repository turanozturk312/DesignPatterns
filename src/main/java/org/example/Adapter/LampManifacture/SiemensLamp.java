package org.example.Adapter.LampManifacture;

public class SiemensLamp extends AbstractLamp{

    public SiemensLamp() {
        super("Siemens");
    }

    public void onSiemensLamp() {
        if (isAlreadyOn()) {
            System.out.println("Lamp is already on");
            return;
        }

        setCurrentState(LampStates.ON.getState());
        printCurrentState();
    }

    public void offSiemensLamp() {
        if (isAlreadyOff()) {
            System.out.println("Lamp is already off");
            return;
        }

        setCurrentState(LampStates.OFF.getState());
        printCurrentState();
    }
}
