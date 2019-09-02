package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAllocationControlInputModelAllocationControlActionRequest;

import javax.validation.Valid;
  
/**
 * BQAllocationControlInputModel
 */
public class BQAllocationControlInputModel   {
  private String collateralAssetAllocationInstanceReference = null;

  private String allocationInstanceReference = null;

  private Object allocationControlActionTaskRecord = null;

  private BQAllocationControlInputModelAllocationControlActionRequest allocationControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Allocation instance 
   * @return allocationInstanceReference
  **/

  public String getAllocationInstanceReference() {
    return allocationInstanceReference;
  }

  public void setAllocationInstanceReference(String allocationInstanceReference) {
    this.allocationInstanceReference = allocationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return allocationControlActionTaskRecord
  **/

  public Object getAllocationControlActionTaskRecord() {
    return allocationControlActionTaskRecord;
  }

  public void setAllocationControlActionTaskRecord(Object allocationControlActionTaskRecord) {
    this.allocationControlActionTaskRecord = allocationControlActionTaskRecord;
  }


  /**
   * Get allocationControlActionRequest
   * @return allocationControlActionRequest
  **/

  public BQAllocationControlInputModelAllocationControlActionRequest getAllocationControlActionRequest() {
    return allocationControlActionRequest;
  }

  public void setAllocationControlActionRequest(BQAllocationControlInputModelAllocationControlActionRequest allocationControlActionRequest) {
    this.allocationControlActionRequest = allocationControlActionRequest;
  }


}

