package orchestra;

import orchestra.sections.Section;
import orchestra.sections.Woodwind;

import java.util.ArrayList;
import java.util.List;

public class Orchestra {
    private List<Section> sections;

    private Orchestra() {
        this.sections = new ArrayList<>();
        this.sections.add(new Woodwind());
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
