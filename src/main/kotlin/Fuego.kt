interface Fuego {
    fun efectivoPlanta(danio: Int, tipoPokemon: TipoPokemon): Int {
        var danioRealizado = danio
        if (tipoPokemon == TipoPokemon.PLANTA) {
            danioRealizado *= 2
        }
        return danioRealizado
    }

    fun pocoEfectivoAgua(danio: Int, tipoPokemon: TipoPokemon): Int {
        var danioRealizado = danio
        if (tipoPokemon == TipoPokemon.AGUA) {
            danioRealizado /= 2
        }
        return danioRealizado
    }
}