/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

//clase Customer(cliente) con sus atributos y metodos
class Customer {

    //atributos
    private final String name;
    private final String lastname;
    private final String identificacion;
    private final String telefono;
    private final String email;

    //constructor
    public Customer(String name, String lastname, String identificacion, String telefono, String email) {
        this.name = name;
        this.lastname = lastname;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.email = email;
    }

    //metodo toString sobrecargado para mostrar Info del customer(cliente)
    @Override
    public String toString() {
        return "Nombre: " + name + "\n"
                + "Apellido: " + lastname + "\n"
                + "Identificación: " + identificacion + "\n"
                + "Teléfono: " + telefono + "\n"
                + "Email: " + email + "\n";
    }

}
