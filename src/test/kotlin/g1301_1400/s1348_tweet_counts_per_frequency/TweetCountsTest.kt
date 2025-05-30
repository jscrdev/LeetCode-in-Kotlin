package g1301_1400.s1348_tweet_counts_per_frequency

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class TweetCountsTest {
    @Test
    fun tweetCountsTest() {
        val tweetCounts = TweetCounts()
        tweetCounts.recordTweet("tweet3", 0)
        tweetCounts.recordTweet("tweet3", 60)
        tweetCounts.recordTweet("tweet3", 10)
        assertThat(
            tweetCounts.getTweetCountsPerFrequency("minute", "tweet3", 0, 59),
            equalTo(listOf(2)),
        )
        assertThat(
            tweetCounts.getTweetCountsPerFrequency("minute", "tweet3", 0, 60),
            equalTo(mutableListOf(2, 1)),
        )
        tweetCounts.recordTweet("tweet3", 120)
        assertThat(
            tweetCounts.getTweetCountsPerFrequency("hour", "tweet3", 0, 210),
            equalTo(listOf(4)),
        )
    }
}
