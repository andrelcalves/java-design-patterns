package Factory.exampleEncryptor;

public class EncryptorFactory {
    public Encryptor encryptorFactory(EncyptorType encyptorType){
        switch (encyptorType){
            case JWE -> {
                return new JweEncryptor();
            }
            case RSA -> {
                return new RSAEncryptor();
            }
            default ->
                throw new IllegalArgumentException("Unknown Encryptor type " + encyptorType);
        }
    }
}
