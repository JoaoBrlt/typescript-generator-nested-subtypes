package fr.brilhante.joao.typescript.generator.nested.subtypes;

import java.util.ArrayList;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Parrot extends Bird {

    private boolean canTalk;
    private List<String> vocabulary;

    public Parrot(
            String name,
            int age,
            boolean canTalk,
            List<String> vocabulary
    ) {
        super(name, age, true, false);
        this.canTalk = canTalk;
        this.vocabulary = new ArrayList<>(vocabulary);
    }

}
