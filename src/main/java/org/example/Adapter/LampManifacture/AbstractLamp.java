package org.example.Adapter.LampManifacture;

public class AbstractLamp {

    private String manifactureName;

    private String currentState = LampStates.OFF.getState();

    public AbstractLamp(String manifactureName) {
        this.manifactureName = manifactureName;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public String getManifactureName() {
        return manifactureName;
    }

    public void setManifactureName(String manifactureName) {
        this.manifactureName = manifactureName;
    }

    public Boolean isAlreadyOn() {
        return currentState.equalsIgnoreCase(LampStates.ON.getState());
    }

    public Boolean isAlreadyOff() {
        return currentState.equalsIgnoreCase(LampStates.OFF.getState());
    }

    public void printCurrentState() {
        System.out.println(manifactureName + " Lamp is " + currentState + " now");
    }

}
