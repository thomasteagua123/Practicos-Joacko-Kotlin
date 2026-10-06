package edu.etec.ds.fundamentos

import kotlin.reflect.typeOf

fun obtenerTipoEntero(): String {
    "Retornar el nombre del tipo inferido para 42"
    return 42::class.simpleName!! 
}

fun obtenerTipoDouble(): String {
    "Retornar el nombre del tipo inferido para 3.14"
}

fun obtenerTipoBoolean(): String {
    "Retornar el nombre del tipo inferido para true"
}

fun obtenerTipoString(): String {
    "Retornar el nombre del tipo inferido para \"Kotlin\""
}

fun obtenerTipoChar(): String {
    "Retornar el nombre del tipo inferido para 'A'"
}

fun obtenerTipoLista(): String {
    "Retornar el nombre del tipo inferido para listOf(1, 2, 3)"
}

fun obtenerTipoMap(): String {
    ("Retornar el nombre del tipo inferido para mapOf(\"a\" to 1)")
}

fun obtenerTipoArray(): String {
    "Retornar el nombre del tipo inferido para arrayOf(1, 2, 3)"
}

fun obtenerTipoNulo(): String {
    "Retornar el nombre del tipo inferido para null"
}

fun obtenerTipoNullable(): String {
    "Retornar \"Nullable\" para una variable nullable"
}

fun obtenerTipoUnit(): String {
    "Retornar el nombre del tipo de una funcion que no retorna nada"
}

fun obtenerTipoNothing(): String {
    "Retornar el nombre del tipo de una funcion que lanza una excepcion"
}
