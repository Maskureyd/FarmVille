abstract class Plant implements IPlantActions {
    private final  String name;
    private int growthTime;
    private boolean isHarvestable;

    public Plant(String name, int growthTime) {
        this.name = name;
        this.growthTime = growthTime;
        this.isHarvestable = false;
    }
    public String getName() {
        return name;
    }

    public abstract void grow();


    public int getGrowthTime() {
        return growthTime;
    }

    public void setGrowthTime(int growthTime) {
        this.growthTime = growthTime;
    }

    public boolean isHarvestable() {
        return isHarvestable;
    }

    public void setHarvestable(boolean harvestable) {
        isHarvestable = harvestable;
    }
    @Override
    public void water() {
    }

    @Override
    public void harvest() {
    }
}
