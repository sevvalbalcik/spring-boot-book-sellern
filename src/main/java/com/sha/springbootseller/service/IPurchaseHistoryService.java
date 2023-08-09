package com.sha.springbootseller.service;

import com.sha.springbootseller.model.PurchaseHistory;
import com.sha.springbootseller.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
