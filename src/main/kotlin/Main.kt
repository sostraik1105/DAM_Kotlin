fun main(){
    // Booleanos
    val verdadero: Boolean = true
    val falso: Boolean = false
    val nulo: Boolean? = null

    // Operadores Lógicos (OL)
    println(verdadero || falso) // "||" representa el OL 'OR' -> true
    println(verdadero && falso) // "&&" representa el OL 'AND' -> false
    println(!verdadero) // "!" representa el OL 'NOT' -> false

    // Arrays
    var arr = arrayOf(1,"Ursula",false);
    println(arr)

    // existe tipos primitivos de arrays
    var byteArr: ByteArray = byteArrayOf(1, -2) // solo admite bytes
    println(byteArr)

    var shortArr: ShortArray = shortArrayOf(150, -200) // solo admite shorts
    println(shortArr)

    var intArr: IntArray = intArrayOf(100000, -21597523) // solo admite ints
    println(intArr)
}