/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca.comissao;

/**
 *
 * @author João
 */
public class App {
    public static void main(String[] args) {
        VendedorComissao vendedor1 = new VendedorComissao(2222, "Fulana", 100000.00, 10.0);
        System.out.println(vendedor1);
        
        System.out.println("--------------------------------");
        
        VendedorComissaoMaisFixo vendedor2 = new VendedorComissaoMaisFixo(1000.00, 333, "Ciclano", 100000.00, 10.0);
        System.out.println(vendedor2);
    }
}
