package com.strategy.pattern.demo.context;

import com.strategy.pattern.demo.strategy.EncryptionStrategy;

public class Encryptor {

    private EncryptionStrategy strategy;
    private String plainText;

    public Encryptor(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public void encrypt() {
        strategy.encryptData(plainText);
    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

}
