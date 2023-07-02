public class main {
    public static void main(String[] args) {
        ToyLottery toyLottery = new ToyLottery();

        Toy toy1 = new Toy(1, "Кукла", 5, 50);
        Toy toy2 = new Toy(2, "Машинка", 7, 30);
        Toy toy3 = new Toy(3, "Плюшевый мишка", 3, 20);

        toyLottery.addToy(1, "Кукла", 5, 50);
        toyLottery.addToy(2, "Машинка", 7, 30);
        toyLottery.addToy(3, "Плюшевый мишка", 3, 20);

        toyLottery.updateToyWeight(1, 60);

        Toy randomToy = toy1.drawToy();
        if (randomToy != null) {
            System.out.println("You got a " + randomToy.getName() + " from the toy box!");
        } else {
            System.out.println("The toy box is empty!");
        }
    }

}
