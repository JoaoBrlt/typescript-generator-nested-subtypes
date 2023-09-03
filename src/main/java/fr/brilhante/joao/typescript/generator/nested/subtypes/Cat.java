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
public class Cat extends Mammal {

    private String breed;
    private String favoriteMeal;
    private List<Cat> children;

    public Cat(String name, int age, String breed, String favoriteMeal, List<Cat> children) {
        super(name, age, 4);
        this.breed = breed;
        this.favoriteMeal = favoriteMeal;
        this.children = new ArrayList<>(children);
    }

}
