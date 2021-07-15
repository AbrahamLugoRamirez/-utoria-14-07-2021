public class VehiculoComercial {
    Vehiculo ve = new Vehiculo();

    public VehiculoComercial(String marcaVC, int codigoVC){
             ve.setMarca(marcaVC);
             ve.setCodigo(codigoVC);
    }

    public void datosVC(){
        System.out.println("La marca del avión comercial es: "+ ve.getMarca());
        System.out.println("El codigo del avión comercial es: "+ ve.getCodigo());
    }
}
