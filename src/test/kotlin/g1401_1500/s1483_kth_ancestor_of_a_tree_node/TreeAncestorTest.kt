package g1401_1500.s1483_kth_ancestor_of_a_tree_node

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class TreeAncestorTest {
    @Test
    fun treeAncestor() {
        val treeAncestor = TreeAncestor(7, intArrayOf(-1, 0, 0, 1, 1, 2, 2))
        assertThat(treeAncestor.getKthAncestor(3, 1), equalTo(1))
        assertThat(treeAncestor.getKthAncestor(5, 2), equalTo(0))
        assertThat(treeAncestor.getKthAncestor(6, 3), equalTo(-1))
    }

    @Test
    fun treeAncestor2() {
        val treeAncestor = TreeAncestor(
            21,
            intArrayOf(
                -1, 0, 0, 1, 1, 2, 2, -1, 0, 0, 1, 1, 2, 2, -1, 0, 0, 1, 1, 2, 2,
            ),
        )
        assertThat(treeAncestor.getKthAncestor(3, 1), equalTo(1))
        assertThat(treeAncestor.getKthAncestor(5, 2), equalTo(0))
        assertThat(treeAncestor.getKthAncestor(6, 3), equalTo(-1))
    }
}
