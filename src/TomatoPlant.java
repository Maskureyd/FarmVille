class TomatoPlant extends Plant {
    private  int waterLevel;

    public TomatoPlant(String name, int growthTime) {
        super(name, growthTime);
        this.waterLevel = 0;
    }
    @Override
    public void grow(){
        if (waterLevel >= 3) {
            setHarvestable(true);
        }
        System.out.println(getName() + " is growing. Growth time: " + waterLevel + "/" + getGrowthTime() + ".");
    }
    @Override
    public void water(){
        waterLevel += 1;
    }


    @Override
    public void harvest(){
        if (isHarvestable()) {
            System.out.println(getName() + " has been harvested. Congratulations!!!");
            waterLevel = 0;
            setHarvestable(false);
        } else {
            System.out.println(getName() + " is not ready to harvest yet.");
        }

    }
}
