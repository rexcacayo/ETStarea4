package dam_ed04_actividad;

/*
 * Esta clase se encarga de generar las operaciones que se van a realizar con la cuenta.  
 * @author Ejercio en clase
 * @version 1.0
 *
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
   
     
/**
 * Este método en capsula la variable y permite que solo sea modificada a travez de instaciar la misma.
 * @param cuenta string Variable cuenta
 */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    
/**
 * Este método en capsula la variable y permite que solo sea modificada a través de instaciar la misma.
 * @param saldo double Variable cuenta
 */
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    /**
    * Constructor de la clase.
    * 
    */

    public CCuenta()
    {
    }
    
    
    /**
    * Constructor de la clase, para instacioar la clase y darle valores iniciales ala clase.
    * @param nom string
    * @param cue string
    * @param sal double
    * @param tipo double
    */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
    * Método para asiganar nombre.
    * @param nom string
    * 
    */

    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    
    /**
    * Método para obtener nombre.
    * @return nombre string
    */

    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
    * Método para obtener saldo.
    * @return saldo double
    */

    public double estado()
    {
        return saldo;
    }
    
    /**
    * Método para obtener realizar un ingreso en la cuenta
    * @param cantidad double
    */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
    * Método para realizar un retiro en la cuenta
    * @param cantidad double
    */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /**
    * Método para obtener la cuenta
    * @return cuenta string
    */

    public String obtenerCuenta()
    {
        return cuenta;
    }

    /**
    * Método para obtener el nombre
    * @return nombre string
    */
    
    public String getNombre() {
        return nombre;
    }

  /**
    * Método para asignar el nombre
    * @param nombre string
    */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     /**
    * Método para obtener el nombre
    * @return tipointeres double
    */
    
    public double getTipoInterés() {
        return tipoInterés;
    }
  
  /**
    * Método para asignar el tipo de interes
    * @param  tipoInterés double
    */

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
    * Método para obetner la cuenta
    * @return cuenta string
    */
    
    public String getCuenta() {
        return cuenta;
    }
    
    /**
    * Método para obetner el saldo de la cuenta
    * @return saldo double
    */

    public double getSaldo() {
        return saldo;
    }
}
