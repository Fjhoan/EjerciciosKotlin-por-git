import kotlin.math.*

class Exercises {

    //Ejercicios operadores

    fun triangleArea(){
        println("calcular el area de un triangulo")
        println("ingresa la base del triangulo")
        val base: Int =readLine()!!.toInt()
        println("ingresa la altura del triangulo")
        val altura: Int =readLine()!!.toInt()
        println("El area  es de: ${(base*altura)/2}")
    }

    fun adittion(){
        println("sumar dos numeros")
        println("ingresa el numero 1")
        val num1: Int =readLine()!!.toInt()
        println("ingresa el numero 2")
        val num2: Int =readLine()!!.toInt()
        println("La suma de los numeros ingresados es ${num1+num2}")
    }
    fun numSquared(){
        println("numero elevado al cuadrado")
        println("digite el numero que desee")
        val num1: Int = readLine()!!.toInt()
        println("el numero $num1 elevado al cuadrado tiene un valor de ${num1*num1}")
    }
    fun euroToDollar(){
        println("euro a dolar")
        println("digite el valor en euros")
        val euro = readLine()!!.toDouble()
        println("el valor del $euro euro en dolares s ${euro*1.12}")
    }
    fun areaPerimeterOfSquare(){
        println("Area y perimetro de un cuadrado")
        println("digite el lado del cuadrado")
        val lado:Int = readLine()!!.toInt()
        println("el cuadrado con el lado de $lado tiene un area de ${lado*lado} y un perimetro de ${lado*4}")
    }
    fun areaVolumenOfCilinder(){
        println("area y volumen de un cilindro")
        println("digite la altura del cilindro")
        val altura = readLine()!!.toDouble()
        println("digite el diametro del cilindro")
        val diameter = readLine()!!.toDouble()
        val radius = diameter / 2
        val area = 2 * PI * radius * altura + 2 * PI * (radius * radius)
        val volumen = PI * (radius * radius) * altura
        println(area)
        println(volumen)
    }
    fun areaVolumenOfCircle(){
        println("area y volumen de un circulo")
        println("digite el radio del circulo")
        val radio = readLine()!!.toDouble()
        println("digite la longitud del circulo")
        val longitud = readLine()!!.toDouble()
        val area = (PI * radio) * (PI * radio)
        println("El area es de $area y la longitud es $longitud")
    }

    fun promThreeNumbers() {
        println("Ingrese tres números:")
        val numbers = DoubleArray(3)
        var adittion: Double
        var promedio: Double
        for (i in 0 .. 2) {
            print("Número ${i + 1}: ")
            numbers[i] = readLine()!!.toDouble()
        }
        adittion = numbers.sum()
        promedio = adittion / 3
        println("La suma de los números es: $adittion")
        println("El promedio de los números es: $promedio")
    }

    //Ejercicios Condicionales

    fun positiveOrNegative(){
        var number = 0
        println("Ingrese un número")
        number = readLine()!!.toInt()
        if (number == 0){
            println("El número es cero")
        }else if (number < 0){
            println("El número es negativo")
        }else{
            println("El número es positivo")
        }
    }
    fun greaterOrLess(){
        var A = 0
        var B = 0
        println("Digite el número A")
        A = readLine()!!.toInt()
        println("Digite el número B")
        B = readLine()!!.toInt()
        if (A > B){
            println("El número mayor es: $A\nEl número menor es: $B")
        }else if (A < B){
            println("El número mayor es: $B\nEl número menor es: $A")
        }else{
            println("Los número son iguales")
        }
    }

    fun greateAndLess(){
        val numbers = IntArray(3)
        var greate = 0
        var less = 0
        for (i in 0..2){
            println("Digite el numero ${i+1}")
            numbers [i] = readLine()!!.toInt()
        }
        greate = numbers.maxOrNull()!!
        less = numbers.minOrNull()!!
        println("El número mayor: $greate\n El menor es: $less")
    }

    fun addOrSubtract(){
        var A = 0
        var B = 0
        var result = 0
        println("Digite el numero A")
        A = readLine()!!.toInt()
        println("Digite el valor B")
        B = readLine()!!.toInt()
        if (A < B){
            result = A + B
            println("A es menor a B\nPor lo tanto la suma es de $result")
        }else {
            result = A * B
            println("A es menor o igual a B\nPor lo tanto el producto es de $result")
        }
    }
    fun division(){
        val A : Double
        val B : Double
        val result : Double
        println("Digite el numero A")
        A = readLine()!!.toDouble()
        println("Digite el valor B")
        B = readLine()!!.toDouble()
        if (B == 0.0){
            println("La divisón no es posible")
        }else{
            result = (A / B)
            println("La divsio da como resultado $result")
        }
    }

    fun addIfOneNegative(){
        var A = 0
        var B = 0
        var result = 0
        println("Digite el numero A")
        A = readLine()!!.toInt()
        println("Digite el valor B")
        B = readLine()!!.toInt()
        if (A < 0 || B < 0){
            result = A + B
            println("Uno de los números es negativo por lo lo cual la suma es de $result")
        }else{
            result = A * B
            println("Ninguno de los número es negativo por lo cual el producto es de $result")
        }
    }
    fun leapYear(){
        var year = 0
        year = readLine()!!.toInt()
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            println("Es un año bisiesto")
        }else{
            println("No es un año bisiesto")
        }
    }
    //Ciclos
    fun multipleOfThree(){
        for (i in 0..100){
            if (i % 3 === 0){
                println(i)
            }
        }
    }
    fun oddNumbers(){
        for (i in 0 ..100){
            if (i % 2 != 0){
                println(i)
            }
        }
    }
    fun evenNumbers(){
        for (i in 0 ..100){
            if (i % 2 === 0){
                println(i)
            }
        }
    }
    fun squareNumbers(){
        for (i in 1..30){
            println(i * i)
        }
    }
    fun sumOfSquareNumbers(){
        var acum = 0
        for (i in 0..100){
            acum += (i * i)
            println(acum)
        }
    }
    fun rangeOfNumbers(){
        var num1 = 0
        var num2 = 0
        println("ingrese el numero 1 (tiene que ser menor que el segundo)")
        num1 = readLine()!!.toInt()
        println("Ingrese el numero 2 (tiene que ser mayor que el primero)")
        num2 = readLine()!!.toInt()
        if (num1 < num2) {
            println("Números comprendidos entre $num1 y $num2:")
            for (i in num1..num2) {
                println(i)
            }
        } else {
            println("Los números ingresados no son válidos o el primero no es menor que el segundo.")
        }
    }

    fun sumOfNumbers(){
        var numberOfUser = 0
        var acum = 0
        do {
            println("Digite la cantidad de numero que desee si no desea seguir digite 0")
            numberOfUser = readLine()!!.toInt()
            acum += numberOfUser
        } while(numberOfUser != 0)
        println("El total es de: $acum")
    }

}




