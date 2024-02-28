package design_patterns.strategy_pattern_exercise;

public  class  Encoder {

    ICipherStrategy cipherStrategy;
    public Encoder() {

    }

    public void setCipherStrategy (ICipherStrategy cipher)
    {
        cipherStrategy = cipher;
    }
    public String completeCipher (String input)
    {
       return cipherStrategy.encode(input);
    }

}
