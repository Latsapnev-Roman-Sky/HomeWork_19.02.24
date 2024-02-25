public class Vehicles {
    public String modelName;
    public int wheelsCount;

    public Vehicles (String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
