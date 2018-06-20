package example;

import static org.junit.Assert.*;

import com.migu.schedule.info.TaskInfo;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class OneTest {
  @Test
  public void testFoo() throws Exception {
    One one = new One();
    //Test foo
    assertEquals("foo", one.foo());
  }

  @Test
  public void t(){
    LinkedList nodes = new LinkedList<Map<Integer, Integer>>();
    Map<Integer, Integer> map=new HashMap<Integer, Integer>();
    map.put(1,1);
    Map<Integer, Integer> map1=new HashMap<Integer, Integer>();
    map1.put(1,1);
    nodes.addFirst(map);
    System.out.println(nodes.indexOf(map1));
    System.out.println("-----------------");

    LinkedList n=new LinkedList<TaskInfo>();
    TaskInfo a=new TaskInfo();
    a.setNodeId(1);
    a.setTaskId(2);
    n.add(a);
    TaskInfo b=new TaskInfo();
    b.setNodeId(1);
    b.setTaskId(2);
    System.out.println(n.indexOf(b));



  }
}