package hw04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathBalanceTest {

    @Test
    void isBalanced() {
        MathBalance mathBalance = new MathBalance();

        assertTrue(mathBalance.isBalanced("(){}[]()[]{}"));
        assertTrue(mathBalance.isBalanced("({[]})"));
        assertTrue(mathBalance.isBalanced("[]{}({[]})"));
        assertTrue(mathBalance.isBalanced("(((((())))))"));
        assertTrue(mathBalance.isBalanced("[[=-[[[4324[]]]]]]"));
        assertTrue(mathBalance.isBalanced("{bcbx{{gfdgds{{{}}}4234}}}"));
        assertTrue(mathBalance.isBalanced("()({}{sdfgdfg}()()[5345345]{})([])"));
        assertTrue(mathBalance.isBalanced(""));
        assertTrue(mathBalance.isBalanced("vsfvsdv"));
        assertTrue(mathBalance.isBalanced("{fdsfd}"));

        assertFalse(mathBalance.isBalanced("[]{"));
        assertFalse(mathBalance.isBalanced(")))))))))))"));
        assertFalse(mathBalance.isBalanced("((((((((((((("));
        assertFalse(mathBalance.isBalanced("()()({}{}[[}()()"));
        assertFalse(mathBalance.isBalanced(null));
    }
}