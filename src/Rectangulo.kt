class Rectangulo(base:Int, altura:Int, color:String): Figura() {
    init {
        require(base > 0 && altura > 0) {"Las medidas del rectángulo no son correctas"}
        require(color.isNotBlank()) {"El color no puede estar vacío"}
    }
    private val base: Int = base
    private val altura: Int = altura
    private val color: String = color

    override fun area(): String {
        return "El área es de ${base*altura}u"
    }

    override fun perimetro(): String {
        return "El perímetro es de ${(2*base)+(2*altura)}u"
    }

    override fun toString(): String {
        return "Rectángulo de base: $base, altura: $altura y color: $color"
    }
}