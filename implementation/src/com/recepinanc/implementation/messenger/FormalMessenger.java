package com.recepinanc.implementation.messenger;

import com.recepinanc.api.messenger.Messenger;
import com.recepinanc.implementation.util.PrepareMessage;

/**
 * This class depends on the api module to implement
 * To be able to implement the greetWithMessage method we added requires api statement in module-info.java
 * The package this class is located is exposed in the module-info.java so that the consumer module can use it.
 */
public class FormalMessenger implements Messenger {
    @Override
    public String greetWithMessage(String name, String message) {
        String preparedName = PrepareMessage.prepare(name);
        return String.format("Greetings %s. %s", preparedName, message);
    }
}
