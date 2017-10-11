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

fun anagrams(w : CharArray, n :Int) {
	if (n == 0) {
		println(String(w))
	}
	else for (i in 0..n) {
		var j : Int
		anagrams(w,n-1)
		if (n%2==0) j = 0 else j = i
		val temp = w[j]
		w[j] = w[n]
		w[n] = temp
	}
}

	

