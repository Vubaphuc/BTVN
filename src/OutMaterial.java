import java.time.LocalDate;

public class OutMaterial extends Material {
    private LocalDate dayOut;
}

    public OutMaterial(Material material, LocalDate dayOut) {
        this.material = material;
        this.dayOut = dayOut;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public LocalDate getDayOut() {
        return dayOut;
    }

    public void setDayOut(LocalDate dayOut) {
        this.dayOut = dayOut;
    }

    @Override
    public String toString() {
        return "OutMaterial{" +
                "material=" + material +
                ", dayOut=" + dayOut +
                '}';
    }
}
