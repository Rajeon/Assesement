package applicationassetment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class ScheduledThings {
    private static final Logger log = LoggerFactory.getLogger(ScheduledThings.class);
    RestTemplate restTemplate= new RestTemplate();

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        TickerThings ticker = restTemplate.getForObject(
                "https://api.cryptonator.com/api/ticker/btc-usd", TickerThings.class);
        log.info(ticker.toString());
    }
}
