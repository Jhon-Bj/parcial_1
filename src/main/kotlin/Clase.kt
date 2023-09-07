fun ejercicio1(args: Array<String>){
        var edad
        var sisben
        var nivel
        var descuento
        var persona
        var libreta = "350000"
        var cedula







        println("Libreta militar")

        println("digite su cedula: $cedula")
        println("digite su nivel de sisben: $sisben")




        if (sisben <=1 ) {

                println("el descuento de su libreta sera de: 40%: $ ")
        }else if ( sisben >2 ) {

                println("El descuento de su libreta sera de 30%")
        } else if (sisben >3 ) {

                println("El descuento de su libreta sera de 15%")
        }else if (sisben >=4){
                println("No palica descuento, por lo que el coste sera de: $libreta ")
        }

        if (edad == 18 && sisben<1) {
                println("El descuento de la libreta es de 60%")
        } else if (edad ==18&& sisben>2) {
                println("el descuento de la libreta sera de 40%")
        } else if (edad == 18 && sisben>3){
                println("el descuent de la libreta sra dw 20%git")
        }












}