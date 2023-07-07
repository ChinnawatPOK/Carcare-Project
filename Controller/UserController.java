package com.example.api.Controller;

import com.example.api.Dto.*;
import com.example.api.Model.Privilege;
import com.example.api.Model.User;
import com.example.api.Service.ServiceCustomer;
import com.example.api.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.RenderingResponse;

import java.util.Set;


@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/api/checkRegister")
    public ResponseEntity<?> getCheckRegister(@RequestParam String userLine){
        return userService.checkRegister(userLine);
    }

    @PostMapping("/api/registerLine")
    public ResponseEntity<?> registerWithLine(@RequestBody RegisLineDto regisLineDto){
        try{
            return userService.RegisterWithLine(regisLineDto);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/api/registerEmployee")
    public ResponseEntity<?> registerEmployeeWithAdmin(@RequestBody RegisterByAdminDto registerByAdminDto){
        try{
            return userService.registerWithAdmin(registerByAdminDto);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/api/login")
    public ResponseEntity<?> loginWithUsername(@RequestBody LoginDto loginDto){
        return userService.loginWithUsernamePassword(loginDto);
    }

    @GetMapping("/api/getPrivilege")
    public ResponseEntity<?> getPrivilege(@RequestParam String userId){
        return  userService.getPrivilege(userId);
    }

    @GetMapping("/api/getAllPrivilege")
    public ResponseEntity<?> getAllPrivilege(){
        return userService.getAllPrivilege();
    }

    @GetMapping("/api/getInformationByphone")
    public ResponseEntity<?> gteInformationByUser(@RequestParam String phone){
        return userService.getInformationByPhone(phone);
    }
    @PostMapping("/api/addUserWithOutLine")
    public ResponseEntity<?> addUserWithoutLine(@RequestBody CustomerWithoutLineDto customerWithoutLineDto){
        return userService.addUserWithoutLIne(customerWithoutLineDto);
    }
//    @GetMapping("/api/getQrCodeImageByUser")
//    public ResponseEntity<?> getQrCodeImage(@RequestParam String userId){
//        try {
//            return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(userService.getQrCodeImage(userId));
//        }catch(Exception e){
//            return ResponseEntity.badRequest().body(e.getMessage());
//        }
//    }
    @GetMapping("/api/getCustomerInformationWithQrCodeByUser")
    public ResponseEntity<?> getCustomerInformationWithQrCodeByUser(@RequestParam String userId){
        return userService.getInformationWithQrCodeByUser(userId);
    }
    @GetMapping("/api/getEmpInformationWithQrCodeByUser")
    public ResponseEntity<?> getEmpInformationWithQrCodeByUser(@RequestParam String userId){
        return userService.getEmpInformationWithQrCodeByUser(userId);
    }
    @PutMapping("/api/editPrivilegeUser")
    public ResponseEntity<?> editPrivilegeUser(@RequestBody EditPrivilegeDto editPrivilegeDto){
        return userService.editPrivilegeUser(editPrivilegeDto);
    }
    @PutMapping("/api/editUserStatus")
    public ResponseEntity<?> eitUserStatus(@RequestParam String userId){
        return userService.editUserStatus(userId);
    }
    @PutMapping("/api/editGeneralInformationUser")
    public ResponseEntity<?> editGeneralInformationUser(@RequestBody EditUserInfoDto editUserInfoDto){
        try{
            return userService.editGeneralInformationUser(editUserInfoDto);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @PutMapping("/api/editGeneralInformationCustomer")
    public ResponseEntity<?> editGeneralInformationCustomer(@RequestBody EditCustomerInfoDto editCustomerInfoDto){
        try{
            return userService.editGeneralInformationCustomer(editCustomerInfoDto);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/api/getAllEmployeeWithPrivilege")
    public ResponseEntity<?> getAllEmployeeWithPrivilege(){
        return userService.getAllEmployeeWithPrivilege();
    }

    @GetMapping("/api/getAllPrivileges")
    public ResponseEntity<?> getAllPrivileges(){
        return userService.getAllPrivileges();
    }
    @GetMapping("/api/getAllUser")
    public ResponseEntity<?> getAllUser(@RequestParam String type){
        return userService.getAllUser(type);
    }
    @PutMapping("/api/editStatusOfUser")
    public ResponseEntity<?> editStatusOfUser(@RequestParam String userId,@RequestParam String type){
        return userService.editStatusOfUser(userId,type);
    }
    @GetMapping("/api/getAllEmp")
    public ResponseEntity<?> getAllEmp(){
        return userService.getAllEmpOnly();
    }
}
