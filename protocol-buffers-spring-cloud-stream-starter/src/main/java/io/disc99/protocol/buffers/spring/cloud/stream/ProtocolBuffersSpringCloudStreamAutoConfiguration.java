package io.disc99.protocol.buffers.spring.cloud.stream;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.stream.annotation.StreamMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MessageConverter;

@Configuration
@ConditionalOnClass(StreamMessageConverter.class)
public class ProtocolBuffersSpringCloudStreamAutoConfiguration {
    @Bean
    @StreamMessageConverter
    public MessageConverter protobufMessageConverter() {
        return new ProtobufMessageConverter();
    }
}
