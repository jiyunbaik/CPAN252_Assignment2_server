package inventoryService;

import entity.Inventory;

import java.util.List;

public interface InventoryService {

    List<Inventory> getAllInventories();

    void addInventory(Inventory inventory);

    Inventory getInventoryById(Long id);
}