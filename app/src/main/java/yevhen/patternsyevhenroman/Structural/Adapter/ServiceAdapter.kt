package yevhen.patternsyevhenroman.Structural.Adapter

class ServiceAdapter : SendServiceInterface {
    val adaptee = Service()

    override fun send(data: CharSequence) {
        val adaptedData = convert(data)
        adaptee.send(adaptedData)
    }

    private fun convert(data: CharSequence): String {
        return data.toString()
    }
}
