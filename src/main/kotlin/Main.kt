fun main(args: Array<String>) {
    val example = Exercises()
    do {
        println("Ingrese la opción que desea realizar\n1.Operadores\n2.Condicionales\n3.Ciclos\n99. salir")
        var optionUser = readLine()!!.toInt()
        //Menú principal
        when (optionUser){
            //Menú operadores
            1 -> {
                while(optionUser != 99) {
                    optionUser = 0
                    println("Ingrese la opción deseada\n1.area del triangulo\n2.Suma de dos número\n3.Número al cuadrado\n4.Euros a dolares\n5.Areá y perimetro de un cuadrado\n6.Area y volumen de un cilindro\n7.Longitud y area de una circunferencia\n8.Promedio de tres números\n99.Salir")
                    optionUser = readLine()!!.toInt()
                    when (optionUser){
                        1 -> example.triangleArea()
                        2 -> example.adittion()
                        3 -> example.numSquared()
                        4 -> example.euroToDollar()
                        5 -> example.areaPerimeterOfSquare()
                        6 -> example.areaVolumenOfCilinder()
                        7 -> example.areaVolumenOfCircle()
                        8 -> example.promThreeNumbers()
                        99 -> {
                            optionUser = 0
                            println("Hasta luego")
                            break
                        }
                    }
                }
            }
            //Menú condicionales
            2 -> {
                optionUser = 0
                while(optionUser != 99) {
                    optionUser = 0
                    println("Ingrese la opción deseada\n1.número positivio o negativo\n2.Dos número cual es mayor y menor\n3.tres numeros mayor y menor\n4.Sumar A y B si A < B sino multiplicarlos\n5.A y B cociente si B no es 0 \n6.Sumar A y B si uno es negativo y sino multiplicarlos\n7.Saber si un año es bisiesto\n99.Salir")
                    optionUser = readLine()!!.toInt()
                    when (optionUser){
                        1 -> example.positiveOrNegative()
                        2 -> example.greaterOrLess()
                        3 -> example.greateAndLess()
                        4 -> example.addOrSubtract()
                        5 -> example.division()
                        6 -> example.addIfOneNegative()
                        7 -> example.leapYear()
                        99 -> {
                            optionUser = 0
                            println("Hasta luego")
                            break
                        }
                    }
                }
            }
            //Menú ciclos
            3 -> {
                optionUser = 0
                while(optionUser != 99) {
                    optionUser = 0
                    println("Ingrese la opción deseada\n1.Multiplos de 3 hasta 100\n2.Números impares hasta el 100\n3.Números Impares hasta el 100\n4.Cuadrados de los numeros hasta el 30\n5.Suma de los cuadrados hasta el 100\n6.Rango de 2 números que digite el usuario\n7.Suma de los número digitados hasta que digite cero\n99.Salir")
                    optionUser = readLine()!!.toInt()
                    when (optionUser){
                        1 -> example.multipleOfThree()
                        2 -> example.oddNumbers()
                        3 -> example.evenNumbers()
                        4 -> example.squareNumbers()
                        5 -> example.sumOfSquareNumbers()
                        6 -> example.rangeOfNumbers()
                        7 -> example.sumOfNumbers()
                        99 -> {
                            optionUser = 0
                            println("Hasta luego")
                            break
                        }
                    }
                }
            }

        }
    } while (optionUser != 99)
}