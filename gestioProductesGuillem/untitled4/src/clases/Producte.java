//autor Guillem Ardanuy Martinez


package clases;

public class Producte {
    private int id;
    private String nom;
    private double preu;
    private String tipus;
    private String data_caducitat;
    private String producte_proximitat;
    //geters i setters  --> automatic boto dret generate geteres seters seleccionar els que volem i ok

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getData_caducitat() {
        return data_caducitat;
    }

    public void setData_caducitat(String data_caducitat) {
        this.data_caducitat = data_caducitat;
    }

    public String getProducte_proximitat() {
        return producte_proximitat;
    }

    public void setProducte_proximitat(String producte_proximitat) {
        this.producte_proximitat = producte_proximitat;
    }

    //public producte constructor --> automatic --> boto dret generate --> constructor

    public Producte(int id, String nom, double preu, String tipus, String data_caducitat, String producte_proximitat) {
        this.id = id;
        this.nom = nom;
        this.preu = preu;
        this.tipus = tipus;
        this.data_caducitat = data_caducitat;
        this.producte_proximitat = producte_proximitat;
    }


    //public to string  --> automatic --> boto dret generate --> toString
    @Override
    public String toString() {
        return "Producte{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", preu=" + preu +
                ", tipus=" + tipus +
                ", data_caducitat='" + data_caducitat + '\'' +
                ", producte_proximitat='" + producte_proximitat + '\'' +
                '}';
    }


}
