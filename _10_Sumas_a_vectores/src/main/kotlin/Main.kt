import java.util.*
import kotlin.random.Random
/*autor luisa*/
fun main(args: Array<String>) {
    var matriz = Array(4) { Array<Int>(4) { Random.nextInt(1, 9)} }
    var sumaFilas = Sumarfilas(matriz)
    var sumaColum = Array(matriz[0].size){0}

    mostrarMatriz(matriz)
    sumarFilas(matriz,sumaFilas)
    sumarColumas(matriz,sumaColum)
    println("La suma de las filas es")
    println(Arrays.toString(sumaFilas))
    println("La suma de las columnas es")
    println(Arrays.toString(sumaColum))



}

private fun Sumarfilas(matriz: Array<Array<Int>>): Array<Int> {
    var sumaFilas = Array(matriz.size) { 0 }
    return sumaFilas
}

fun sumarFilas (m:Array<Array<Int>>,sumaFilas:Array<Int>){
    var f: Int = 0
    var c: Int = 0
/*recorre las filas*/
    while (f < m.size){
        while (c < m[0].size){
            sumaFilas[f] += m[f][c]
            c++
            }
        c = 0
        f++
        }
    }


fun sumarColumas (m:Array<Array<Int>>,sumaColumnas:Array<Int>){
    var f: Int = 0
    var c: Int = 0

    while (c < m.size){
        while (f < m[0].size){
            sumaColumnas[c] += m[f][c]
            f++
        }
        f = 0
        c++
    }
}



fun mostrarMatriz(m:Array<Array<Int>>){
    for (f in m.indices){
        for (c in m[f].indices){
            print("${m[f][c]} ")
        }
        println()
    }
}