/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hkt;

/**
 *
 * @author duong
 */
public interface ResponseTransformer {
    String render(Object model) throws Exception;
}
