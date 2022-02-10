abstract class Pokemon (private var nombre: String, private var ps: Int = 100, private var atq:Int, private var exp:Int) {
    fun getPs():Int{return ps}
    fun getNombre():String{return nombre}
    fun getExp():Int{return exp}
    fun getAtq():Int{return atq}
    fun danyoRecibido(danio:Int):Int{
         ps -= danio
        return ps
    }
    fun saludo(){
        println(" Hola, soy $nombre")
    }
    fun curar(curacion:Int):Int{
        ps += curacion
        return ps
    }
    fun atacar(defensaEnemiga: Int,potencia:Int, modificador:Boolean):Float {
        var ataque = atq
        var danio = 0f
        if (modificador == true) {
            danio = (ataque / defensaEnemiga) * potencia * 0.5f * 2
        } else {
            danio = (ataque / defensaEnemiga) * potencia * 0.5f * 1
        }
        return danio
    }
    fun evolucionar(): Int{
        var experiencia = exp
        if(experiencia == 100){
            atq *= 1.2.toInt()
        }
        return atq

    }
    fun graciasPorLaCura(){
        println("Gracias por curarme")
    }



}




