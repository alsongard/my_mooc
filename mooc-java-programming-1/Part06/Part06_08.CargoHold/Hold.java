import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    public Hold(int weight) {
        this.maximumWeight = weight;
    }

    public void addSuitcase(Suitcase givenSuitcase) {
        int holdWeight = 0;

        if (this.suitcases.size() > 0) {
            for (Suitcase listSuitcase : this.suitcases) {
                holdWeight += listSuitcase.getMaxSuitcase();
            }
        }
        // add to Hold suitcases arrayList
        if (givenSuitcase.getMaxSuitcase() + holdWeight >= this.maximumWeight + 1) {
            return;
        }

        this.suitcases.add(givenSuitcase);

    }

    public void printItems() {
        // if (this.suitcases.size() == 0) {
        //     return;
        // }   
        for (Suitcase suitcaseItem: this.suitcases) {
            suitcaseItem.printItems();
        }
    }

    public String toString() {
        if (this.suitcases.size() == 0) {
            return "0 suitcases (0 kg)";
        }
        String partOf = "";
        int weightOfSuitcases = 0;
        if (this.suitcases.size() == 1) {
            partOf = "suitcase";
        } else {
            partOf = "suitcases";
        }
        
        for (Suitcase suitcaseItem: this.suitcases) {
            weightOfSuitcases += suitcaseItem.totalWeight();
        }
        return this.suitcases.size() + " " + partOf + " (" + weightOfSuitcases + "kg) ";
    }


}

