import java.util.ArrayList;

public class Farm {
    private final ArrayList<Plant> plants;

    public Farm() {
        plants = new ArrayList<>();
    }
    public void addPlant(Plant plant){
        plants.add(plant);
        System.out.println(plant.getName() + " has been added to farm.");

    }
    public void simulateDay(){
        for (Plant plant : plants) {
            plant.water();
            plant.grow();
            plant.harvest();
        }
        System.out.println();
    }
    }

