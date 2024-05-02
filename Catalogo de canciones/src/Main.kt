/**
 * Clase que representa una canción.
 *
 * @property title Título de la canción.
 * @property artist Artista de la canción.
 * @property year Año de lanzamiento de la canción.
 * @property playCount Número de veces que se ha reproducido la canción.
 */
class Song(
    val title: String,
    val artist: String,
    val year: Int,
    var playCount: Int
) {
    /**
     * Indica si la canción es popular basada en su recuento de reproducciones.
     */
    val isPopular: Boolean
        get() = playCount >= 1000

    /**
     * Imprime la descripción de la canción en formato específico.
     */
    fun printDescription() {
        println("$title, interpretada por $artist, se lanzó en $year.")
    }
}

fun main() {
    // Creación de instancias de canciones
    val cancion1 = Song("Título1", "Artista1", 1975, 1500)
    val cancion2 = Song("Título2", "Artista2", 2017, 1200)
    val cancion3 = Song("Título3", "Artista3", 2017, 800)

    // Impresión de las descripciones de las canciones
    cancion1.printDescription()
    cancion2.printDescription()
    cancion3.printDescription()
}
