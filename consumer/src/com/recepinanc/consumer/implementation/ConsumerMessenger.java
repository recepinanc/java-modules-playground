package com.recepinanc.consumer.implementation;

import com.recepinanc.api.messenger.Messenger;

public class ConsumerMessenger implements Messenger {
    @Override
    public String greetWithMessage(String name, String message) {
        String consumerMessage = "We can implement this method ourselves...";
        return String.format("Hey %s! %s. %s.", name, consumerMessage, message);
    }
}
