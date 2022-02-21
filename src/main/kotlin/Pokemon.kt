import kotlin.random.Random

abstract class Pokemon (private var psActual: Int, private var nombre: String, private var atq:Int, private var def:Int, private var vel:Int, private var agi:Int, private var exp:Int, private var tipo: TipoPokemon?,
                        private var psMax: Int = 100 ) {

    fun getPsActual():Int{return psActual}
    // Esta funcion la llamaremos en el combate para igualar la vida max a la vida actual
    fun setVidaMax():Int{
        psActual = getPsMax()
        return  psActual
    }
    fun getPsMax():Int{return psMax}
    fun getNombre():String{return nombre}
    fun getExp():Int{return exp}
    fun getAtq():Int{return atq}
    fun getDef():Int{return def}
    fun getVel():Int{return vel}
    fun getAgi():Int{return agi}
    fun getTipo(): TipoPokemon?{return tipo}
    // esta clase ira en el sistema de combate
    fun danyoRecibido(danio:Int):Int{
         psMax -= danio
        return psMax
    }

    fun saludo(){
        println(" Hola, soy $nombre")
    }
    // esta clase ira en el sistema de combate
    fun curar(curacion:Int):Int{
        psMax += curacion
        return psMax
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
    fun subirNivelAtq(): Int{
        var experiencia = exp
        if(experiencia == 100){
            atq += Random.nextInt(0,5)
        }
        return atq
    }

    fun subirNivelDef(): Int {
        var experiencia = exp
        if (experiencia == 100) {
            def += Random.nextInt(0, 5)
        }
        return def
    }

    fun subirNivelVel(): Int {
        var experiencia = exp
        if (experiencia == 100) {
            vel += Random.nextInt(0, 5)
        }
        return vel
    }

    fun subirNivelAgi(): Int {
        var experiencia = exp
        if (experiencia == 100) {
            agi += Random.nextInt(0, 5)
        }
        return vel
    }

    fun subirNivelPS(): Int {
        var experiencia = exp
        if (experiencia == 100) {
            psMax+= Random.nextInt(0, 20)
        }
        return psMax
    }

   // fun evoluciona(): La idea es que le pases por parametro en string el nombre del pokemon al que evoluciona y el pokemon se transforme en la clase pokemon pasada por parametro


    fun graciasPorLaCura(){
        println("Gracias por curarme")
    }




 }




