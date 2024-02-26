//Función para obtener el área de un rectangulo
fun recArea(base:Float, height:Float): Float{
    return base*height
}
//Función pata obtener el area de un prisma recatngular
fun prisArea(rarea:Float, long:Float): Float{
    return rarea*long
}
//Función para obtención de promedio, con valores predefinidos
fun overall(c1:Float =8f, c2:Float =8f, c3:Float):Float{
    return (c1+c2+c3)/3f
}
//Función para conocer el tipo de rectangulo dadas sus medidas
fun TriangleAnalisys(a:Float, b:Float, c:Float):String{
    if (a == b && a==c){
        return "Equilatero"
    } else if (a == b && a!=c){
        return "Isóceles"
    } else{
        return "escaleno"
    }
}
//Funcion para conocer el tipo de dato de una variable
fun datatype(type:String):String{
    return when (type){
        "String" -> "Tipo Cadena"
        "Int" -> "Entero"
        "Double" -> "Doble"
        else -> "Otro tipo de dato"
    }
}
//Función que cuenta el numero de veces que aparece un nombre en una lista
fun contarNom(nombres: List<String>, nombreBuscado: String): Int {
    var contador = 0
    for (nombre in nombres) {
        if (nombre == nombreBuscado) {
            contador++
        }
    }
    return contador
}

fun main(){
    //Llamada a la función para cálcular el area de un rectangulo
    val base= 2f; val altura= 6f
    val areaRecatngulo= recArea(base, altura)
    println(" El área del rectangulo es: $areaRecatngulo")
    //Llamada a la función de un prisma considerando la función de area anterior
    val largo= 5f
    val areaPrisma= prisArea(areaRecatngulo, largo)
    println(" El área del prisma rectangular es: $areaPrisma")
    //Prueba de cálculo de varios promedios, considerando valores predefinidos
    val cal1=9.5f; val cal2=9.5f; val cal3=6f
    val promedio1 = overall(c3=cal1)
    val promedio2 = overall(c2=cal2, c3=cal1)
    val promedio3 = overall(c3=10f)

    println(" El promedio con una calificación es: $promedio1")
    println(" El promedio con dos calificación es: $promedio2")
    println(" El promedio con 10f al final es: $promedio3")
    //Prueba de función para conocer el tipo de rectangulo
    val tipoTriangulo1 = TriangleAnalisys(10f,10f,10f)
    val tipoTriangulo2 = TriangleAnalisys(10f,10f,5f)
    val tipoTriangulo4 = TriangleAnalisys(10f,11f,11f)

    println(" El triangulo 1 es de tipo: $tipoTriangulo1")
    println(" El triangulo 2 es de tipo: $tipoTriangulo2")
    println(" El triangulo 3 es de tipo: $tipoTriangulo4")
    //Prueba de la función para conocer el tipo de dato de una variable
    val prueba1 =10.0; val prueba2="Hola"; val prueba3= 6f

    val tipo1 = datatype(prueba1::class.simpleName ?: "Desconocido")
    val tipo2 = datatype(prueba2::class.simpleName ?: "Desconocido")
    val tipo3 = datatype(prueba3::class.simpleName ?: "Desconocido")

    println(" La variable prueba 1 es de tipo: : $tipo1")
    println(" La variable prueba 2 es de tipo: : $tipo2")
    println(" La variable prueba 3 es de tipo: : $tipo3")

    //Prueba de la función de contador de nombres en una lista
    val Nombres = listOf(
        "Pedro Luis", "Juan Manuel", "Juan Luis", "María Inés",
        "Romeo", "Ernesto", "Juan Pedro", "Ariadna",
        "Mireya María", "Ana Sofía", "José Juan"
    )
    //Se solicita un nombre para contarlo dentro de la lista
    println("Ingrese el nombre: ")
    val nombre = readLine()
    val numeroNombres= nombre?.let { contarNom(Nombres, it) }
    println("La cantidad de registros con ese nombre es de $numeroNombres")


}