package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAllocationInitiateInputModelAllocationInstanceRecord;
import org.bian.dto.BQAllocationInitiateInputModelCollateralAssetAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAllocationInitiateInputModel
 */
public class BQAllocationInitiateInputModel   {
  private BQAllocationInitiateInputModelCollateralAssetAllocationInstanceRecord collateralAssetAllocationInstanceRecord = null;

  private String collateralAssetAllocationInstanceReference = null;

  private Object allocationInitiateActionRecord = null;

  private BQAllocationInitiateInputModelAllocationInstanceRecord allocationInstanceRecord = null;


  /**
   * Get collateralAssetAllocationInstanceRecord
   * @return collateralAssetAllocationInstanceRecord
  **/

  public BQAllocationInitiateInputModelCollateralAssetAllocationInstanceRecord getCollateralAssetAllocationInstanceRecord() {
    return collateralAssetAllocationInstanceRecord;
  }

  public void setCollateralAssetAllocationInstanceRecord(BQAllocationInitiateInputModelCollateralAssetAllocationInstanceRecord collateralAssetAllocationInstanceRecord) {
    this.collateralAssetAllocationInstanceRecord = collateralAssetAllocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Collateral Asset Allocation instance 
   * @return collateralAssetAllocationInstanceReference
  **/

  public String getCollateralAssetAllocationInstanceReference() {
    return collateralAssetAllocationInstanceReference;
  }

  public void setCollateralAssetAllocationInstanceReference(String collateralAssetAllocationInstanceReference) {
    this.collateralAssetAllocationInstanceReference = collateralAssetAllocationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return allocationInitiateActionRecord
  **/

  public Object getAllocationInitiateActionRecord() {
    return allocationInitiateActionRecord;
  }

  public void setAllocationInitiateActionRecord(Object allocationInitiateActionRecord) {
    this.allocationInitiateActionRecord = allocationInitiateActionRecord;
  }


  /**
   * Get allocationInstanceRecord
   * @return allocationInstanceRecord
  **/

  public BQAllocationInitiateInputModelAllocationInstanceRecord getAllocationInstanceRecord() {
    return allocationInstanceRecord;
  }

  public void setAllocationInstanceRecord(BQAllocationInitiateInputModelAllocationInstanceRecord allocationInstanceRecord) {
    this.allocationInstanceRecord = allocationInstanceRecord;
  }


}

