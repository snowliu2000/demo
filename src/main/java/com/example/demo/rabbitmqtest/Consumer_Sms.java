package com.example.demo.rabbitmqtest;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author lsl
 * @Date:2019/4/5
 * @Time:15:23
 */
public class Consumer_Sms {
    private static final String QUEUE_INFORM_SMS = "queue_inform_sms";
    private static final String EXCHANGE_FANOUT_INFORM = "exchange_fanout_inform";

    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("127.0.0.1");
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");
        connectionFactory.setVirtualHost("/");

        Connection connection = null;
        try {
            connection = connectionFactory.newConnection();
            Channel channel = connection.createChannel();
            // 声明队列
            channel.queueDeclare(QUEUE_INFORM_SMS, true, false, false, null);
            channel.exchangeDeclare(EXCHANGE_FANOUT_INFORM, BuiltinExchangeType.FANOUT);
            channel.queueBind(QUEUE_INFORM_SMS, EXCHANGE_FANOUT_INFORM, "");
            DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {
                // 当接受到消息此方法将会被调用

                /**
                 *
                 * @param consumerTag 消费者标签
                 * @param envelope 信封
                 * @param properties 消息的属性
                 * @param body 消息内容
                 * @throws IOException
                 */
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
          /*
           // 交换机
                   String exchange = envelope.getExchange();
                   // 消息ID， mq在通道中，用来标识消息的ID，可用于确认消息已接收
                   long deliveryTag = envelope.getDeliveryTag();
           */
                    // 消息内容
                    String mesaage = new String(body, StandardCharsets.UTF_8);
                    System.out.println("receive message: " + mesaage);
                }
            };

            // 监听队列
            channel.basicConsume(QUEUE_INFORM_SMS, true, defaultConsumer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
