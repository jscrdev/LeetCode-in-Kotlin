package g0501_0600.s0550_game_play_analysis_iv

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import org.zapodot.junit.db.annotations.EmbeddedDatabase
import org.zapodot.junit.db.annotations.EmbeddedDatabaseTest
import org.zapodot.junit.db.common.CompatibilityMode
import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.FileReader
import java.sql.SQLException
import java.util.stream.Collectors
import javax.sql.DataSource

@EmbeddedDatabaseTest(
    compatibilityMode = CompatibilityMode.MySQL,
    initialSqls = [
        "CREATE TABLE Activity(player_id INTEGER, device_id INTEGER" +
            ", event_date DATETIME, games_played INTEGER); " +
            "INSERT INTO Activity(player_id, device_id" +
            ", event_date, games_played)" +
            " VALUES (1, 2, '2016-03-01', 5); " +
            "INSERT INTO Activity(player_id, device_id" +
            ", event_date, games_played)" +
            " VALUES (1, 2, '2016-03-02', 6); " +
            "INSERT INTO Activity(player_id, device_id" +
            ", event_date, games_played)" +
            " VALUES (2, 3, '2017-06-25', 1); " +
            "INSERT INTO Activity(player_id, device_id" +
            ", event_date, games_played)" +
            " VALUES (3, 1, '2016-03-02', 0); " +
            "INSERT INTO Activity(player_id, device_id" +
            ", event_date, games_played)" +
            " VALUES (3, 4, '2018-07-03', 5); ",
    ],
)
internal class MysqlTest {
    @Test
    @Throws(SQLException::class, FileNotFoundException::class)
    fun testScript(@EmbeddedDatabase dataSource: DataSource) {
        dataSource.connection.use { connection ->
            connection.createStatement().use { statement ->
                statement.executeQuery(
                    BufferedReader(
                        FileReader(
                            "src/main/kotlin/g0501_0600/" +
                                "s0550_game_play_analysis_iv/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("0.33"))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
