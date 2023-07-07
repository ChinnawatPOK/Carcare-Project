package com.example.api.Controller;

import com.example.api.Dto.*;
import com.example.api.Model.ProductInventory;
import com.example.api.Service.InventoryService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
public class InventoryController {
    @Autowired
    InventoryService inventoryService;

    @GetMapping("/api/getAllProduct")
    public ResponseEntity<?> getAllProduct(@RequestParam String type){
        return inventoryService.getAllProduct(type);
    }

    @GetMapping("/api/getProductById")
    public ResponseEntity<?> getProductById(@RequestParam Integer productId){
        return inventoryService.getProductById(productId);
    }

    @PutMapping("/api/editProductDetail")
    public ResponseEntity<?> editProductDetail(@RequestBody InventoryStockDto inventoryStockDto) {
//        ObjectMapper mapper = new ObjectMapper();
//        InventoryStockDto inventoryStockDto = mapper.readValue(productInventory,InventoryStockDto.class);
        return inventoryService.editProduct(inventoryStockDto);
    }
    @PutMapping("/api/editProductImage")
    public ResponseEntity<?> uploadImage(@RequestParam Integer productId,@RequestParam("file") MultipartFile file){
        return inventoryService.uploadImage(productId,file);
    }
    @PutMapping("/api/editProductStatus")
    public ResponseEntity<?> editProductStatus(@RequestParam Integer productId){
        return inventoryService.changeProductStatus(productId);
    }

    @PostMapping("/api/pickupProduct")
    public ResponseEntity<?> pickupProduct(@RequestBody PickupDto pickupDto){
        return inventoryService.pickupProduct(pickupDto);
    }

    @PostMapping("/api/addProduct")
    public ResponseEntity<?> addProduct(@RequestBody InventoryStockDto product){
//        ObjectMapper mapper = new ObjectMapper();
//        InventoryStockDto productInventoryObj = mapper.readValue(product,InventoryStockDto.class);
        return inventoryService.addProduct(product);
    }
    @GetMapping("/api/pickupHistory")
    public ResponseEntity<?> getPickupHistory(@RequestParam String startDate,
                                              @RequestParam String endDate,
                                              @RequestParam String category){
        return inventoryService.filterHistoryPickup(LocalDate.parse(startDate),LocalDate.parse(endDate),category);
    }
    @PutMapping("/api/editPickup")
    public ResponseEntity<?> editEditPickup(@RequestBody EditPickupDto editPickupDto){
        return inventoryService.editPickup(editPickupDto);
    }
    @DeleteMapping("/api/deletePickup")
    public ResponseEntity<?> deletePickup(@RequestParam Integer pickupId){
        return inventoryService.deletePickup(pickupId);
    }
    @PostMapping("/api/receivedProduct")
    public ResponseEntity<?> receivedProduct(@RequestBody ReceivedDto receivedDto){
        return inventoryService.receivedProduct(receivedDto);
    }

    @DeleteMapping("/api/editReceiveProduct")
    public ResponseEntity<?> editReceiveProduct(@RequestParam Integer receiveId){
        return inventoryService.editReceive(receiveId);
    }

    @GetMapping("/api/getReceivedTransaction")
    public ResponseEntity<?> getReceivedTransaction(){
        return inventoryService.getReceivedTransaction();
    }
    @PostMapping("/api/createOrderProduct")
    public ResponseEntity<?> createOrderProduct(@RequestBody OrderProductDto orderProductDto){
        return  inventoryService.createOrderProduct(orderProductDto);
    }
    @DeleteMapping("/api/deleteOrderProduct")
    public ResponseEntity<?> deleteOrderProduct(Integer orderId){
        return inventoryService.deleteOrderProduct(orderId);
    }
    @GetMapping("/api/getReceivedHistory")
    public ResponseEntity<?> getReceivedHistory(@RequestParam String startDate,@RequestParam String endDate){
        return inventoryService.getReceivedHistory(LocalDate.parse(startDate),LocalDate.parse(endDate));
    }
    @GetMapping("/api/getHistoryOrderProduct")
    public ResponseEntity<?> getHistoryOrder(@RequestParam String startDate,@RequestParam String endDate){
       return inventoryService.getHistoryOrderProduct(LocalDate.parse(startDate),LocalDate.parse(endDate));
    }
}
