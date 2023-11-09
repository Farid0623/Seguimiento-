package Function;

public class Businees {
    private String name;
    private int employees;

    public Business(String name, int employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public int getEmployees() {
        return employees;
    }

    public String getDedication() {
        // Método getDedication() no está definido en tu código original
        // Deberías implementarlo si es necesario
        return "Dedicación de la empresa"; // Esto es solo un ejemplo, ajusta según tu lógica
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }
}
