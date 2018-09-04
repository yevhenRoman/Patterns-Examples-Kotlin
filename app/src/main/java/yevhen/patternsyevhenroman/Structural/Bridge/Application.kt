package yevhen.patternsyevhenroman.Structural.Bridge

class Application {
    val tv = Tv()
    val tvRemote = Remote(tv)

    fun doStuff() {
        tvRemote.togglePower()
    }
}