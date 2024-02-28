import design_patterns.adapter_exercise.IAdult;
import design_patterns.adapter_exercise.Pensioner;
import design_patterns.adapter_exercise.PensionerAdapter;
import design_patterns.builder_example.*;
import design_patterns.factory_example.*;
import design_patterns.singleton_exercise.GuessTheNumber;
import design_patterns.strategy_pattern_exercise.CaeserCipher;
import design_patterns.strategy_pattern_exercise.Encoder;


public class Main {
    public static void main(String[] args) {

        IAdult adapter = new PensionerAdapter(new Pensioner("hy", 25));
        adapter.toString();

       Encoder en = new Encoder();
        en.setCipherStrategy( new CaeserCipher());
        en.completeCipher(" ");
    }
}