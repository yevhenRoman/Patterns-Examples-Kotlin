package yevhen.patternsyevhenroman.Creational.AbstractFactory

class WinFactory : GuiFactory{
    override fun createButton(): Button {
        return WinButton()
    }

    override fun createCheckbox(): Checkbox {
        return WinCheckbox()
    }
}