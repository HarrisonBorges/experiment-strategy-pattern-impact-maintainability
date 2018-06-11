/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.strategyexperiment.dao.experiment;

import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarAtaParticipante;
import com.mycompany.strategyexperiment.dao.experiment.excluir.ExcluirAtaParticipante;
import com.mycompany.strategyexperiment.dao.experiment.listar.ListarAtaParticipante;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarAtaParticipante;

/**
 *
 * @author Harrison
 */
public class AtaParticipanteFullDAOFactory {
  
    public AbstractFullDAO getFullDao() {
        return new AtaParticipanteFullDAO(
                new SalvarAtaParticipante(),
                new ListarAtaParticipante(),
                new BuscarAtaParticipante(),
                new ExcluirAtaParticipante());
    }
}