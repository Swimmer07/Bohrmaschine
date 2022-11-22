public class MainProgram {
    public static void main(String[] args) {
    DrillingMachine e1 = new DrillingMachine();
    DrillingMachine e2 = new DrillingMachine();

    e1.showInfos();
    e1.becomeBroken();
    e1.showInfos();
    e1.repair();
    e1.showInfos();
    e1.aging();
    e1.showInfos();
    e1.reactOnHighDemand();
    e1.showInfos();
    e1.increasePrice(2000);
    e1.showInfos();
    System.out.println("Ein Watt kostet: " + e1.getPricePerWatt());
    System.out.println(e1.getInfo());

    }
}
