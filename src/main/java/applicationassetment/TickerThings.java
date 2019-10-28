package applicationassetment;

public class TickerThings {
   private long timestamp;
   private boolean success;
   private String error;
   private Ticker ticker;

   public long getTimestamp() {
      return timestamp;
   }

   public void setTimestamp(long timestamp) {
      this.timestamp = timestamp;
   }

   public boolean isSuccess() {
      return success;
   }

   public void setSuccess(boolean success) {
      this.success = success;
   }

   public String getError() {
      return error;
   }

   public void setError(String error) {
      this.error = error;
   }

   public Ticker getTicker() {
      return ticker;
   }

   public void setTicker(Ticker ticker) {
      this.ticker = ticker;
   }

   public TickerThings(Ticker ticker , long timestamp, boolean success, String error) {
      this.timestamp = timestamp;
      this.success = success;
      this.error = error;
      this.ticker = ticker;
   }

   public TickerThings(){

   }

   @Override
   public String toString() {
      return "TickerThings{" +
              "timestamp=" + timestamp +
              ", success=" + success +
              ", error='" + error + '\'' +
              ", ticker=" + ticker;
   }
}
