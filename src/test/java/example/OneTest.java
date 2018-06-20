package example;

import static org.junit.Assert.*;
import org.junit.Test;

public class OneTest {
  @Test
  public void testFoo() throws Exception {
    One one = new One();
    System.out.println("OneTest.testFoo");

    //Test foo
    assertEquals("foo1", one.foo());
  }

  @Test
  public void t(){

  }
}