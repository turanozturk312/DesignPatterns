package org.example.Adapter.LampManifacture;

public class PhilipsLampSwitchAdapter implements LampSwitch{

    private PhilipsLamp philipsLamp;

    public PhilipsLampSwitchAdapter(PhilipsLamp philipsLamp) {
        this.philipsLamp = philipsLamp;
    }

    @Override
    public void on() {
        philipsLamp.onPhilipsLamp();
    }

    @Override
    public void off() {
        philipsLamp.offPhilipsLamp();
    }
}
