package yevhen.patternsyevhenroman.Behaviour.Iterator

class FacebookIterator(network: Facebook, id: String, type: String) : ProfileIterator{
    private val facebook = network
    private val profileId = id
    private val fbType = type
    private var currentPos: Int = 0
    private var cache: Array<Profile>? = null


    override fun getNext(): Profile? {
        if (hasMore()) {
            ++currentPos
            return cache?.get(currentPos)
        }
        return null
    }

    override fun hasMore(): Boolean {
        lazyInit()
        return cache?.get(currentPos) != null
    }

    private fun lazyInit() {
        if (cache == null) {
            cache = facebook.sendSophisticatedSocialGraphRequest(profileId)
        }
    }
}