package com.example.api.Controller;

import com.example.api.Dto.SendLineReportDto;
import com.example.api.Service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
public class ReportController {

    @Autowired
    ReportService reportService;

    @GetMapping("/api/getTransactionServiceOfEmp")
    public ResponseEntity<?> getTransactionServiceOfEmp(@RequestParam String userId,@RequestParam  String startDate,@RequestParam String endDate){
        return reportService.getTransactionServiceOfEmp(userId,LocalDate.parse(startDate),LocalDate.parse(endDate));
    }

    @GetMapping("/api/getReportGraphOfService")
    public ResponseEntity<?> getReportOfService(@RequestParam String startDate,@RequestParam String endDate){
        return reportService.getReportOfService(LocalDate.parse(startDate).atStartOfDay(),LocalDate.parse(endDate).atStartOfDay().plusDays(1).minusSeconds(1));
    }
    @GetMapping("/api/getReportDataOfService")
    public ResponseEntity<?> getReportDataOfService(@RequestParam String startDate,@RequestParam String endDate){
        return reportService.getReportDataOfService(LocalDate.parse(startDate).atStartOfDay(),LocalDate.parse(endDate).atStartOfDay().plusDays(1).minusSeconds(1));
    }
    @GetMapping("/api/getReportGraphEmp")
    public ResponseEntity<?> getReportGraphEmp(@RequestParam String startDate,@RequestParam String endDate){
        return  reportService.getReportGraphEmp(LocalDate.parse(startDate),LocalDate.parse(endDate));
    }
    @GetMapping("/api/getReportDataEmp")
    public  ResponseEntity<?> getReportDataEmp(@RequestParam String startDate,@RequestParam String endDate,@RequestParam String userId){
        return  reportService.getReportDataEmp(LocalDate.parse(startDate),LocalDate.parse(endDate),userId);
    }
    @GetMapping("/api/getGraphInventory")
    public ResponseEntity<?> getGraphInventory(){
        return reportService.getGraphInventory();
    }
    @GetMapping("/api/getDataInventory")
    public ResponseEntity<?> getDataInventory(@RequestParam String category ){
        return reportService.getDataInventory(category);
    }
    @GetMapping("/api/amountPickupInventoryPerMonth")
    public ResponseEntity<?> amountPickupInventoryPerMonth(@RequestParam Integer month,@RequestParam Integer year){
        return reportService.amountPickupInventoryPerMonth(month,year);
    }
    @GetMapping("/api/topGraphCustomer")
    public ResponseEntity<?> topGraphCustomer(){
        return reportService.topGraphCustomer();
    }
    @GetMapping("/api/getGraphNewCustomer")
    public ResponseEntity<?> getGraphNewCustomer(@RequestParam Integer year){
        return reportService.getGraphNewCustomer(year);
    }
    @GetMapping("/api/getPurchaseOfCoupon")
    public  ResponseEntity<?> getPurchaseOfCoupon(@RequestParam Integer year){
        return reportService.getPurchaseOfCoupon(year);
    }
    @GetMapping("/api/getReportTotalCouponAvailable")
    public ResponseEntity<?> getReportTotalCouponAvailable(){
        return reportService.getReportTotalCouponAvailable();
    }
    @GetMapping("/api/getReportPromotionCloseToFull")
    public ResponseEntity<?> getReportPromotionCloseToFull(){
        return  reportService.getReportPromotionCloseToFull();
    }
    @PostMapping("/api/sendLineFromReport")
    public ResponseEntity<?> sendLineFromReport(@RequestBody SendLineReportDto req){
         return reportService.sendLineFromReport(req);
    }
}
