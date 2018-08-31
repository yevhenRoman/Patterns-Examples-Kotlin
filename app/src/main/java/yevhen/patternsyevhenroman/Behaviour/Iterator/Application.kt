package yevhen.patternsyevhenroman.Behaviour.Iterator

class Application {
    private val network: SocialNetwork
    private val spammer: SocialSpammer

    init {
        network = Facebook()
        spammer = SocialSpammer()
    }

    fun sendSpamToFriends(profile: Profile) {
        val iterator = network.createFriendsIterator(profile.email)
        spammer.send(iterator, "Spam")
    }

    fun sendSpamToCoworkers(profile: Profile) {
        val iterator = network.createCoworkersIterator(profile.email)
        spammer.send(iterator, "Spam")
    }
}