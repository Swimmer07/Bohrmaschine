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
        System.out.println(name + "-" + "Watt:" + watt + "-Preis:" + price + "-Kaputt?:" + broken + "-Alter:" + age);
    }

    public void becomeBroken(){
        broken = true;
    }

    public void repair() {
        if (broken == true){
            broken = false;
            price = price / 2;
        }
    }

    public void aging(){
        age = age + 1;
        if (age >= 10){
            broken = true;
        }
    }

    public void reactOnHighDemand(){
        this.price =  price + 0.25*price;
    }

    public void setBroken(boolean broken){
        this.broken = broken;
    }

    public void increasePrice(double amount){
        price = price + amount;
    }

    public void changePower(int watt){
        if(watt > 0) {
            this.watt = this.watt + watt;
        }

            if(watt > 100){
                this.price = price*1.05;
            }

    }
}


