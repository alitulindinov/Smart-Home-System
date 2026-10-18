
public class SmartHomeFacade {

    private LightSystem lightSystem;
    private ClimateSystem climateSystem;
    private SecuritySystem securitySystem;
    private DoorLockSystem doorLockSystem;

    public SmartHomeFacade() {
        lightSystem = new LightSystem();
        climateSystem = new ClimateSystem();
        securitySystem = new SecuritySystem();
        doorLockSystem = new DoorLockSystem();
    }

    public void leaveHome() {
        System.out.println("Preparing the house for leaving...");

        lightSystem.turnOffLights();
        climateSystem.turnOffAirConditioner();
        securitySystem.activateAlarm();
        doorLockSystem.lockDoor();

        System.out.println("The house is ready.");
    }

    public void arriveHome() {
        System.out.println("Preparing the house for arrival...");

        doorLockSystem.unlockDoor();
        securitySystem.deactivateAlarm();
        lightSystem.turnOnLights();
        climateSystem.turnOnAirConditioner();

        System.out.println("Welcome home!");
    }
}
