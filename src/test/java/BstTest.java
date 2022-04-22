import com.keyin.bst.Bst;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BstTest {

    // Initialize instance of Bst
    Bst tree = new Bst();

    // Insert Values in tree
    @BeforeEach
    void setUp() throws Exception {
        tree.root = tree.insertNode(tree.root, 37);
        tree.root = tree.insertNode(tree.root, 16);
        tree.root = tree.insertNode(tree.root, 58);
        tree.root = tree.insertNode(tree.root, 10);
        tree.root = tree.insertNode(tree.root, 23);
        tree.root = tree.insertNode(tree.root, 64);
        tree.root = tree.insertNode(tree.root, 7);
        tree.root = tree.insertNode(tree.root, 13);
    }

    @Test
    void testValueExistsIn() {
        //boolean node = tree.Contains(tree.root, 4);

        Assertions.assertTrue(tree.Contains(tree.root, 64));
    }

    @Test
    void testSearchBST() {
        Assertions.assertEquals(true, tree.search(58));
    }

    @Test
    void testSearchNotFoundBST() {
        Assertions.assertEquals(false, tree.search(12));
    }
}
