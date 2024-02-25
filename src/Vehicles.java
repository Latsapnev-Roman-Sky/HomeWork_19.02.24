public class Vehicles implements Serviced {
    public String modelName;
    public int wheelsCount;

    public Vehicles (String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    @Override
    public void check() {
        System.out.println("Обслуживаем "+ modelName);
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}
