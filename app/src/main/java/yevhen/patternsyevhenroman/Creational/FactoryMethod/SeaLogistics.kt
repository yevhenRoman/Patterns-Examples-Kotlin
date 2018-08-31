package yevhen.patternsyevhenroman.Creational.FactoryMethod

class SeaLogistics : Logistics() {
    override fun createTransportDelivery(): Transport {
        return Ship()
    }
}