/**
 * @autor:Carmen Catalina Delgado Manzano 
 * @category:GDS0622
 * @since: 17-03-2024
 */

package mx.utng.evaluacion.model.service;

import java.util.List;

import mx.utng.evaluacion.model.entity.PlanFinanciero;

public interface IPlanFinancieroService {
    List<PlanFinanciero> list();
    void save (PlanFinanciero planfinanciero); 
    PlanFinanciero getById(Long id); 
    void delete (Long id);
}
