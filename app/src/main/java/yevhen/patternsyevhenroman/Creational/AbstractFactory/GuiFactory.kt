package yevhen.patternsyevhenroman.Creational.AbstractFactory

interface GuiFactory {
    fun createButton(): Button
    fun createCheckbox(): Checkbox
}