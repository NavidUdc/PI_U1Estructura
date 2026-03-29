import java.util.Random;

public class ejercicio18 {


    public static Cancion[] crearPlayList(Cancion []arreglo){
        Random rand = new Random();

        Cancion[] playList = new Cancion[10];
        boolean[] usados = new boolean[arreglo.length];

        int contador = 0;

        while (contador < 10) {
            int idx = rand.nextInt(arreglo.length);

            if (!usados[idx]) {
                playList[contador] = arreglo[idx];
                usados[idx] = true;
                contador++;
            }
        }

        return playList;
    }


    public static void filtrarXArtista(Cancion []arreglo, String artista){


        System.out.println("CANCIONES DEL ARTISTA: " +artista);
        for(Cancion c: arreglo){
            if (!c.getArtista().equalsIgnoreCase(artista)){
                System.out.println("El arttista buscado no existe");
            }
            break;
        }s
        for (Cancion c: arreglo) {
            if (c.getArtista().equalsIgnoreCase(artista)){
                System.out.println(c.getTitiulo() + "-" + c.getDuracion());
            }

        }


    }
    public static void main(String [] args){
        Cancion []arreglo={
                new Cancion("Si No Me Falla El Corazon", "Diomedes Diaz", 4.20),
                new Cancion("Bonita", "Diomedes Diaz", 4.35),
                new Cancion("Mi Primera Cana", "Diomedes Diaz", 4.10),
                new Cancion("La Suerte Esta Echada", "Diomedes Diaz", 4.25),
                new Cancion("Amarte Mas No Pude", "Diomedes Diaz", 4.40),
                new Cancion("Volvi a Sentir Amor", "Maelo Ruiz", 4.50),
                new Cancion("Te Va a Doler", "Maelo Ruiz", 4.30),
                new Cancion("No Te Quites La Ropa", "Maelo Ruiz", 4.15),
                new Cancion("Regalame Una Noche", "Maelo Ruiz", 4.45),
                new Cancion("Por Favor Señora", "Maelo Ruiz", 4.20),
                new Cancion("Mi Hermano y Yo", "Hermanos Zuleta", 4.10),
                new Cancion("La Gota Fria", "Hermanos Zuleta", 4.30),
                new Cancion("Rio Badillo", "Hermanos Zuleta", 4.25),
                new Cancion("El Condor Herido", "Hermanos Zuleta", 4.35),
                new Cancion("Mi Canto Sentimental", "Hermanos Zuleta", 4.40),
                new Cancion("Ella Me Llama", "Luister La Voz", 3.50),
                new Cancion("No Te Olvido", "Luister La Voz", 3.45),
                new Cancion("Dime Que Paso", "Luister La Voz", 3.55),
                new Cancion("Quiero Tenerte", "Luister La Voz", 3.40),
                new Cancion("Tu Amor Me Hace Falta", "Luister La Voz", 3.50)
        };



        Cancion []playlist = crearPlayList(arreglo);
        System.out.println();
        System.out.println("PLAYLIST CREADA:");
        for (Cancion c: playlist){
            System.out.println(c.getTitiulo() + "-" + c.getArtista() + "-" +  c.getDuracion());
        }
        System.out.println();

        filtrarXArtista(arreglo, "Diomedes Dgaz");
    }
}
