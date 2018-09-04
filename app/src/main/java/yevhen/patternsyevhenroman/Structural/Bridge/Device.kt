package yevhen.patternsyevhenroman.Structural.Bridge

interface Device {
    fun isEnabled(): Boolean
    fun enable()
    fun disable()
    fun getVolume()
    fun setVolume(percent: Int)
    fun getChannel(): Long
    fun setChannel(channel: Long)
}