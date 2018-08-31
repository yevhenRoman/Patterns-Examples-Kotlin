package yevhen.patternsyevhenroman.Creational.FactoryMethod

class RoadLogistics : Logistics() {
    override fun createTransportDelivery(): Transport {
        // тут може бути вибір певної конкретного транспорту
        // наприклад якщо в нас є декілька видів дорожнього транспорту
        // Тут ми можемо перевірити який саме доступний і "виплюнути" необхідний

        return Truck()
    }
}