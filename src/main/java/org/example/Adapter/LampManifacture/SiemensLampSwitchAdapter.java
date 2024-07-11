package org.example.Adapter.LampManifacture;

public class SiemensLampSwitchAdapter implements LampSwitch{

    private SiemensLamp siemensLamp;

    public SiemensLampSwitchAdapter(SiemensLamp siemensLamp) {
        this.siemensLamp = siemensLamp;
    }

    @Override
    public void on() {
        siemensLamp.onSiemensLamp();
    }

    @Override
    public void off() {
        siemensLamp.offSiemensLamp();
    }
}
