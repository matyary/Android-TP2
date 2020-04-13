package Entities

class Login () {
    lateinit private var logueo: Array<String>

    fun getUsuario (): String{
        return this.logueo.get(0)
    }

    fun getClave (): String{
        return this.logueo.get(1)
    }
}