package com.strategy.pattern.demo;


import com.strategy.pattern.demo.context.Encryptor;
import com.strategy.pattern.demo.concrete.strategy.AesEncryptionStrategy;
import com.strategy.pattern.demo.concrete.strategy.BlowfishEncryptionStrategy;
import com.strategy.pattern.demo.strategy.EncryptionStrategy;
import org.junit.jupiter.api.Test;

public class EncryptorTest {
    @Test
    public void testEncrypt() throws Exception {
        EncryptionStrategy aesStrategy = new AesEncryptionStrategy();
        Encryptor aesEncryptor = new Encryptor(aesStrategy);

        aesEncryptor.setPlainText("This is plain text");
        aesEncryptor.encrypt();


        EncryptionStrategy blowfishStrategy=new BlowfishEncryptionStrategy();
        Encryptor blowfishEncryptor = new Encryptor(blowfishStrategy);

        blowfishEncryptor.setPlainText("This is plain text");
        blowfishEncryptor.encrypt();
    }
}
