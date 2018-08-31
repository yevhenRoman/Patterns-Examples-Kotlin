package yevhen.patternsyevhenroman.Behaviour.Iterator

interface SocialNetwork {
    fun createFriendsIterator(profileId: String) : ProfileIterator
    fun createCoworkersIterator(profileId: String) : ProfileIterator
}