class Gerente(nombre:String, edad:Int, var bonus:Double, var exentoImpuestos:Boolean= false): Empleado(nombre, edad, 200.0, 33.99) {

    override fun calcularSalario(): Double {
        if (exentoImpuestos == true){
            return salarioBase + (bonus * (porcentajeImpuesto/100))
        }
        else{
            return salarioBase * (porcentajeImpuesto/100)
        }
    }

    override fun toString(): String {
        return super.toString() + "bonus: $bonus, excento: $exentoImpuestos"
    }

    fun administrar():String{
        return "El gerente esta administrando su casa"
    }
}