package org.example.Adapter.LampManifacture;

public enum LampStates {
    ON("ON"),
    OFF("OFF");

    private String state;

    LampStates(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
