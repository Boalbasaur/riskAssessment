/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Dominio.FatorRisco;
import java.util.List;

/**
 *
 * @author hugov
 */
public interface FatorDeRiscoRepositorio {
    /**
     * inserts an entity and commits
     *
     * @param entity
     * @return the persisted entity
     */
    public FatorRisco add(FatorRisco entity);

    /**
     * reads an entity given its ID
     *
     * @param id
     * @return
     */
    public FatorRisco findById(Long id);

    /**
     * Returns the List of all entities in the persistence store
     *
     * @return
     */
    public List<FatorRisco> findAll();
}
