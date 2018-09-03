package yevhen.patternsyevhenroman.Behaviour.Iterator

class SocialSpammer {
    fun send(iterator: ProfileIterator, message: String) {
        while (iterator.hasMore()) {
            val profile = iterator.getNext()
            System.console().writer().print("SendOnEmail=$" + profile?.email.toString() + "This message: " + message)
        }
    }
}