package CoffeeSrc;

public class Cafetera {

    private int cantidadCafe;

    public Cafetera(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }

    public void setCantidadCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public boolean hasCafe(int cantidadCafe){
        return cantidadCafe <= this.cantidadCafe;
    }

    public boolean giveCafe(int cantidadCafe){
        if (hasCafe(cantidadCafe)){
            this.cantidadCafe -= cantidadCafe;
            return true;
        }
        return false;
    }
}
