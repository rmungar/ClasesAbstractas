fun main() {
    try {
        val triangulo = Triangulo(10, 15, "rojo")
        println(triangulo.area())
        println(triangulo.perimetro())
        println(triangulo.toString())
        val rectangulo = Rectangulo(56, 45, "negro")
        println(rectangulo.area())
        println(rectangulo.perimetro())
        println(rectangulo.toString())
        val circulo = Circulo(31, "blanco")
        println(circulo.area())
        println(circulo.perimetro())
        println(circulo.toString())
    }catch (e:Exception){
        print(e.message)
    }
}