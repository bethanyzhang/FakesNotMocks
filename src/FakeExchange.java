public class FakeExchange implements Exchange {
  @Override
  public float rate(String origin, String target) {
      if (origin.equals("USD") && target.equals("Euro")) {
          return 0.85f; 
      } else if (origin.equals("USD") && target.equals("JPY")) {
          return 110.0f; 
      }
      return 1.0f; 
  }
}
