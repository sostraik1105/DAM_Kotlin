import kotlin.reflect.typeOf

fun main(){
    /*
    tipos de dato
        - Boolean -> size = 1bit -> false/true
        - Char -> size = 16bit -> 'a' to 'z', '/n' '/101'
        - String -> "Hola"
        - Array of int [1,2,3]
        -----------------------------------------
        NUMBERS
        - Byte -> size = 8bit -> -127 to 128
        - Double -> size = 64bit -> 3.431231231234 (max 16 decimales)
        - Float -> size = 32bit -> 3.4123232 (max 7 decimales)
        - Int -> size = 32bit -> -2 -1 0 1 2
        - Long -> size = 64bit -> -2L -1L 0L 1L 2L
        - Short -> size = 16bit -> none
    */

    val one = 1 // int
    println(one);

    val pi = 3.14 // double
    println(pi)

    val num1Double = 12.32 // Double
    println(num1Double::class.simpleName) // ::class.simpleName -> para ver el tipo de dato

    // en el caso de floats, debemos agregarle una f o F al final
    val num1Float = 12.32f // Float
    println(num1Float::class.simpleName)

    // tambien podemos ser mós especificos y decirle el tipo de dato (recomendable)
    val two: Int = 2
    println(two)

    // val three: Double = 3 -> devuelve error, los Double deben tener tener almenos un decimal
    val three: Double = 3.0
    println(three)

    // cuando un float se pasa de los 7 decimales, se redondea automaticamente
    val e: Float = 2.7182818284f
    println(e) // -> 2.7182817

}