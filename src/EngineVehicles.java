public class EngineVehicles extends Vehicles {
    public EngineVehicles(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
