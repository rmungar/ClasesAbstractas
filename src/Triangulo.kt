import kotlin.math.sqrt
class Triangulo(base:Int, altura:Int, color:String) : Figura() {

    init {
        require(base > 0) {"La base no puede ser negativa"}
        require(altura > 0) {"La altura no puede ser negativa"}
        require(color.isNotBlank())
    }
    private val base: Int = base
    private val altura: Int = altura
    private val color: String = color
    override fun area() :String {
        return "El área es de: ${(base*altura)/2}u"
    }

    override fun perimetro():String {
        val h: Double = altura.toDouble()
        val b: Double = (base/2).toDouble()
        val cateto: Double = sqrt((h*h)+(b*b))
        return "El perímetro es de: ${(cateto*3).toInt()}u"
    }

    override fun toString(): String {
        return "Triangulo de base: $base, altura: $altura y de color: $color"
    }
}