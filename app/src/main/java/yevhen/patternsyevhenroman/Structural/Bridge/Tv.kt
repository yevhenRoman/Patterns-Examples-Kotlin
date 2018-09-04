package yevhen.patternsyevhenroman.Structural.Bridge

class Tv : Device{
    override fun isEnabled(): Boolean {
        return true
    }

    override fun enable() {

    }

    override fun disable() {

    }

    override fun getVolume() {

    }

    override fun setVolume(percent: Int) {

    }

    override fun getChannel(): Long {
        return 0L
    }

    override fun setChannel(channel: Long) {

    }

}