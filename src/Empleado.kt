open class Empleado(nombre: String, edad:Int, salarioBase:Double, porcentajeImpuesto:Double): Persona(nombre, edad) {

        var salarioBase = 0.0
        var porcentajeImpuesto= 10.0

        /*
        constructor(salarioBase: Int) :super(nombre,edad){

        }
        No se como llamar al padre para el constructor secundario
 */


        open fun calcularSalario(): Double{
                var impuesto = salarioBase *(porcentajeImpuesto/100)
                impuesto -= salarioBase
                return salarioBase
        }

        override fun toString(): String {
                return super.toString() + "salario: %.2f".format(salarioBase)
        }

        fun trabajar(): String{
                return "$nombre esta trabajando en la empresa"
        }
}