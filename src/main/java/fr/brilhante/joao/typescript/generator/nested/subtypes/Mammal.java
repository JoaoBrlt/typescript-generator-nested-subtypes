package fr.brilhante.joao.typescript.generator.nested.subtypes;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Cat.class, name = "Cat"),
        @JsonSubTypes.Type(value = Dog.class, name = "Dog")
})
public abstract class Mammal extends Animal {

    private int numberOfLegs;

    protected Mammal(String name, int age, int numberOfLegs) {
        super(name, age);
        this.numberOfLegs = numberOfLegs;
    }

}
