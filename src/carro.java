public class carro {
    //atributos
    private String color;
    private String marca;
    private String placa;
    private String propietario;
    // contructor con parametros predeterminados para su creación
    public carro(String color, String marca, String placa){
        this.color = color;
        this.marca = marca;
        this.placa = placa;
    }
    //Metodos
    public String getColor(){
        return this.color;
    }
    public String getmarca(){
        return this.marca;
    }
    public String getAll(){
        return this.marca + this.color + this.placa;
    }
    public String getPropetario(){
        return this.propietario;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setPropietario(String propetario){
        this.propietario = propetario;
    }

    
}
