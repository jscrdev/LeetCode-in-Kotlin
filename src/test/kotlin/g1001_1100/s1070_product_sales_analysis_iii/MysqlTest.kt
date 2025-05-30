package g1001_1100.s1070_product_sales_analysis_iii

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
        "CREATE TABLE Sales(sale_id INTEGER, product_id INTEGER," +
            " sale_year INTEGER, quantity INTEGER, price INTEGER); " +
            "INSERT INTO Sales(sale_id, product_id, sale_year, quantity, price)" +
            " VALUES (1, 100, 2008, 10, 5000); " +
            "INSERT INTO Sales(sale_id, product_id, sale_year, quantity, price)" +
            " VALUES (2, 100, 2009, 12, 5000); " +
            "INSERT INTO Sales(sale_id, product_id, sale_year, quantity, price)" +
            " VALUES (7, 200, 2011, 15, 9000); " +
            "CREATE TABLE Product(product_id INTEGER, product_name VARCHAR); " +
            "INSERT INTO Product(product_id, product_name)" +
            " VALUES (100, 'Nokia'); " +
            "INSERT INTO Product(product_id, product_name)" +
            " VALUES (200, 'Apple'); " +
            "INSERT INTO Product(product_id, product_name)" +
            " VALUES (300, 'Samsung'); ",
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
                            "src/main/kotlin/g1001_1100/s1070_product_sales_analysis_iii" +
                                "/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(100))
                    assertThat(resultSet.getInt(2), equalTo(2008))
                    assertThat(resultSet.getInt(3), equalTo(10))
                    assertThat(resultSet.getInt(4), equalTo(5000))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(200))
                    assertThat(resultSet.getInt(2), equalTo(2011))
                    assertThat(resultSet.getInt(3), equalTo(15))
                    assertThat(resultSet.getInt(4), equalTo(9000))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
