fun main(args: Array<String>) {
    println("Hello World!")
}

fun triangles() {
    for (c in 1..40) {
        for (b in 1..c) {
            for (a in 1..b){
                if (a*a + b*b == c*c) {
                    println("$a,$b,$c")
                } 
            }
        }
    }
}

// fun anagrams(a : String, n : Int ) {
//     if (n == 0) {

//     }
// }


