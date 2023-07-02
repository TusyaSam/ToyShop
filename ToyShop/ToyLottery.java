import java.util.ArrayList;
import java.util.List;


public class ToyLottery {
    private List<Toy> toys;

    public ToyLottery() {
        this.toys = new ArrayList<>();
    }
    public void addToy(int id, String name, int quantity, int weight) {
        Toy newToy = new Toy(id, name, quantity, weight);
        toys.add(newToy);
    }
    public void changeWeight(int id, int newWeight) {
        Toy toy = toys.get(id);
        toy.setWeight(newWeight);
    }


    public void updateToyWeight(int toyId, int weight) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setWeight(weight);
                break;
            }
        }
    }

}


