package hello.external;

import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

@Slf4j
public class JavaSystemProperties {
    public static void main(String[] args) {
        System.setProperty("hello_key", "hello_value");
        String helloKey = System.getProperty("hello_key");
        log.info("hello_key: {}", helloKey);

        Properties properties = System.getProperties();
        properties.forEach((key, value) -> log.info("property: {}={}", key, value));

        String url = System.getProperty("url");
        String username = System.getProperty("username");
        String password = System.getProperty("password");

        log.info("url: {}", url);
        log.info("username: {}", username);
        log.info("password: {}", password);

    }
}
