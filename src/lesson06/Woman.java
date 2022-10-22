package lesson06;

public class Woman extends Human {
    private String eyeColor;

    public Woman(String name, String eyeColor) {
        super(name);
        this.eyeColor = eyeColor;
    }

    public void iAmWoman() {
        System.out.println("W");
    }


    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public String saySmthing() {
        return "Woman";
    }

    @Override
    public String toString() {
        return "Woman{" +
                "eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
