package fr.brilhante.joao.typescript.generator.nested.subtypes;

import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Dog extends Mammal {

    private String breed;
    private boolean isTrained;
    private List<Animal> friends;

    public Dog(String name, int age, String breed, boolean isTrained, List<Animal> friends) {
        super(name, age, 4);
        this.breed = breed;
        this.isTrained = isTrained;
        this.friends = new ArrayList<>(friends);
    }

}
