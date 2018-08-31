package yevhen.patternsyevhenroman.Behaviour.Iterator

interface ProfileIterator {
    fun getNext(): Profile?
    fun hasMore(): Boolean
}