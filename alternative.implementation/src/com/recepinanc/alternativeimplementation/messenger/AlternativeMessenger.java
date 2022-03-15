package com.recepinanc.alternativeimplementation.messenger;

import com.recepinanc.api.messenger.Messenger;

public class AlternativeMessenger implements Messenger {
    @Override
    public String greetWithMessage(String name, String message) {
        return String.format("Hey %s! %s", name, message);
    }
}
