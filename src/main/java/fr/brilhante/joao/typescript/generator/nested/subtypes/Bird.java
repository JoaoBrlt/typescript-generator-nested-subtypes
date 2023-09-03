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
        @JsonSubTypes.Type(value = Parrot.class, name = "Parrot"),
        @JsonSubTypes.Type(value = Duck.class, name = "Duck")
})
public abstract class Bird extends Animal {

    private boolean canFly;
    private boolean canSwim;

    protected Bird(String name, int age, boolean canFly, boolean canSwim) {
        super(name, age);
        this.canFly = canFly;
        this.canSwim = canSwim;
    }

}
