public class CarrotPlant extends Plant{
    private int waterLevel;

    public CarrotPlant(String name, int growthTime) {
        super(name, growthTime);
        this.waterLevel = 0;
    }
    public void grow(){
        if (waterLevel >= 5) {
            setHarvestable(true);
        }
        System.out.println(getName() + " is growing. Growth time: " + waterLevel + "/" + getGrowthTime() + ".");

    }
    public void water(){
        waterLevel += 1;
    }
    public void harvest(){
        if (isHarvestable()) {
            System.out.println(getName() + " has been harvested. Congratulations!!");
            waterLevel = 0;
            setHarvestable(false);
        } else {
            System.out.println(getName() + " is not ready to harvest yet.");
        }

    }
}
