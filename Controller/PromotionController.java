package com.example.api.Controller;

import com.example.api.Dto.*;
import com.example.api.Model.Coupon;
import com.example.api.Model.PromotionCollection;
import com.example.api.Model.PromotionContract;
import com.example.api.Service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
public class PromotionController {

    @Autowired
    PromotionService promotionService;

    @PostMapping("/api/verifyCoupon")
    public ResponseEntity<?> verifyCoupon(@RequestBody VerifyCouponDto verifyCouponDto){
        return promotionService.verifyCoupon(verifyCouponDto);
    }

    @GetMapping("/api/getPromotionByUser")
    public ResponseEntity<?> getPromotionByUser(@RequestParam String userId,@RequestParam Integer serviceId){
        return promotionService.getPromotionOfUser(userId,serviceId);
    }

    @GetMapping("/api/getCouponAvailableOfCustomer")
    public ResponseEntity<?> getCouponAvailable(String customerId){
        return promotionService.getCouponByCustomer(customerId);
    }
    @GetMapping("/api/getCouponExpired")
    public ResponseEntity<?> getCouponCustomerExpired(@RequestParam String userId){
        return promotionService.getCouponCustomerExpired(userId);
    }
    @GetMapping("/api/getCouponUsaged")
    public ResponseEntity<?> getCouponUsaged(@RequestParam String userId){
        return promotionService.getCouponUsaged(userId);
    }
    @GetMapping("/api/getCouponByStatusType")
    public ResponseEntity<?> getCouponByStatusAndUser(@RequestParam String userId,@RequestParam String type){
        return promotionService.getCouponByStatusAndUser(userId,type);
    }
    @GetMapping("/api/getCouponUsageDetail")
    public  ResponseEntity<?> getCouponUsageDetail(@RequestParam Integer couponCustomer){
        return promotionService.getCouponUsageDetail(couponCustomer);
    }
//    @GetMapping("/api/generateCouponQrCode")
//    public ResponseEntity<?> generateCouponQrCode(String qrText){
//        return promotionService.generateCouponQrCode(qrText);
//    }
    @GetMapping("/api/getScorePromotion")
    public ResponseEntity<?> getScorePromotion(@RequestParam String userId){
        return promotionService.getScoreOfEachPromotion(userId);

    }
    // CRUD COUPON
    @PostMapping("/api/addCoupon")
    public ResponseEntity<?> addCoupon(@RequestBody Coupon coupon){
        return promotionService.addCoupon(coupon);
    }
    @PutMapping("/api/editCoupon")
    public ResponseEntity<?> editCoupon(@RequestBody Coupon coupon){
        return promotionService.editCoupon(coupon);
    }
    @PutMapping("/api/deleteCoupon")
    public ResponseEntity<?> deleteCoupon(@RequestParam Integer couponId){
        return  promotionService.deleteCoupon(couponId);
    }
    @GetMapping("/api/getCouponById")
    public ResponseEntity<?> getCoupon(@RequestParam Integer coupon){
        return promotionService.getCouponById(coupon);
    }
    @GetMapping("/api/getAllCoupon")
    public ResponseEntity<?> getAllCoupon(@RequestParam String type){
        return promotionService.getAllCouponByType(type);
    }
    // CRUD PROMOTION COLLECTION
    @PostMapping("/api/addPromotionCollection")
    public ResponseEntity<?> addPromotionCollection(@RequestBody PromotionCollectionDto promotionCollection){
        return promotionService.addPromotionCollection(promotionCollection);
    }
    @PutMapping("/api/editPromotionCollection")
    public ResponseEntity<?> editPromotionCollection(@RequestBody EditProCollectionDto editProCollectionDto){
        return promotionService.editPromotionCollection(editProCollectionDto);
    }
    @GetMapping("/api/deletePromotionCollection")
    public ResponseEntity<?> deletePromotionCollection(@RequestParam Integer promoId){
        return promotionService.deletePromotionCollection(promoId);
    }
    @GetMapping("/api/getAllPromotionCustomer")
    public ResponseEntity<?> getAllPromotionCustomer(@RequestParam String type){
        return promotionService.getAllPromotionCollection(type);
    }
    @GetMapping("/api/getPromotionCollection")
    public ResponseEntity<?> getPromotionCollectionById(@RequestParam Integer proId ){
        return promotionService.getPromotionCollectionById(proId);
    }

    // CRUD PROMOTION CONTRACT
    @PutMapping("/api/editPromotionContract")
    public ResponseEntity<?> editPromotionContract(@RequestBody ReqEditProContractDto req){
        return promotionService.editPromotionContract(req);
    }
    @PostMapping("/api/addPromotionContract")
    public ResponseEntity<?> addPromotionContract(@RequestBody ReqAddPromotionContractDto req){
        return promotionService.addPromotionContract(req);
    }
    @GetMapping("/api/getAllPromotionContract")
    public ResponseEntity<?> getAllPromotionContract(@RequestParam String type){
        return promotionService.getAllPromotionContract(type);
    }
    @GetMapping("/api/getPromotionContractById")
    public ResponseEntity<?> getAllPromotionContract(@RequestParam Integer promotionId){
        try{
            return promotionService.getPromotionContractById(promotionId);
        }catch(NoSuchElementException e){
            return new ResponseEntity<String>("ไม่พบรหัสโปรโมชัน", HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping("/api/deletePromotionContract")
    public ResponseEntity<?> deletePromotionContract(@RequestParam Integer promotionId){
        return promotionService.deletePromotionContract(promotionId);
    }
    @PutMapping("/api/editConfigurationPromotion")
    public ResponseEntity<?> editConfigPromotion(@RequestParam String type){
        return promotionService.editConfigPromotion(type);
    }
    @GetMapping("/api/getConfigurationPromotion")
    public Boolean getConfigurationPromotion(){
        return promotionService.getConfigurationPromotion();

    }
    @PostMapping("/api/registerPromotionContract")
    public ResponseEntity<?> registerPromotionContract(@RequestBody RegisterProContractDto req){
        return promotionService.RegisterProContractDto(req);
    }
}
