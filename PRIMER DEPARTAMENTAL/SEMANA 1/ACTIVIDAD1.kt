        //POR: MARTI}ÍNEZ PANTALEÓN JOSÉ DE JESÚS
        // 6NM61
        // PROGRAMACIÓN MOVIL
        //PROFESOR: FRANCISCO BUENO

/* REACTIVO 3. CREAR UNA VARIABLE CONST CON EL NUMERO PI QUE MULTIPLIQUE A NUESTRO NUMERO */
const val  PI= 3.1416

fun main() {
    /* REACTIVO 1. CONOCER EL TIPO DE DATO  QUE SE ASIGNA AUTOMATICAMENTE
    A UN NUMERO DECIMA*/
    var number1 = 9.55416546549844      //DECLARACION DEL NUMERO
    println(number1)                    //IMPRESION DEL NUMERO
    println(number1::class.simpleName)  //IMPRESION DEL TIPO DE DATO POR DEFECTO

    /* REACTIVO 2. VOLVER FLOTANTE EN NUMERO */

    var number2: Float= number1.toFloat() // Se declara una nueva variable para ingresar el dato en tipo Float
    println(number2) //Impresión de variable
    println(number2::class.simpleName) //impresion del tipo de variable

    /* REACTIVO 3. CREAR UNA VARIABLE CONST CON EL NUMERO PI QUE MULTIPLIQUE A NUESTRO NUMERO */

    var diac = (number2 * number2 * PI) //CALCULO DEL DIAMETRO

    /* REACTIVO 4. STRING TEMPLATE PARA IMPRIMIR EL RESULTADO DEL perimetro */

    println("El radio de la circunferencia es : $diac") // IMPRESION DEL DIAMETRO

    /* REACTIVO 5. EXPRESAR LA FORMULA DE LA PENDIENTE CON OPERADORES m = y2-y1/x2-x1*/

    /* REACTIVO 6. RESOLVER CON LOS VALORES  P1(4,3), P2(-3,-2)*/

    var y1=3;  var y2=-2 ;  var x1=4;  var x2=-3 //DECLARACION DE VARIABLE
    var m= ((y2-y1)/(x2-x1)) //FUNCION DE LA PENDIENTE
    println("El valor de la pendiente es: $m" ) //IMPRESION DEL VALOR

    /* REACTIVO 7. RESPONDER: ¿Por qué el resultado obtenido difiere del resultado esperado?
    * Por defecto, al tener entradas enteras, se considera a "m" como valor entero.
    * Se debe considerar declarar explicitamente ls variables como decimales.*/

    /* REACTIVO 8. SOLUCIONAR EL ERROR*/
    //REASIGNACION DE VARIABLES
    var y1F = y1.toFloat()
    var y2F = y2.toFloat()
    var x1F = x1.toFloat()
    var x2F = x2.toFloat()
    var m2= ((y2F-y1F)/(x2F-x1F))
    println("El valor de la pendiente es: $m2" ) //IMPRESION DEL RESULTADO





}
