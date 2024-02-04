fun main() {
    val p = Persona("Juan", 19)
    println(p)
    println("cumple-> ${p.celebrarCumple()}")
    println()
    println()

    val e= Empleado("elia", 18, 200.0, 100.0)
    println(e)
    println("Currar-> ${e.trabajar()}")
    println("Calcular salario-> ${e.calcularSalario()}")
    println(e.celebrarCumple())

    val g = Gerente("pablo", 14, 30.0, true,)
    println(g)
    println(g.calcularSalario())
    println(g.celebrarCumple())
    println(g.administrar())
    println()
}