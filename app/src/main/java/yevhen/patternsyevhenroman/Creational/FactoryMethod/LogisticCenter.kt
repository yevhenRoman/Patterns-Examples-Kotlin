package yevhen.patternsyevhenroman.Creational.FactoryMethod

class LogisticCenter {
    var logistics: Logistics? = null

    fun send(shipment: String) {
        sort(shipment)
        val transport = logistics?.createTransportDelivery()
        transport?.deliver(shipment)
    }

    private fun sort(type: String) {
        if (type == "") {
            logistics = SeaLogistics()
        } else {
            logistics = RoadLogistics()
        }
    }
}