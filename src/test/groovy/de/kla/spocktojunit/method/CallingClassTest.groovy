package de.kla.spocktojunit.method

import spock.lang.Specification

class CallingClassTest extends Specification {

    CallingClass sut;

    void setup() {
        sut = new CallingClass()
    }

    void cleanup() {
    }

    void "someString "() {
        String result = sut.someString()

        expect:
        result == "text"
    }
}
