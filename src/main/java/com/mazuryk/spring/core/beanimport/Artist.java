package com.mazuryk.spring.core.beanimport;

public class Artist {
    private String name;
    private Instruments instrument;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instruments getInstrument() {
        return instrument;
    }

    public void setInstrument(Instruments instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", instrument=" + instrument +
                '}';
    }
}
