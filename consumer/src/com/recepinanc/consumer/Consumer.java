package com.recepinanc.consumer;

import com.recepinanc.alternativeimplementation.messenger.AlternativeMessenger;
import com.recepinanc.api.messenger.Messenger;
import com.recepinanc.consumer.implementation.ConsumerMessenger;
import com.recepinanc.implementation.messenger.FormalMessenger;

/**
 * Consumer depends on the api module.
 * Consumer can choose to implement the api module's interface itself.
 * Consumer can use the FormalMessenger by adding the requires statement for that module.
 * Consumer can use the AlternativeMessenger by adding the requires statement for that module.
 * <p>
 * As `implementation` module encapsulates its packages carefully, and only exposes com.recepinanc.implementation
 * Consumer is only able to access to FormalMessenger class and cannot access to what's in other packages (such as util)
 */
public class Consumer {

    private final Messenger messenger;
    private final String name;
    private final String message;

    public Consumer(Messenger messenger, String name, String message) {
        this.messenger = messenger;
        this.name = name;
        this.message = message;
    }

    public String fullMessage() {
        return this.messenger.greetWithMessage(this.name, this.message);
    }

    public static void main(String[] args) {
        String name = "Recep";
        String message = "Welcome to the world of modules!";

        Messenger messenger = new FormalMessenger();
        Consumer consumer = new Consumer(messenger, name, message);
        System.out.println(consumer.fullMessage());

        Messenger alternativeMessenger = new AlternativeMessenger();
        Consumer alternativeConsumer = new Consumer(alternativeMessenger, name, message);
        System.out.println(alternativeConsumer.fullMessage());

        Messenger consumerMessenger = new ConsumerMessenger();
        Consumer ownConsumer = new Consumer(consumerMessenger, name, message);
        System.out.println(ownConsumer.fullMessage());
    }
}
