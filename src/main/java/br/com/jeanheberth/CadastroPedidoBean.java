/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jeanheberth;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Jean Heberth
 */

@ManagedBean
@ViewScoped
public class CadastroPedidoBean {
    
    private List<Integer> itens;
    
    public  CadastroPedidoBean(){
        itens = new ArrayList<>();
        itens.add(1);
    }
    
    public  List<Integer> getItens(){
        return itens;
    }
    
}
