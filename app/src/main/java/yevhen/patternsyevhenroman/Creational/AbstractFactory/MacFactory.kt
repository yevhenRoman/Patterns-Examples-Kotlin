package yevhen.patternsyevhenroman.Creational.AbstractFactory

class MacFactory : GuiFactory {
    override fun createButton(): Button {
        return MacButton()
    }

    override fun createCheckbox(): Checkbox {
        return MacCheckbox()
    }
}