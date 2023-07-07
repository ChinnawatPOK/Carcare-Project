package com.example.api.Controller;

import com.example.api.Dto.EditServiceTypeDto;
import com.example.api.Dto.WoringGetOutDto;
import com.example.api.Model.ServiceTransaction;
import com.example.api.Service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.ReactiveSortHandlerMethodArgumentResolver;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
public class ManageController {

    @Autowired
    ManagementService managementService;

    @PostMapping("/api/attendanceWork")
    public ResponseEntity<?> attendanceWorking(@RequestParam String input){
        return managementService.attendanceWorking(input);

    }
    @GetMapping("/api/getAllCarDetails")
    public ResponseEntity<?> getAllCarDetails(){
        return managementService.getAllCarSize();
    }

    @PostMapping("/api/getOffWork")
    public ResponseEntity<?> getOffWork(@RequestParam String input){
        return managementService.getOffWorking(input);
    }

    @PutMapping("/api/changeInProcessToFinished")
    public ResponseEntity<?> changeProcessStatus(Integer serviceId){
        return managementService.changeProcessStatus(serviceId);
    }
    @GetMapping("/api/getAllCategory")
    public ResponseEntity<?> getAllCategory(@RequestParam String type){
        return managementService.getAllCategory(type);
    }
    @GetMapping("/api/getAllSupplier")
    public ResponseEntity<?> getAllSupplier(@RequestParam String type){
        return managementService.getAllSupplier(type);
    }
    @PutMapping("/api/editRateConfig")
    public ResponseEntity<?> editRateConfiguration(@RequestParam Integer rateEmp,@RequestParam Integer rateStore){
        return  managementService.editRateConfiguration(rateEmp,rateStore);
    }
    @PutMapping("/api/editServiceType")
    public ResponseEntity<?> editServiceType(@RequestBody EditServiceTypeDto editServiceTypeDto){
        return managementService.editServiceType(editServiceTypeDto);
    }
    @GetMapping("/api/getAllServiceType")
    public  ResponseEntity<?> getAllServiceType(){
        return managementService.getAllServiceType();
    }
    @GetMapping("/api/getConfigPromotionRate")
    public ResponseEntity<?> getConfigPromotionRate(){
    return managementService.getConfigPromotionRate();
    }
    @PostMapping("/api/attendWorking")
    public ResponseEntity<?> attendWorking(@RequestBody WoringGetOutDto req){
        return managementService.attendWorking(req);
    }
    @PutMapping("/api/getOffWorking")
    public ResponseEntity<?> getOffWorking(@RequestBody WoringGetOutDto req){
        return managementService.getOffWorking(req);
    }
    @GetMapping("/api/getHistoryWorking")
    public ResponseEntity<?> getHistoryWorking(@RequestParam String startDate,@RequestParam String endDate,@RequestParam String userId){
        return managementService.getHistoryWorking(LocalDate.parse(startDate).atStartOfDay(),LocalDate.parse(endDate).atStartOfDay().plusDays(1).minusSeconds(1),userId);
    }
    @GetMapping("/api/getQueueInProcess")
    public ResponseEntity<?> getQueueInProcess(){
        return managementService.checkQueueInProcess();
    }
}
