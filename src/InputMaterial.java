import java.time.LocalDate;

public class InputMaterial extends Material {
    private LocalDate dayInputt;
}
    public InputMaterial(Material material, LocalDate dayInputt) {
        this.material = material;
        this.dayInputt = dayInputt;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public LocalDate getDayInputt() {
        return dayInputt;
    }

    public void setDayInputt(LocalDate dayInputt) {
        this.dayInputt = dayInputt;
    }

    @Override
    public String toString() {
        return "InputMaterial{" +
                "material=" + material +
                ", dayInputt=" + dayInputt +
                '}';
    }
}
