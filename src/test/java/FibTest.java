import org.junit.jupiter.api.Test;

public class FibTest {

    @Test
    void shouldReturn257114(){

        System.out.println(Fib.fibbonachi(1000000));
    }

    @Test
    void shouldReturn60696(){

        System.out.println(Fib.fibbonachi(500000));
    }

    @Test
    void shouldReturn1089154(){

        System.out.println(Fib.fibbonachi(2300000));
    }
}
