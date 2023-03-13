package com.microservices.demo.twitter.to.kafka.service;

import com.microservices.demo.twitter.to.kafka.service.config.TwitterToKafkaServiceConfigData;
import java.util.Arrays;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@AllArgsConstructor
@SpringBootApplication
public class TwitterToKafkaServiceApplication implements CommandLineRunner {

  private static final Logger LOG = LoggerFactory.getLogger(TwitterToKafkaServiceApplication.class.getName());
  private final TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData;

  public static void main(String[] args) {
    SpringApplication.run(TwitterToKafkaServiceApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    LOG.info("App starts...");
    LOG.info(Arrays.toString(twitterToKafkaServiceConfigData.getTwitterKeywords().toArray()));
    LOG.info(twitterToKafkaServiceConfigData.getWelcomeMessage());
  }
}
