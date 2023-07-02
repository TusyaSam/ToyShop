import java.util.List;
import java.util.Random;

public class Toy {
    private int id;
    private String name;
    private int quantity;
    private int weight;
    private List<Toy> toys;

    public Toy(int id, String name, int quantity, int weight) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int setQuantity() {
        return this.quantity = quantity;
    }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Toy drawToy() {
        //метод будет выбирать игрушку из списка `toys`
        // на основе их веса (частоты выпадения). Если игрушки закончились, метод вернет `null`.
        int sumWeights = 0;
        for (Toy toy : toys) {
            sumWeights += toy.getWeight();
        }

        Random random = new Random();
        int randNum = random.nextInt(sumWeights);

        int currentSumWeights = 0;
        for (Toy toy : toys) {
            currentSumWeights += toy.getWeight();
            if (randNum < currentSumWeights) {
                if (toy.getQuantity() > 0) {
                    toy.setQuantity(toy.getQuantity() - 1);
                    return toy;
                } else {
                    break;
                }
            }
        }

        return null;
    }

}






