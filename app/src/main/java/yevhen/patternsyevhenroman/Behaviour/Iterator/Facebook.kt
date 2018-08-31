package yevhen.patternsyevhenroman.Behaviour.Iterator

class Facebook : SocialNetwork {
    override fun createFriendsIterator(profileId: String): ProfileIterator {
        return FacebookIterator(this, profileId, "friends")
    }

    override fun createCoworkersIterator(profileId: String): ProfileIterator {
        return FacebookIterator(this, profileId, "coworkers")
    }

    fun sendSophisticatedSocialGraphRequest(profileId: String): Array<Profile> {
        return arrayOf()
    }
}