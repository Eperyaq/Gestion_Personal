open class Persona(var nombre: String, var edad:Int) {
    override fun toString(): String {
        return "Persona con nombre $nombre, y edad $edad"
    }

    fun celebrarCumple(): String{
        ++edad
        return "Felicidades $nombre, ahora tienes $edad años!!"
    }

}