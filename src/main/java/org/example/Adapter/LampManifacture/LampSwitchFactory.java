package org.example.Adapter.LampManifacture;

public class LampSwitchFactory {
    public static LampSwitch getPhilipsLampSwitch() {
        PhilipsLamp philipsLamp = new PhilipsLamp();
        PhilipsLampSwitchAdapter philipsLampSwitchAdapter = new PhilipsLampSwitchAdapter(philipsLamp);

        return philipsLampSwitchAdapter;
    }

    public static LampSwitch getSiemensLampSwitch() {
        SiemensLamp siemensLamp = new SiemensLamp();
        SiemensLampSwitchAdapter siemensLampSwitchAdapter = new SiemensLampSwitchAdapter(siemensLamp);

        return siemensLampSwitchAdapter;
    }
}
