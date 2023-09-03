/* tslint:disable */
/* eslint-disable */
// Generated using typescript-generator version 3.2.1263 on 2023-09-03 16:47:53.

export interface Animal {
    type: "Cat" | "Dog" | "Parrot" | "Duck";
    name: string;
    age: number;
}

export interface Mammal extends Animal {
    type: "Cat" | "Dog";
    numberOfLegs: number;
}

export interface Bird extends Animal {
    type: "Parrot" | "Duck";
    canFly: boolean;
    canSwim: boolean;
}

export interface Cat extends Mammal {
    type: "Cat";
    breed: string;
    favoriteMeal: string;
    children: Cat[];
}

export interface Dog extends Mammal {
    type: "Dog";
    breed: string;
    friends: AnimalUnion[];
    trained: boolean;
}

export interface Parrot extends Bird {
    type: "Parrot";
    canTalk: boolean;
    vocabulary: string[];
}

export interface Duck extends Bird {
    type: "Duck";
    color: string;
}

export type AnimalUnion = Mammal | Bird;

export type MammalUnion = Cat | Dog;

export type BirdUnion = Parrot | Duck;
