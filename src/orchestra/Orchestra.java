package orchestra;

import orchestra.sections.Brass;
import orchestra.sections.Keyboard;
import orchestra.sections.Percussion;
import orchestra.sections.Section;
import orchestra.sections.Strings;
import orchestra.sections.Woodwind;

import java.util.ArrayList;
import java.util.List;

public class Orchestra {
    private List<Section> sections;

    private Orchestra() {
        this.sections = new ArrayList<>();
        this.sections.add(new Strings());
        this.sections.add(new Woodwind());
        this.sections.add(new Brass());
        this.sections.add(new Percussion());
        this.sections.add(new Keyboard());
    }

    private void print() {
        System.out.println("=== Orchestra Members ===");
        System.out.println("Conductor");
        this.sections.forEach(Section::print);
    }

    public static void main(String[] args) {
        Orchestra orchestra = new Orchestra();

        orchestra.print();
    }
}
