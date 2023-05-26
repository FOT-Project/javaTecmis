/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Auth ;

/**
 *
 * @author USER
 */
public class StudentInstance  {
     private static StudentInstance  instance;
    private String username;

    private StudentInstance () {}

    public static StudentInstance  getInstance() {
        if (instance == null) {
            instance = new StudentInstance ();
        }
        return instance;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}