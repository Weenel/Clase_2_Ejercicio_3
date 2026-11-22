fun mostrarMenu() {
    println("1. Consultar pedido")
    println("2. Consultar envío")
    println("0. Salir")
}

fun leerOpcion(): Int {
    var opcion: Int
    do {
        print("Elige una opción: ")
        opcion = readln().toIntOrNull() ?: -1
        if (opcion !in 0..2) println("Opción no válida")
    } while (opcion !in 0..2)
    return opcion
}

fun main() {
    var continuar = true
    while (continuar) {
        mostrarMenu()
        when (leerOpcion()) {
            1 -> println("Estado: En preparación")
            2 -> println("Estado: Enviado")
            0 -> continuar = false
        }
    }
}