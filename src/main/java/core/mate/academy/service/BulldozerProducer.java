package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer("Caterpillar", "White", "Crawler"));
        list.add(new Bulldozer("Shantui", "Gold", "Ripper"));
        list.add(new Bulldozer("John Deere", "Green", "Mulcher"));
        return list;
    }
}