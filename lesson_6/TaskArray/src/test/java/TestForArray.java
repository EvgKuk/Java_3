import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestForArray {
    @Test
    public void number1TestArrayAfter4(){
        int[] in = new int[]{1, 2, 3, 5, 4, 5, 7, 10};
        int[] out = new int[]{5, 7, 10};
        Assertions.assertArrayEquals(out, MethodsForArray.returnArray(in));
    }

    @Test
    public void number2TestArrayAfter4(){
        int[] in = new int[]{1, 2, 3, 4, 5, 6, 4};
        int[] out = new int[]{ };
        Assertions.assertArrayEquals(out, MethodsForArray.returnArray(in));
    }

    @Test
    public void number3TestArrayAfter4(){
        int[] in = new int[]{1, 2, 44, 3};
        Assertions.assertThrows(RuntimeException.class, ()->MethodsForArray.returnArray(in));
    }

    @Test
    public void number1TestArrayOf1and4(){
        int[] in = new int[]{1, 1, 1, 4, 4, 1, 4, 4};
        Assertions.assertTrue(MethodsForArray.checkArrayOf1and4(in));
    }

    @Test
    public void number2TestArrayOf1and4(){
        int[] in = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        Assertions.assertFalse(MethodsForArray.checkArrayOf1and4(in));
    }

    @Test
    public void number3TestArrayOf1and4(){
        int[] in = new int[]{4, 4, 4, 4, 4, 4, 4, 4};
        Assertions.assertFalse(MethodsForArray.checkArrayOf1and4(in));
    }

    @Test
    public void number4TestArrayOf1and4(){
        int[] in = new int[]{1, 4, 1, 4, 3, 1, 4, 4};
        Assertions.assertFalse(MethodsForArray.checkArrayOf1and4(in));
    }


}
