package yevhen.patternsyevhenroman.Creational.AbstractFactory

class Application(factory: GuiFactory) {
    private lateinit var button: Button
    private lateinit var checkbox: Checkbox
    private var factory: GuiFactory = factory

    init {
        createUi()
    }

    private fun createUi() {
        button = factory.createButton()
        button.paint()
        checkbox = factory.createCheckbox()
        checkbox.paint()
    }
}