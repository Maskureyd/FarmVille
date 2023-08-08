public class FarmVille {
    public static void main(String[] args) {
        Farm farm = new Farm();

        TomatoPlant tomatoPlant = new TomatoPlant("Tomato Plant", 3);
        CarrotPlant carrotPlant = new CarrotPlant("Carrot Plant", 5);

        farm.addPlant(tomatoPlant);
        farm.addPlant(carrotPlant);
        System.out.println("");

        System.out.println("Day 1: ");
        farm.simulateDay();

        System.out.println("Day 2: ");
        farm.simulateDay();

        System.out.println("Day 3: ");
        farm.simulateDay();
    }
}
