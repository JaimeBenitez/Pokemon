fun main(args: Array<String>) {
    var pokemon1 = Charmander(arrayListOf(),100,"Paco",20,20, 15, 20,30,TipoPokemon.FUEGO)
    println(pokemon1)
    var charmanderA1 = Ataque("Llamarada",35,80,25)

}
// Mecanica de acierto en ataques
// numero del 1 al 100   precision 80 - agilidad 20 = 60 %
// Si numero resultado <= 60 = Ataque acierta
// Si es menor el ataque falla