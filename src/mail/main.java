/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;

/**
 *
 * @author Rayen
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //from,password,to,subject,message  
        Mailer.send("noreplysahti@gmail.com", "rwtlwppcxycwhwfa", "oueslati.rayen@esprit.tn", "Password reset request ", "passswd :55");

        //change from, password and to 
    }

}
