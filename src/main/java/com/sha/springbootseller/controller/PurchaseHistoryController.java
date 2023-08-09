package com.sha.springbootseller.controller;

import com.sha.springbootseller.model.PurchaseHistory;
import com.sha.springbootseller.security.UserPrincipal;
import com.sha.springbootseller.service.IPurchaseHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase-history")
public class PurchaseHistoryController {

    @Autowired
    private IPurchaseHistoryService purchaseHistoryService;

    @PostMapping
    public ResponseEntity<?> savePurchaseHistory(@RequestBody PurchaseHistory purchaseHistory){
        return new ResponseEntity<>(purchaseHistoryService.savePurchaseHistory(purchaseHistory), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllPurchaseOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal){
        return ResponseEntity.ok(purchaseHistoryService.findPurchasedItemsOfUser(userPrincipal.getId()));
    }
}
