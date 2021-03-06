package edu.depaul.cdm.se352452group4.groupProject.model.repository;

import edu.depaul.cdm.se352452group4.groupProject.model.entity.InventoryItems;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InventoryItemsRepository extends CrudRepository<InventoryItems, Long> {

    Optional<InventoryItems> findById(int aLong);
    List<InventoryItems> findByInventoryCategory(String category);
}
