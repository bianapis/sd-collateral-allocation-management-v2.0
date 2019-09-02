package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAllocationUpdateInputModelAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAllocationUpdateInputModel
 */
public class BQAllocationUpdateInputModel   {
  private String collateralAssetAllocationInstanceReference = null;

  private String allocationInstanceReference = null;

  private BQAllocationUpdateInputModelAllocationInstanceRecord allocationInstanceRecord = null;

  private Object allocationUpdateActionTaskRecord = null;

  private String allocationUpdateActionRequest = null;


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
   * Get allocationInstanceRecord
   * @return allocationInstanceRecord
  **/

  public BQAllocationUpdateInputModelAllocationInstanceRecord getAllocationInstanceRecord() {
    return allocationInstanceRecord;
  }

  public void setAllocationInstanceRecord(BQAllocationUpdateInputModelAllocationInstanceRecord allocationInstanceRecord) {
    this.allocationInstanceRecord = allocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return allocationUpdateActionTaskRecord
  **/

  public Object getAllocationUpdateActionTaskRecord() {
    return allocationUpdateActionTaskRecord;
  }

  public void setAllocationUpdateActionTaskRecord(Object allocationUpdateActionTaskRecord) {
    this.allocationUpdateActionTaskRecord = allocationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return allocationUpdateActionRequest
  **/

  public String getAllocationUpdateActionRequest() {
    return allocationUpdateActionRequest;
  }

  public void setAllocationUpdateActionRequest(String allocationUpdateActionRequest) {
    this.allocationUpdateActionRequest = allocationUpdateActionRequest;
  }


}

