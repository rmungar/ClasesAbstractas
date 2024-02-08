import kotlin.math.PI
class Circulo(radio: Int, color:String) :Figura(){

    init {
        require(radio>0) {"EL radio no puede ser negativo"}
        require(color.isNotBlank()) {"El color no puede estar vacío"}
    }
    private val radio: Int = radio
    private val color: String = color
    override fun area(): String {
        return "El área es de ${(PI * (radio*radio)).toInt()}u"
    }

    override fun perimetro(): String {
        return "El perímetro es de ${(PI*(radio*2)).toInt()}u"
    }

    override fun toString(): String {
        return "Círculo de radio: $radio y color: $color"
    }
}