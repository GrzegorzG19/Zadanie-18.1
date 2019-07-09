import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibTest {

    @Test
    void shouldReturn257114(){


        Assertions.assertThat(Fib.fibbonachi(1000000)).isEqualTo(257114);
    }

    @Test
    void shouldReturn60696(){

        Assertions.assertThat(Fib.fibbonachi(500000)).isEqualTo(60696);
    }

    @Test
    void shouldReturn1089154(){

        Assertions.assertThat(Fib.fibbonachi(2300000)).isEqualTo(1089154);
    }
}
