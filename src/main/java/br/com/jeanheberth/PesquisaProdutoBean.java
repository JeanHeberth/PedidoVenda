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
 * @author jheberth
 */
@ManagedBean
@ViewScoped
public class PesquisaProdutoBean {

    private List<Integer> produtosFiltrados;

    public PesquisaProdutoBean() {
        produtosFiltrados = new ArrayList<>();

        for(int i = 0; i<50; i++){
            produtosFiltrados.add(i);
        }
    }
    public List<Integer> getprodutosFiltrados(){
        return produtosFiltrados;
    }
 }
