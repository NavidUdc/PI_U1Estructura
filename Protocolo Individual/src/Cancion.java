public class Cancion {
    private double duracion;
    private String artista;
    private String titiulo;

    public Cancion (String titulo, String artista, double duracion){
        this.artista=artista;
        this.titiulo = titulo;
        this.duracion=duracion;
    }


    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTitiulo() {
        return titiulo;
    }

    public void setTitiulo(String titiulo) {
        this.titiulo = titiulo;
    }
}
