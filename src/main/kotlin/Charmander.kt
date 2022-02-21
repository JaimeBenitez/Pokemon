class Charmander(private var ListaAtaques:ArrayList<Ataque>,psActual:Int, nombre:String,atq:Int,def:Int,vel:Int,agi:Int,exp:Int,tipo: TipoPokemon?,psMax: Int = 100 )
    :Pokemon(psActual,nombre,atq,def,vel,agi,exp,tipo,psMax),Fuego {

    fun getAtaques():ArrayList<Ataque>{return ListaAtaques}



    override fun toString(): String {
        return "${getNombre()}: ps maximo: ${getPsMax()}, ps actual: ${getPsActual()}, Ataques=$ListaAtaques, ataque: ${getAtq()}, def: ${getDef()}, vel: ${getVel()},agi: ${getAgi()}, exp: ${getExp()}, tipo: ${getTipo()}"



    }

}