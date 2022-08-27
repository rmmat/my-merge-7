package orchestra;

import orchestra.sections.Section;

import java.util.ArrayList;
import java.util.List;

public class Orchestra {
    private List<Section> sections;

    private Orchestra() {
        this.sections = new ArrayList<>();
    }

    private void print() {
        System.out.println("=== Orchestra Members ===");
        this.sections.forEach(Section::print);
    }

    public static void main(String[] args) {
        Orchestra orchestra = new Orchestra();

        orchestra.print();
    }
}
