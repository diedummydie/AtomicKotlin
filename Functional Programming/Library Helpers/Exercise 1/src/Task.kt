package libraryHelpers1

class X {
    var first = 0
    var second = 0
    var third = 0
}

fun example1(x: X) {
    
    x.let {
        it.first = 1
        it.second = 2
        it.third = 3
    }
    
}

class Y {
    fun start() {}
    fun finish() {}
}

fun example2(y: Y?) {
    
    y?.let {
        with(it) {
            start()
            finish()
        }
    }
    
}

class Z {
    fun init() {}
}

fun example3(z: Z) {
    
    val result = with(z) {
        init()
        this
    }
    
}

fun main(args: Array<String>) {
    example1(X())
    example2(Y())
    example3(Z())
}