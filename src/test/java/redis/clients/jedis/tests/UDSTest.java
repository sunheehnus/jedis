package redis.clients.jedis.tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.tests.HostAndPortUtil;

public class UDSTest {
  protected static String udsHost = HostAndPortUtil.getUDSServers().get(0);
  
  @Test
  public void testCompareTo() { 
    Jedis jedis;
    jedis = new Jedis(udsHost);
    assertEquals("PONG", jedis.ping());
    jedis.close();
  }
}
