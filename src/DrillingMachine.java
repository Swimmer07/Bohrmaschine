public class DrillingMachine {
    private int watt;
    private String name;
    private int age;
    private double price;
    private boolean broken;

    public DrillingMachine() {
    name = "NR 1";
    watt = (int)(Math.random()*1201+800);
    age = (int)(Math.random()*11);
    price = Math.random()*450 + 50;
    }

    public void showInfos(){
        System.out.println(name + "-" + "Watt:" + watt + "-Preis:" + price);
    }
}

