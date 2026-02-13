class BuildingBlueprint {
    private int numStories;
    private int numApartments;
    private float occupancyRate;
    private boolean fullyOccupied;

    public BuildingBlueprint() {

        this.numStories = 10;
        this.numApartments = 20;
        this.occupancyRate = 1.0f;
        this.fullyOccupied = true;
    }


    public BuildingBlueprint(int numStories, int numApartments, float occupancyRate) {

        this.numStories = numStories;
        this.numApartments = numApartments;
        this.occupancyRate = occupancyRate;
        this.fullyOccupied = occupancyRate == 1.0f;
    }

    public int getNumStories() {

        return numStories;
    }

    public int getNumApartments() {

        return numApartments;
    }

    public float getOccupancyRate() {

        return occupancyRate;
    }

    public void setOccupancyRate(float occupancyRate) {

        this.occupancyRate = occupancyRate;
        this.fullyOccupied = occupancyRate == 1.0f;
    }

    public boolean isFullyOccupied() {

        return fullyOccupied;
    }
}

public class Lab13A {
    public static void main(String[] args) {

        BuildingBlueprint buildingOne = new BuildingBlueprint();
        BuildingBlueprint buildingTwo = new BuildingBlueprint(30, 30, 0.75f);

        System.out.println("Year 2020:");

        System.out.println("Building 1 has " + buildingOne.getNumStories() + " floors, " + buildingOne.getNumApartments() +
                " apartments, and is " + (buildingOne.getOccupancyRate() * 100) +
                "% occupied. Full? " + buildingOne.isFullyOccupied());

        System.out.println("Building 2 has " + buildingTwo.getNumStories() + " floors, " + buildingTwo.getNumApartments() +
                " apartments, and is " + (buildingTwo.getOccupancyRate() * 100) +
                "% occupied. Full? " + buildingTwo.isFullyOccupied());

        System.out.println("Many years pass.");


        buildingOne.setOccupancyRate(0.0f);
        buildingTwo.setOccupancyRate(1.0f);

        System.out.println("Year 2043:");
        
        System.out.println("Building 1 has " + buildingOne.getNumStories() + " floors, " + buildingOne.getNumApartments() +
                " apartments, and is " + (buildingOne.getOccupancyRate() * 100) +
                "% occupied. Full? " + buildingOne.isFullyOccupied());

        System.out.println("Building 2 has " + buildingTwo.getNumStories() + " floors, " + buildingTwo.getNumApartments() +
                " apartments, and is " + (buildingTwo.getOccupancyRate() * 100) +
                "% occupied. Full? " + buildingTwo.isFullyOccupied());

        System.out.println("Looks like people prefer taller buildings.");
    }
}