public class Car extends Vehicle implements IsLandVehicle{
int kw;
public Car(int maxspeed, String model, double price, int kw){
    super(maxspeed, model, price);
    this.kw=kw;
}

    public int getKw() {
        return kw;
    }

    public void setKw(int kw) {
        this.kw = kw;
    }
    @Override
    public void enterLand() {
        System.out.println("gotovo");
    }

    @Override
    public double checkPromo() {
        return this.getPrice() + this.getPrice() * 2/10;
    }
}
}
