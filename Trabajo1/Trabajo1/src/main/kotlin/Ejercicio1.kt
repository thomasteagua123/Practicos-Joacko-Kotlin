package edu.etec.ds.fundamentos
import kotlin.math.abs


fun suma(a: Int, b: Int): Int {
    "Implementar suma de dos enteros"
    return a + b
}

fun resta(a: Int, b: Int): Int {
    "Implementar resta de dos enteros"
    return  a - b
}

fun multiplicacion(a: Int, b: Int): Int {
    "Implementar multiplicacion de dos enteros"
    return a * b
}

fun division(a: Int, b: Int): Int {
    "Implementar division entera de dos enteros"
    return a / b
}

fun modulo(a: Int, b: Int): Int {
    "Implementar modulo de dos enteros"
    return a % b
}

fun esMayorQue(a: Int, b: Int): Boolean {
    "Retornar true si a es mayor que b"
    return a > b
}

fun esMenorQue(a: Int, b: Int): Boolean {
    "Retornar true si a es menor que b"
    return a < b
}

fun sonIguales(a: Int, b: Int): Boolean {
    "Retornar true si a y b son iguales"
    return a == b
}

fun esPar(numero: Int): Boolean {
    "Retornar true si el numero es par"
    return numero % 2 == 0
}

fun esImpar(numero: Int): Boolean {
    "Retornar true si el numero es impar"
    return numero % 2 != 0
}

fun valorAbsoluto(numero: Int): Int {
    "Retornar el valor absoluto del numero"
    return abs(numero)
}

fun maximo(a: Int, b: Int): Int {
    "Retornar el mayor entre a y b"
    if (a>b) {
        return a
    }
    else{
        return b
    }

}

fun minimo(a: Int, b: Int): Int {
    "Retornar el menor entre a y b"
    if (a<b){
        return a
    }
    else{
        return b
    }
}
