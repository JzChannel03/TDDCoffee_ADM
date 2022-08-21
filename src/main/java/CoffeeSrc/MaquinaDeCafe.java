package CoffeeSrc;

public class MaquinaDeCafe {

    private Cafetera cafe;
    private Vaso vasosPequenos;
    private Vaso vasosMedianos;
    private Vaso vasosGrandes;
    private Azucarero azucarero;

    public Cafetera getCafe() {
        return cafe;
    }

    public void setCafe(Cafetera cafe) {
        this.cafe = cafe;
    }

    public Vaso getVasosPequenos() {
        return vasosPequenos;
    }

    public void setVasosPequenos(Vaso vasosPequenos) {
        this.vasosPequenos = vasosPequenos;
    }

    public Vaso getVasosMedianos() {
        return vasosMedianos;
    }

    public void setVasosMedianos(Vaso vasosMedianos) {
        this.vasosMedianos = vasosMedianos;
    }

    public Vaso getVasosGrandes() {
        return vasosGrandes;
    }

    public void setVasosGrandes(Vaso vasosGrandes) {
        this.vasosGrandes = vasosGrandes;
    }

    public Azucarero getAzucarero() {
        return azucarero;
    }

    public void setAzucarero(Azucarero azucarero) {
        this.azucarero = azucarero;
    }

    public Vaso getTipoDeVaso(String tipoVaso){
        return switch (tipoVaso) {
            case "pequeno" -> vasosPequenos;
            case "mediano" -> vasosMedianos;
            case "grande" -> vasosGrandes;
            default -> null;
        };
    }

    public String getVasoDeCafe(Vaso tipoDeVaso, int cantidadDeVasos, int cantidadDeAzucar){
        if (tipoDeVaso.hasVasos(cantidadDeVasos)){
            if (cafe.hasCafe(tipoDeVaso.getContenido())){
                if (azucarero.hasAzucar(cantidadDeAzucar)){
                    tipoDeVaso.giveVasos(cantidadDeVasos);
                    azucarero.giveAzucar(cantidadDeAzucar);
                    cafe.giveCafe(tipoDeVaso.getContenido());
                    return "Felicitaciones";
                } else {
                    return "No hay Azucar";
                }
            } else {
                return "No hay Cafe";
            }
        } else {
            return "No hay Vasos";
        }
    }



}
