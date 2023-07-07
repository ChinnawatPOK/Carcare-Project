package com.example.api.Controller;

import com.example.api.Dto.PaymentDto;
import com.example.api.Dto.ServiceTransactionDto;
import com.example.api.Model.Payment;
import com.example.api.Service.ServiceCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
public class ServiceController {
    @Autowired
    ServiceCustomer serviceCustomer;

    @GetMapping("/api/getChoiceOfService")
    public ResponseEntity<?> getChoiceService(){
        return serviceCustomer.getChoiceService();
    }

    @PostMapping("/api/addServiceCustomer")
    public ResponseEntity<?> addServiceCustomer(@RequestBody ServiceTransactionDto serviceTransactionDto){
        return serviceCustomer.addServiceTransaction(serviceTransactionDto);
    }

    @PostMapping("/api/paymentService")
    public ResponseEntity<?> paymentOfService(@RequestBody PaymentDto paymentDto){
        return serviceCustomer.paymentOfService(paymentDto);

    }

    @DeleteMapping("/api/cancelService")
    public void cancelService(@RequestParam Integer serviceId){
         serviceCustomer.cancelService(serviceId);
    }

    @GetMapping("/api/suggestCarSize")
    public ResponseEntity<?> suggestCarSize(@RequestParam String userId,@RequestParam String licensePlate){
        return serviceCustomer.suggestCarSize(userId,licensePlate);
    }

    @GetMapping("/api/filterCarSize")
    public ResponseEntity<?> filterCarSize(@RequestParam String brand,@RequestParam String model,@RequestParam String text){
        return serviceCustomer.filterCarSize(brand.toUpperCase(),model.toUpperCase(),text.toUpperCase());
    }

    @GetMapping("/api/getPriceOfService")
    public ResponseEntity<?> getPriceOfService(@RequestParam String serviceType,@RequestParam String carSize){
        try{
            return ResponseEntity.ok().body(serviceCustomer.getPriceOfService(serviceType.toUpperCase(),carSize.toUpperCase()));
        }catch(Exception e){
            return new ResponseEntity<String>("ไม่สามารถคำนวณราคาได้", HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/api/getServiceByServiceStatus")
    public ResponseEntity<?> getServiceByServiceStatus(Integer status){
        try{
            return serviceCustomer.getServiceProcessByStatus(status);
        }catch(Exception e){
            return new ResponseEntity<String>("เกิดข้อผิดพลาดไม่สามารถดึงข้อมูลได้",HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/api/getHistoryServiceOfUser")
    public ResponseEntity<?> getHistoryServiceOfUser(@RequestParam String userId, @RequestParam String startDate,@RequestParam String endDate){
        return serviceCustomer.getHistoryServiceOfUser(userId,LocalDate.parse(startDate),LocalDate.parse(endDate));
    }
}
