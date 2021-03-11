import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {
    @Test
    void successTest(){
        assertEquals(true,true);
        //assertTrue(true);

    }

  @Test
  void negativeTest(){
       assertEquals(true,false);

    }
    @Test
    @DisplayName("Some positive test")
    void successWithHamcrestAndStepsTest(){
        assertThat(true, is(true));

        //assertTrue(true);

    }

    @Test
    @DisplayName("some negative test")
    void negativeWithHamcrestAndStepsTest(){
        assertThat(true, is(false));

    }
}
