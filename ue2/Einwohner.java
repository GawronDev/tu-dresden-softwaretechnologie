public class Einwohner {
    protected int einkommen;

    public int zuVersteuerndesEinkommen() {
        return einkommen;
    }

    public int steuer() {
        double result = Math.floor(zuVersteuerndesEinkommen() * 0.1);
        return result;
    }

    public void setEinkommen(int einkommen) {
        this.einkommen = einkommen;
    }
}
